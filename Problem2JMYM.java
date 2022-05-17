import java.util.Scanner;
public class Problem2JMYM {
    static Scanner lt=new Scanner(System.in);
public static void main(String[] args) {
//Declarar Variables
        double IGV, precio, descuento, importetotal;
        System.out.println("el monto base:");
        precio = lt.nextDouble();
        IGV = precio*0.18 ;
        
        if (precio>=2000){
            IGV = precio*0.18;
            descuento = precio*0.10;
            importetotal = precio - descuento + IGV;    
        } else if (precio>=1000){
            IGV=precio*0.18;
                descuento = precio*0.05;
                importetotal = precio - descuento + IGV;
        } else if (precio>500){
            IGV=precio*0.18;
                descuento = precio*0.02;
                importetotal = precio - descuento + IGV;
        }else{
            descuento = 0;
            importetotal = 0;
        }

        System.out.println("descuento que correspondiente es:"+descuento);
        System.out.println("IGV de monto base es:"+IGV);
        System.out.println("importe total es de :"+importetotal); 
        }
    }
