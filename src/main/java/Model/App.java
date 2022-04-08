
package Model;


import demo_oracle_jdbc.TesteDBConnectionHandler;

import java.sql.SQLException;

public class App {
 private static App instance = null;

 private App()
 {
//private to make sure no instanciation is done
 }

 public static App getInstance()
 {
  if (instance == null)
  {
   instance = new App();
  }
  return instance;
 }


 public void getCountPTWords() throws SQLException
 {
  TesteDBConnectionHandler.getCountPTWords();
 }

 public void inserirLinguagem(String novaLinguagem) throws SQLException {
  TesteDBConnectionHandler.inserirLinguagem(novaLinguagem);
 }

 public void test() throws SQLException
 {
  TesteDBConnectionHandler.test();
 }

 public void inserirTraducao(String traducao, String listagem, String palavra) throws SQLException {
  TesteDBConnectionHandler.inserirTraducao(traducao, listagem, palavra);
 }
}
