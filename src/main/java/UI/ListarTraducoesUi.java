package UI;

import Controller.ControllerListarTraducoes;
import demo_oracle_jdbc.DBConnectionHandler;

import java.util.Scanner;

public class ListarTraducoesUi {
    Scanner ler = new Scanner(System.in);

    private ControllerListarTraducoes controller;


    public ListarTraducoesUi(){
        controller= new ControllerListarTraducoes();
    }

    public void run(){
        System.out.println("Traduções já existentes: ");
        System.out.println(controller.listarTraducoes());
    }

}
