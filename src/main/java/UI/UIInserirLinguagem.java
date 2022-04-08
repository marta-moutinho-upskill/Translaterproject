package UI;

import Controller.ControllerInserirLinguagem;

import java.util.Scanner;


public class UIInserirLinguagem {
    Scanner ler = new Scanner(System.in);


    private ControllerInserirLinguagem controller;

    public UIInserirLinguagem(){
        controller= new ControllerInserirLinguagem();
    }

    public void run(){
        System.out.println("Qual a nova linguagem que quer inserir?");
        String novaLinguagem = ler.nextLine();
        controller.inserirLinguagem(novaLinguagem);
        System.out.println("Linguagem inserida com sucesso.");
    }
}