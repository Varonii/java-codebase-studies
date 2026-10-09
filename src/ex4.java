import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, Diferenca;

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        D = sc.nextInt();

        Diferenca = (A * B - C * D);

        System.out.println("Diferença: " + Diferenca);
    }
}
