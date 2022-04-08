package UI;

import Model.App;

import java.util.Scanner;

/**
public class InserirLinguagemUi {
    Scanner ler = new Scanner(System.in);

    private App minhaApp;
    private InserirLinguagemController controller;


    public InserirLinguagemUi(App minhaApp){
        this.minhaApp= App.getInstance();
        controller= new InserirLinguagemController(minhaApp);
    }

    public void run(){
        System.out.println("Qual a nova linguagem que quer inserir?");
        String novaLinguagem = ler.nextLine();
        App minhaApp = controller.inserirLinguagem(novaLinguagem);
        System.out.println("Linguagem inserida com sucesso.");
    }
}
*/