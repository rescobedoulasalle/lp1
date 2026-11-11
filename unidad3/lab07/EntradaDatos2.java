import java.util.Scanner;

public class EntradaDatos2 {
    public static void main(String[] args) {
        Scanner pepito = new Scanner(System.in);

        System.out.print("Ingrese evidencia 1: ");
        int ev1 = pepito.nextInt();
        System.out.print("Ingrese evidencia 2: ");
        int ev2 = pepito.nextInt();
		System.out.print("Ingrese evidencia 3: ");
        int ev3 = pepito.nextInt();
		System.out.print("Ingrese evidencia 4: ");
        int ev4 = pepito.nextInt();
		System.out.print("Examen parcial: ");
        int exp = pepito.nextInt();
		System.out.print("Examen final : ");
        int exf = pepito.nextInt();
        double prom = (ev1*0.1+ev2*0.1+ev3*0.1+ev4*0.1+exp*0.3+exf*0.3);
		System.out.println("Su promedio es : " + prom);
		
        pepito.close();
    }
}