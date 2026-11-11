import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner pepito = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = pepito.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = pepito.nextInt();

        System.out.println("Hola " + nombre);
        System.out.println("Tu edad es " + edad);

        pepito.close();
    }
}