package UI;

import Controller.ControllerListarTraducoes;

import java.util.Scanner;

public class UIListarTraducoesUi {
    Scanner ler = new Scanner(System.in);

    private ControllerListarTraducoes controller;


    public UIListarTraducoesUi(){
        controller= new ControllerListarTraducoes();
    }

    public void run(){
        System.out.println("Traduções já existentes: ");
        System.out.println(controller.listarTraducoes());
    }

}
