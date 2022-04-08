package Controller;

import Model.App;

import java.sql.SQLException;

public class ControllerInserirTraducao {
    private App app;

    public ControllerInserirTraducao(){
        this.app = App.getInstance();
    }

    public void inserirTraducao(String traducao, String listagem, String palavra) throws SQLException {
        app.inserirTraducao(traducao, listagem, palavra);
    }

    public void listaLinguagens() throws SQLException {
        app.test();
    }
}
