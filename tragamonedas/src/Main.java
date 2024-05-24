import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tragamonedas t1 = new Tragamonedas();
        Scanner scanner = new Scanner(System.in);
        Integer finalBalance = 0;
        String salida = "";
        while (salida == "") {
            finalBalance += t1.play() - 20;
            System.out.println("SIGUIENTE TIRADA --> PRESIONE ENTER");
            System.out.println("ABANDONAR EL JUEGO --> PRESIONE X Y LUEGO ENTER");
            salida = scanner.nextLine();
        }
        System.out.println("BALANCE FINAL: " + finalBalance);
        System.out.println("GRACIAS POR JUGAR, VUELVA PRONTO...");

    }
}