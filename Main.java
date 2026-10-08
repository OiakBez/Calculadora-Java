import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean loop = true;

        while (loop == true) {

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Opções da calculadora:");
            System.out.println("Adição 1.");
            System.out.println("Subtração 2.");
            System.out.println("Multiplicação 3.");
            System.out.println("Divisão 4.");

            System.out.print("Escolha a opção de cálculo (1, 2, 3, 4): ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                double resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 2) {
                double resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 3) {
                double resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);

            } else if (opcao == 4) {
                if (num2 == 0) {
                    System.out.println("Error, divisão por zero.");
                } else {
                    double resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
            } else {
                System.out.println("Error.");
            }

            System.out.print("Deseja continuar a calculadora? (sim/não)");
            scanner.nextLine();

            String continuar = scanner.nextLine();

            if (!continuar.equals("sim")) {
                loop = false;
                scanner.close();
            }
        }
    }
}