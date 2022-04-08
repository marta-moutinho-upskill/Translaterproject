package Controller;

import Model.App;

import java.sql.SQLException;

public class ControllerInserirLinguagem {

    private App app;

    public ControllerInserirLinguagem(){
        this.app= App.getInstance();
    }

    public void inserirLinguagem(String novaLinguagem) throws SQLException {
        app.inserirLinguagem(novaLinguagem);
    }
}
