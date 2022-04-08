package Controller;

import Model.App;

import java.util.List;

public class ControllerListarTraducoes {

    private App app;

    public ControllerListarTraducoes(){
        this.app = App.getInstance();
    }

    public List<String> listarTraducoes() {
        return this.app.getListTranslations;
    }
}
