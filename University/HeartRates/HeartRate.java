import java.util.Scanner;

public class HeartRates {

    public static void main(String[] args) {

        // 220 - idade em anos

        Scanner input = new Scanner(System.in);

        String nome, sobrenome;
        int idade;
        String FreqMax;

        System.out.println("Digite seu nome: ");
        nome = input.next();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = input.next();
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();

        double Result = Freqcardiaca.FreqMax(idade);
        double Result2 = Freqcardiaca.FreqAlvo(Result);
        double Result3 = Freqcardiaca.FreqAlvo2(Result);

        System.out.println("Seu nome e: " + nome + " " + sobrenome);
        System.out.println("Sua Frequencia maxima e de : " + Result);
        System.out.println("Sua frequencia alvo e entre: " + Result2 + " - " + Result3);

    }

}
