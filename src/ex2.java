import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.println("Soma: " + soma);
    }
}
