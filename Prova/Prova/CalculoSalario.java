package Prova;
import java.util.Scanner;





public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Salario[] salarios = new Salario[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d salário  " + (i + 1) + ": ");
            double salarioBruto = scanner.nextDouble();
            salarios[i] = new Salario(salarioBruto);
        }

        for (int i = 0; i < 5; i++) {
            Salario salario = salarios[i];
            double salarioBruto = salario.getSalarioBruto();
            double inss = salario.getINSS();
            double ir = salario.getIR();
            double salarioLiquido = salario.calcularSalarioLiquido();

            System.out.println("\n%d Salario " + (i + 1) + ":");
            System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
            System.out.printf("Desconto INSS: R$ %.2f%n", inss);
            System.out.printf("Desconto IR: R$ %.2f%n", ir);
            System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
        }

        scanner.close();
    }
}
