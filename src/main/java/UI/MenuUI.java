package UI;

import java.util.Scanner;

public class MenuUI {

    public void run() {
        int opcao = -1;

        do{
            opcao = apresentarMenu();

            switch (opcao){
                case 1: {
                    InserirLinguagemUi ui= new InserirLinguagemUi();
                    ui.run();
                    break;
                }

                case 2: {
                    InserirTraducaoUi ui = new InserirTraducaoUi();
                    ui.run();
                    break;
                }

                case 3:{
                    UIConsultarPalavrasPortuguesas ui = new UIConsultarPalavrasPortuguesas();
                    ui.run();
                    break;
                }

                case 4:{
                    ListarTraducoesUi ui = new ListarTraducoesUi();
                    ui.run();
                    break;
                }
                default:
                    break;
            }
        }while(opcao!=0);
        System.out.println("Até breve!");
    }


    private int apresentarMenu(){
        System.out.println("4. Listar todas as traduções");
        System.out.println("3. Consultar palavras portuguesas");
        System.out.println("2. Inserir tradução");
        System.out.println("1. Inserir nova linguagem");
        System.out.println("0. Terminar");
        System.out.println("Escolha uma opção:");
        Scanner ler= new Scanner(System.in);
        return ler.nextInt();
    }
}
