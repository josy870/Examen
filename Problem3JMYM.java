import java.util.Scanner;
public class Problem3JMYM {
String ops = "+";
    String opr = "-";
    String opm = "*";
    String opd = "/";
    String opmo = "%";

    Scanner lt=new Scanner(System.in);
    System.out.println("Escribe el primer número: ");
    double num1=lt.nextDouble();
    
    System.out.println("Escriba la operación a realizar: ");
    Scanner tex=new Scanner(System.in);
    String oper=tex.nextLine();
    
    System.out.println("Escribe el segundo número: ");
    double num2=lt.nextDouble();
    
        
    double suma = num1 + num2;
    double rest = num1 - num2;
    double mult = num1 * num2;
    double div = num1 / num2;
    double modu = num1 % num2;
        
    if(oper.equals(ops)){
     
      System.out.println("El resultado es: " + suma);
      }else if(oper.equals(opr)){
      System.out.println("-------------------");
      System.out.println("El resultado es: " + rest);
      }else if(oper.equals(opm)){
      System.out.println("-------------------");
      System.out.println("El resultado es: " + mult);
      }else if(oper.equals(opd)){
      System.out.println("-------------------");
      System.out.println("El resultado es: " + div);
      }else if(oper.equals(opmo)){
     
      System.out.println("El resultado es: " + modu);
      }else{
      System.out.println("Operador no valido");
      }    
}
