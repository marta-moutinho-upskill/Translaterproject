package UI;

import Controller.ControllerListarTraducoes;

import java.sql.SQLException;
import java.util.Scanner;

public class UIListarTraducoes {
    Scanner ler = new Scanner(System.in);

    private ControllerListarTraducoes controller;


    public UIListarTraducoes(){
        controller= new ControllerListarTraducoes();
    }

    public void run() throws SQLException {
        System.out.println("Traduções já existentes: ");
    controller.listarTraducoes();
    }

}
