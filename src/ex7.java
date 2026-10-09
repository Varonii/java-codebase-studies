import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = a * (2 * c);
        circulo = 3.14159 * (Math.pow(c, 2));
        trapezio = (a + b) * c / 2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;

        System.out.println("Triangulo: " + triangulo);
        System.out.println("Circulo: " + circulo);
        System.out.println("Trapezio: " + trapezio);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Retangulo: " + retangulo);
    }
}
