import java.util.Scanner;

public class Ex06{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Algoritimo para calculara a área do quadrado");

        System.out.println("Informe o valor dos lados do seu quadrado");
        int lado = scanner.nextInt();
        
        int resultado = lado * lado;

        System.out.println("A area do seu quadrado é igual a: " + resultado);
    }
}
