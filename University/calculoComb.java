import java.util.Scanner;

public class CalculoComb {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double kilometro, kmporLitro, kmTotal, litro;

        
            System.out.println("Qual a kilometragem total da viagem :");
            kmTotal = input.nextDouble();
            System.out.println("Quantos litros ira ultilizar: ");
            litro = input.nextDouble();


            kmporLitro = calc.calcula(kmTotal, litro);
        
            System.out.println("Seu veiculo ira fazer :" + kmporLitro + " por litro");
        
    }

}
