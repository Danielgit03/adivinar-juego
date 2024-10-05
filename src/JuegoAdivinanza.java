import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Random random = new Random();
        int maximo =100;
        int numeroSecreto = random.nextInt(maximo) + 1;
        
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int intentos_permitidos=10;
        int indice=1;


        System.out.println("Adivina el número entre 1 y " + maximo + " Tienes 10 intentos");

        while (intentos < intentos_permitidos) {
            System.out.print("Intento " + (intentos + indice) + ": ");
            int adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza == numeroSecreto) {
                System.out.println("¡Correcto! Lo adivinaste en " + intentos + " intentos.");
                break;
            } else if (adivinanza < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }

            if (intentos == intentos_permitidos) {
                System.out.println("Se acabaron los intentos. El número era " + numeroSecreto);
                System.out.println("El número secreto era: " + numeroSecreto);
            }
        }

        scanner.close();
    }
}
