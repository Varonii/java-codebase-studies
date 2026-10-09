import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double area = 3.14159 * (Math.pow(raio, 2));

        System.out.printf("A área do círculo é: %.4f", area);

    }
}
