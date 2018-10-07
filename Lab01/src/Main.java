public class Main {

    public static int silnia(int Liczba) {
        if(Liczba == 0 || Liczba == 1) return 1;
        else return Liczba * silnia(Liczba -1);
    }

    public static int zad1(int Liczba) {
        int pi = 0;

        for(int i = 3; i < Liczba; i++) {
            pi = pi + silnia(i-2) - i * (silnia(i-2)/i);
        }
        return pi - 1;
    }

    public static void zad2(int Liczba0, int depth) {
        int Liczba1 = 0;
        if(Liczba0 == 1) return;
        if(Liczba0 % 2 == 0) {
            Liczba1 = Liczba0 / 2;
            System.out.println(depth + ", " + Liczba0 + " parzysta, " + Liczba1);
            Liczba0 = Liczba1;
        }
        else if(Liczba0 % 2 != 0) {
             Liczba1 = Liczba0 * 3 + 1;
            System.out.println(depth + ", " + Liczba0 + " nieparzysta, " + Liczba1);
            Liczba0 = Liczba1;

        }
        System.out.println("");
        zad2(Liczba0, depth += 1);
    }

    public static void zad3(int Liczba) {
        int rozwiazania = 0;
        for(int i = 1; i < Liczba -1; i++) {
            for(int j = 1; j < Liczba -1; j++) {
                if(i + j == Liczba && i < j) {
                    rozwiazania++;
                    System.out.println("rozwiazanie: " + i + " + " +j);
                }
            }
        }
        System.out.println("Liczba mozliwych rozwiazan: " + rozwiazania);
    }


    public static void main(String[] args) {

        int MojaLiczba = 10;
        zad3(10);
        //zad2(10, 1);
        //System.out.println("ilosc liczb pierwszych mniejszych lub rownych " + MojaLiczba + " wynosi " + zad1(MojaLiczba));
    }
}
