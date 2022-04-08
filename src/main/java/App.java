import java.util.ArrayList;
import java.util.List;

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


}
