
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

 public void test() throws SQLException
 {
  TesteDBConnectionHandler.test();
 }

 public void inserirTraducao(String traducao) throws SQLException {
  TesteDBConnectionHandler.inserirTraducao(traducao);
 }
}
