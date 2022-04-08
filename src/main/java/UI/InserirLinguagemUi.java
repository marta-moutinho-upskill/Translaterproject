package UI;

import Model.App;

import java.util.Scanner;

/**
public class InserirLinguagemUi {
    Scanner ler = new Scanner(System.in);

    private InserirLinguagemController controller;


<<<<<<< HEAD
    public InserirLinguagemUi(App minhaApp){
        this.minhaApp= App.getInstance();
        controller= new InserirLinguagemController(minhaApp);
=======
    public InserirLinguagemUi(){
        controller= new InserirLinguagemController();
>>>>>>> 5108b9ae5bf317c1cb9afbf64ef91388b8bd4c93
    }

    public void run(){
        System.out.println("Qual a nova linguagem que quer inserir?");
        String novaLinguagem = ler.nextLine();
        controller.inserirLinguagem(novaLinguagem);
        System.out.println("Linguagem inserida com sucesso.");
    }
}
*/