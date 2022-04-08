package Controller;

import Model.App;

public class ControllerInserirLinguagem {

    private App app;

    public ControllerInserirLinguagem(){
        this.app= App.getInstance();
    }

    public void inserirLinguagem(String novaLinguagem){
        app.inserirLinguagem(novaLinguagem);
    }
}
