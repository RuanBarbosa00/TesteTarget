import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        int numero, fib1 = 0, fib2 = 1, fibonacci = 0;
        boolean pertence = false;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        numero = entrada.nextInt();

        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {
            while (fibonacci < numero) {
                fibonacci = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibonacci;
            }

            if (fibonacci == numero) {
                pertence = true;
            }
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
