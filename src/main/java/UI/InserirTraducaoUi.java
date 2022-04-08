package UI;

import Controller.ControllerInserirTraducao;

import java.sql.SQLException;
import java.util.Scanner;

public class InserirTraducaoUi
{
 private ControllerInserirTraducao controller;

 public InserirTraducaoUi()
 {
  this.controller = new ControllerInserirTraducao();
 }

 public void run() throws SQLException
 {
  Scanner ler = new Scanner(System.in);
  System.out.println("Escolha a linguagem: ");
  controller.listaLinguagens();
  //string - exatamaente a plavra  ES

  System.out.println("Escerva a pala");
  String palavra = ler.nextLine(); //algo em pt


  System.out.println("Escerva a pala");
  String traducao = ler.nextLine(); //a traducao na linguagem qu ecoloher

  controller.inserirTraducao(traducao);


 }


}
