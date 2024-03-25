import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para calcular o perímetro de um retângulo qualquer");

        System.out.println("Qual a base do seu retângulo?: ");
        int base = scanner.nextInt();

        System.out.println("Qual a altura do seu retângulo?: ");
        int altura = scanner.nextInt();

        double resultado = 2*(base+altura); 

        System.out.println("seu perímetro é " +  resultado);
    }
}