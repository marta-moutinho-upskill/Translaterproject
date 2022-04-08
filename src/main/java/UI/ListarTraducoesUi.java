package UI;

import demo_oracle_jdbc.DBConnectionHandler;

import java.util.Scanner;

public class ListarTraducoesUi {
    Scanner ler = new Scanner(System.in);

    private ListarTraducoesController controller;


    public ListarTraducoesUi(){
        controller= new ListarTraducoesController();
    }

    public void run(){
        System.out.println("Traduções já existentes: ");
        System.out.println(controller.listarTraducoes);
    }

}
