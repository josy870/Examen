public class Problem4JMYM {

    public static void imprimirVacuna_A() {
        int numInit=70;
        while (numInit<=70) {
            System.out.println(numInit);
            numInit=numInit+1;

        }
    }
    public static void imprimirVacuna_B() {
        int numInit=16;
        do{
            System.out.println(numInit);
            numInit=numInit+1;
        } while (numInit<=69);
    }
    
    public static void imprimirVacuna_C() {
        for (int numInit=1; numInit<=16; numInit++){
            System.out.println(numInit);
        }
    }
    public static void main(String[] args) {
        System.out.println("While");
        imprimirVacuna_A();
        System.out.println("Do while");
        imprimirVacuna_B();
        System.out.println("For:");
        imprimirVacuna_C();
    }
        
}
