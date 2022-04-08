package Controller;

import Model.App;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControllerListarLinguagens
{
 private App app;

 public ControllerListarLinguagens()
 {
  this.app = App.getInstance();
 }

 public void getCountPTWords() throws SQLException
 {
  this.app.getCountPTWords();
 }

 public void test() throws SQLException
 {
  this.app.test();
 }
}
