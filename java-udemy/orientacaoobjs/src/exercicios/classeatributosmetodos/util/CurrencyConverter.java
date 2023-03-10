package exercicios.classeatributosmetodos.util;

import com.sun.source.tree.InstanceOfTree;
import java.io.IOError;

public class CurrencyConverter {

  public static double IOF = 0.06;

  public static double dolarToReal(double amount, double dolarPrice){
    return amount * dolarPrice *( 1.0 + IOF);
  }

}
