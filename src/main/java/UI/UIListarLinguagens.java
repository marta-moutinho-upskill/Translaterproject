package UI;

import Controller.ControllerConsultarPalavrasPT;
import Controller.ControllerListarLinguagens;

import java.sql.SQLException;
import java.util.Scanner;

public class UIListarLinguagens
{
 private ControllerListarLinguagens controller;

 public UIListarLinguagens()
 {
  this.controller = new ControllerListarLinguagens();
 }

 public void run() throws SQLException
 {
  System.out.println("Consultar Palavras Portuguesas");
  System.out.println("Número de traducões para cada palavra portuguesa");
  controller.test();
 }
}
