import java.util.Scanner;
/**
 * Problem1JMYM
 */
public class Problem1JMYM {
static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        // Definir Variables 
        double NotaExaCon, NotaEnPer, NotaPsi;
        String n;
        System.out.println("Examen de Conocimient");
        NotaExaCon=lt.nextDouble();
        System.out.println("Entrevista Personal");
        NotaEnPer=lt.nextDouble();
        System.out.println("Examen de Psicologia");
        NotaPsi=lt.nextDouble();
        //Proceso
        double puntajeEC = (NotaExaCon * 0.40);
        double puntajeEP = (NotaEnPer * 0.35);
        double puntajeTP = (NotaPsi * 0.25);
        double promedio = (puntajeEC + puntajeEP + puntajeTP);
    
        if (promedio>=17 && promedio<=20) {
            n="Su nivel es 4";
        } else if(promedio<17 && promedio>=14){
            n="Su nivel es 3";
        } else if(promedio<14 && promedio>=11){
            n="Su nivel es 2";
        } else if(promedio<11){
            n="Su nivel es 1 y No puede obtener vacante";
        } else {
            n="Notas no validas coloque las notas en la escala vigesimal";
        }
        // Datos de Salida
        System.out.println(n);
        
    }
    }