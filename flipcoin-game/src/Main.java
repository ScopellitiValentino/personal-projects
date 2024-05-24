public class Main {
    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        Integer caras = 0;
        Integer cruces = 0;
        Integer monto = 0;
        while (caras != 3 && cruces != 3) {
           String resultado = moneda.tirar();
           if (resultado == "Cruz") {
               cruces+=1;
               caras=0;
               monto++;}
           else if (resultado == "Cara") {
               cruces=0;
               caras+=1;
               monto++;}
        }
        System.out.println("Has gastado " + monto + " dolares, y has ganado 8 dolares");
    }
}