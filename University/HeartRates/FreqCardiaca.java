public class Freqcardiaca {
    public static double FreqMax(int x) {
        double FreqMaxima;

        FreqMaxima = 220 - x;

        return FreqMaxima;
    }

    public static double FreqAlvo(double x) {
        double Fr1;

        Fr1 = x * 0.5;
        return Fr1;
    }

    public static double FreqAlvo2(double x) {
        double Fr2;

        Fr2 = x * 0.85;

        return Fr2;
    }
}
