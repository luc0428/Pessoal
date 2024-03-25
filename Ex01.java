import java.util.Scanner;
import java.lang.Math;



public class Ex01 {
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Programa para raiz cúbica");

            System.out.println("dígite o número que deseja saber a raiz cubica: ");
            int entrada = scanner.nextInt();

            double  resultado = Math.cbrt(entrada);

            System.out.println("a raiz cubica é " +  resultado);
        }
    }
