package UI;

import java.sql.SQLException;
import java.util.Scanner;

public class UIMenu {

    public void run() throws SQLException
    {
        int opcao = -1;

        do{
            opcao = apresentarMenu();

            switch (opcao){
                case 1: {
                    UIInserirLinguagem ui= new UIInserirLinguagem();
                    ui.run();
                    break;
                }

                case 2: {
                    UiInserirTraducao ui = new UiInserirTraducao();
                    ui.run();
                    break;
                }

                case 3:{

                    UIConsultarPalavrasPT ui = new UIConsultarPalavrasPT();
                    ui.run();
                    break;
                }

                case 4:{

                    UIListarTraducoesUi ui = new UIListarTraducoesUi();
                    ui.run();

                    break;
                }
                case 5:{

                    UIListarLinguagens ui = new UIListarLinguagens();
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

        System.out.println("0. Terminar");
        System.out.println("1. Inserir nova linguagem");
        System.out.println("2. Inserir tradução");
        System.out.println("3. Consultar palavras portuguesas");
        System.out.println("4. Listar todas as traduções");
        System.out.println("5. Listar Todas as Linguagens");
        System.out.println("Escolha uma opção:");
        Scanner ler= new Scanner(System.in);
        return ler.nextInt();
    }
}
