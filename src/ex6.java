import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo1, codigo2, qtd1, qtd2;
        double preco1, preco2, total;

        codigo1 = sc.nextInt();
        qtd1 = sc.nextInt();
        preco1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        qtd2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = (qtd1 * preco1) + (qtd2 * preco2);
        System.out.printf("TOTAL: R$%.2f%n", total);
    }
}
