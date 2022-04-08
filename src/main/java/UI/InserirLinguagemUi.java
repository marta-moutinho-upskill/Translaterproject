package UI;

import java.util.Scanner;

public class InserirLinguagemUi {
    Scanner ler = new Scanner(System.in);

    private InserirLinguagemController controller;


    public InserirLinguagemUi(){
        controller= new InserirLinguagemController();
    }

    public void run(){
        System.out.println("Qual a nova linguagem que quer inserir?");
        String novaLinguagem = ler.nextLine();
        controller.inserirLinguagem(novaLinguagem);
        System.out.println("Linguagem inserida com sucesso.");
    }
}
