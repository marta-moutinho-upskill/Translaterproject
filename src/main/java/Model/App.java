
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

<<<<<<< HEAD
=======
 public void getCountPTWords() throws SQLException
 {
  TesteDBConnectionHandler.getCountPTWords();
 }

 public void inserirLinguagem(String novaLinguagem) throws SQLException {
  TesteDBConnectionHandler.inserirLinguagem(novaLinguagem);
 }

>>>>>>> 4c7d9904143169b81634ef31b13b6df92d91ca93
 public void test() throws SQLException
 {
  TesteDBConnectionHandler.test();
 }

 public void inserirTraducao(String traducao) throws SQLException {
  TesteDBConnectionHandler.inserirTraducao(traducao);
 }
}
