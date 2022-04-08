
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
>>>>>>> 0d58bb517a8b0a4fecf2d95345cacb1e9d8b1c65
 public void getCountPTWords() throws SQLException
 {
  TesteDBConnectionHandler.getCountPTWords();
 }

 public void inserirLinguagem(String novaLinguagem) throws SQLException {
  TesteDBConnectionHandler.inserirLinguagem(novaLinguagem);
 }

<<<<<<< HEAD

=======
>>>>>>> 0d58bb517a8b0a4fecf2d95345cacb1e9d8b1c65
 public void test() throws SQLException
 {
  TesteDBConnectionHandler.test();
 }

 public void inserirTraducao(String traducao) throws SQLException {
  TesteDBConnectionHandler.inserirTraducao(traducao);
 }
}
