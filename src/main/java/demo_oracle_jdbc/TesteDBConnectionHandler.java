package demo_oracle_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteDBConnectionHandler {
    DBConnectionHandler dbConnHandler = null;

    public static void main(String[] args) {

        TesteDBConnectionHandler tb = new TesteDBConnectionHandler();

        try {
            String jdbcUrl = "jdbc:oracle:thin:@vsrvbd1.dei.isep.ipp.pt:1521/pdborcl";

            String username = "UPSKILL_BD_TURMA2_07";
            String password = "qwerty";
            
            tb.dbConnHandler = new DBConnectionHandler(jdbcUrl, username, password);
            
            System.out.println("\nEstabelecer a ligação à BD...");
            tb.dbConnHandler.openConnection();
           
            System.out.println("\t... Ligação obtida.");
            
            //invocação dos métodos da classe responsável pela ligação
            /*
            ResultSet res = null;
            System.out.println("Loading Atleta info...All columns");
            res = dbConnHandler.getAllAtleta();
            while (res.next()){
                System.out.println(res.getInt("idAtleta"));
                System.out.println(res.getString("nome"));
                System.out.println(res.getInt("numTelemovel"));
                System.out.println(res.getString("endereco"));
                System.out.println(res.getDate("dataNascimento"));
            }

            System.out.println("Loading Atleta info...Column 1");
            res = dbConnHandler.getInfoAtleta(1);
            while (res.next()){
                System.out.println(res.getInt("idAtleta"));
                System.out.println(res.getString("nome"));
                System.out.println(res.getInt("numTelemovel"));
                System.out.println(res.getString("endereco"));
                System.out.println(res.getDate("dataNascimento"));

            }*/
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            String mensagem = tb.dbConnHandler.closeAll();
            if (!mensagem.isEmpty())
                System.out.println(mensagem);
            System.out.println("\nTerminada a ligação à BD.");
            tb.dbConnHandler.closeAll();
        }
        
    }

}
