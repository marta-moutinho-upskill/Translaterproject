package demo_oracle_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class DBConnectionHandler {

    private String jdbcUrl;
    private String username;
    private String password;

    private Connection connection;
    private PreparedStatement prepStmt;
    private Statement stmt;
    private ResultSet rSet;

    public DBConnectionHandler(String jdbcUrl, String username, String password) throws SQLException
    {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;

        OracleDataSource ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        connection = ds.getConnection(username, password);

        prepStmt = null;
        rSet = null;
        stmt = null;
    }

    public void openConnection() throws SQLException {
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        connection = ds.getConnection(username, password);
    }

    public String closeAll() {

        StringBuilder message = new StringBuilder("");

        if (rSet != null) {
            try {
                rSet.close();
            } catch (SQLException ex) {
                message.append(ex.getMessage());
                message.append("\n");
            }
            rSet = null;
        }

        if (prepStmt != null) {
            try {
                prepStmt.close();
            } catch (SQLException ex) {
                message.append(ex.getMessage());
                message.append("\n");
            }
            prepStmt = null;
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                message.append(ex.getMessage());
                message.append("\n");
            }
            prepStmt = null;
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                message.append(ex.getMessage());
                message.append("\n");
            }
            connection = null;
        }
        return message.toString();
    }
    //incluir métodos para executar query
    public ResultSet getAllAtleta() throws SQLException{
        //prepStmt = connection.prepareStatement("select * from Atleta where idAtleta = ?");
        stmt = connection.createStatement();

        return stmt.executeQuery("select * from Atleta\norder by 1"); //"select * from Atleta order by 1"
    }

    public ResultSet getCountPTWords() throws SQLException{
        //prepStmt = connection.prepareStatement("select * from Atleta where idAtleta = ?");
        stmt = connection.createStatement();

        return stmt.executeQuery("select t.languageid, t.titulo,\n" +
                "(\n" +
                "select count(distinct l.language)\n" +
                "from Languages l\n" +
                "where l.language = t.languageid\n" +
                ") \"nrTraduções\"\n" +
                "from TranslaterData t");
    }

    public ResultSet test() throws SQLException{
        //prepStmt = connection.prepareStatement("select * from Atleta where idAtleta = ?");
        stmt = connection.createStatement();

        return stmt.executeQuery("select * from Languages");
    }


    //incluir métodos para executar query
    public ResultSet listarTraducoes() throws SQLException{
        prepStmt = connection.prepareStatement("select * from Titulo");
        stmt = connection.createStatement();

        return stmt.executeQuery("select * from Titulo");
    }

    public ResultSet inserirLinguagem(String novaLinguagem) throws SQLException{
        stmt = connection.createStatement();

        return stmt.executeQuery("alter table Languages add " + novaLinguagem+ " varchar(20)");
    }

}
