import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para Cálculo do Juros Simples");

        System.out.println("Para fazer esse calculo precisamos de algumas informações, tais como:");

        System.out.println("quanto costa o produto a vista? ");
        double Capital = scanner.nextInt();

        System.out.println("quanto é taxa de juros aplicado? ");
        double Juros = scanner.nextInt();

        System.out.println("em quanto meses o juros será aplicado? ");
        double Tempo = scanner.nextInt();

        double JurosDecimal = Juros / 100 ;
        double ValorMes = (Capital / Tempo) * JurosDecimal; 
        double TotalDeJuros = ValorMes * Tempo ;

        System.out.println("Você ira pagar por mês R$" + ValorMes + " em juros e no total irá pagar R$" + TotalDeJuros + " somente em juros");

        double TotalGasto = Capital + TotalDeJuros;
        
        System.out.println("Por fim a total de sua compra deu " + TotalGasto );
    }
}
