public class Main {

    public static int silnia(int Liczba) {
        if(Liczba == 0 || Liczba == 1) return 1;
        else return Liczba * silnia(Liczba -1);
    }

    public static int Funkcja(int Liczba) {
        int pi = 0;

        for(int i = 3; i < Liczba; i++) {
            pi = pi + silnia(i-2) - i * (silnia(i-2)/i);
        }
        return pi -1;
    }


    public static void main(String[] args) {

        int MojaLiczba = 10;
        System.out.println("ilosc liczb pierwszych mniejszych lub rownych " + MojaLiczba + " wynosi " + Funkcja(MojaLiczba));
    }
}
