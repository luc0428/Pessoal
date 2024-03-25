import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para calcular o perímetro de um quadrado  qualquer");

        System.out.println("Qual é o valor de um dos lados do seu quadrado ?: ");
        int lado = scanner.nextInt();

        double resultado = 4*lado; 

        System.out.println("seu perímetro é " +  resultado);
    }
}