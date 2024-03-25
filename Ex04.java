import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para converter celsius para Fahrenheit");

        System.out.println("qual o valor de graus celsius ?: ");
        int celsius = scanner.nextInt();

        double resultado = (celsius * 1.8) + 32; 

        System.out.println("A conversão de " +  resultado + "Fahrenheit");
    }
}