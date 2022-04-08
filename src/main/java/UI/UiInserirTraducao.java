package UI;

import Controller.ControllerInserirTraducao;

import java.sql.SQLException;
import java.util.Scanner;

public class UiInserirTraducao
{
 private ControllerInserirTraducao controller;

 public UiInserirTraducao()
 {
  this.controller = new ControllerInserirTraducao();
 }

 public void run() throws SQLException
 {
  Scanner ler = new Scanner(System.in);

  System.out.println("Escolha a linguagem: ");
  controller.listaLinguagens();
  String linguagem = ler.nextLine();
  //string - exatamaente a plavra  ES

  System.out.println("Escerva a palavra: ");
  String palavra = ler.nextLine(); //algo em pt


  System.out.println("Escerva a tradução: ");
  String traducao = ler.nextLine(); //a traducao na linguagem qu ecoloher

  controller.inserirTraducao(linguagem, palavra, traducao);

 }


}
