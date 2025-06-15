package ProgrammiLearningJava;

public class Metodi {
    public static void main(String[] args) {

        int[] numeri = { 1, 20, 45, 10, 5, 29 };

        stampaNumeri(numeri);
        int risultato = CalcolatoreNumeriPari(numeri);

        if (risultato != 2) {
            System.out.println("Hai sbagliato.");
        } else {
            System.out.println("Esercizio finito.");
        }

    }

    public static int CalcolatoreNumeriPari(int[] numeri) {
        int contaNumeri = 0;
        for (int i = 0; i < numeri.length; i++) {

            if (numeri[i] % 2 == 0) {
                contaNumeri++;
            }

        }
        return contaNumeri;
    }

    public static void stampaNumeri(int[] numeri) {

        for (int num : numeri) {
            System.out.print(num + " ");
        }
    }

}
