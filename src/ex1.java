import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double l = sc.nextDouble();
        System.out.print("Digite o comprimento: ");
        double c = sc.nextDouble();
        System.out.print("Digite o valor do m2: ");
        double valor = sc.nextDouble();

        double Area = l * c;
        double Preco = Area * valor;

        System.out.println("---- Dados -----");
        System.out.printf("Largura: %.1f%n", l);
        System.out.printf("Comprimento: %.1f%n", c);
        System.out.printf("Valor do m2: %.2f%n", valor);
        System.out.println("----------------------");
        System.out.printf("Area total: %.2f%n", Area);
        System.out.printf("Valor Final: %.2f%n", Preco);

        sc.close();
    }
}