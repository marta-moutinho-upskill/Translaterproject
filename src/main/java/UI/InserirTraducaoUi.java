package UI;

import Controller.ControllerInserirTraducao;

import java.sql.SQLException;
import java.util.Scanner;

public class InserirTraducaoUi {
    private ControllerInserirTraducao controller;

    public InserirTraducaoUi(){
        this.controller = new ControllerInserirTraducao();
    }

    public void run() throws SQLException {
        Scanner ler = new Scanner(System.in);
        String traducao = ler.nextLine();
        controller.inserirTraducao(traducao);

        System.out.println("Escolha a linguagem: ");
        controller.listaLinguagens();
    }


}
