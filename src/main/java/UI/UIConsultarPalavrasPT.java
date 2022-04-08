package UI;

import Controller.ControllerConsultarPalavrasPT;

import java.sql.SQLException;
import java.util.Scanner;

public class UIConsultarPalavrasPT
{
 private ControllerConsultarPalavrasPT controller;

 public UIConsultarPalavrasPT()
 {
  this.controller = new ControllerConsultarPalavrasPT();
 }

 public void run() throws SQLException
 {
  System.out.println("Consultar Palavras Portuguesas");
  System.out.println("Número de traducões para cada palavra portuguesa");
  controller.getCountPTWords();
  //controller.test();
 }
}
