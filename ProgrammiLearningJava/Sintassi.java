package ProgrammiLearningJava;

//import java.util.*;

public class Sintassi {
   public static void main(String[] args) {
      /*String stringa = "ciao";
      int numero = 0; // -2,147,483,647 a 2,147,483,647
      double decimale = 2.5;
      char carattere = 'c';
      boolean b = true;

      long numero2 = 2; // ancora piu range dell int

      int[] numeri = new int[3];
      int[] numeri2 = { 2, 4, 6 };

      // -----for normale
      /*
       * for (int i = 0; i < numeri2.length; i++) {
       * 
       * System.out.print(numeri2[i] + " ");
       * 
       * }
       * 
       * //-----for each
       * for (int n : numeri2) {
       * 
       * if (n == 4) {
       * System.out.println("QUATTRO");
       * }
       * 
       * }
       * 
       * //-----while
       * while (numero != 10) {
       * 
       * System.out.println(numero);
       * numero++;
       * 
       * }
       * 
       * //-----scanner
       * 
       * /*Scanner sc = new Scanner(System.in);
       * System.out.println("Come ti chiami?");
       * String nome = sc.nextLine();
       * // String nome = sc.next(); solo fino allo spazio
       * System.out.println("Ciao, " + nome);
       * System.out.println("Quanti anni hai?");
       * int eta = sc.nextInt();
       * sc.nextLine();
       * System.out.println("Ti chiami " + nome + " ed hai " + eta + " anni." );
       * System.out.println("Come si chiama tua madre?");
       * String nomeMamma = sc.nextLine();
       * System.out.println("Tua mamma, si chiama " + nomeMamma);
       */

      // ------list

      /*
       * Scanner sc = new Scanner(System.in);
       * ArrayList<String> listaNomi = new ArrayList<>();
       * 
       * listaNomi.add("Mirco");
       * listaNomi.add("Cesare");
       * listaNomi.add("Giuseppe");
       * 
       * // listaNomi.clear(); // pulisce la lista rimuovendo gli elementi
       * 
       * if(listaNomi.isEmpty()){
       * System.out.println("La lista è vuota");
       * }
       * System.out.println(listaNomi.indexOf("Cesare"));
       * 
       * System.out.println(listaNomi.get(2));
       * 
       * System.out.println(listaNomi.size());
       * 
       * System.out.println(listaNomi);
       * 
       * // listaNomi.remove(1);
       * 
       * System.out.println(listaNomi);
       * 
       * for(int i = 0; i < listaNomi.size(); i++){
       * System.out.println((i + 1) + ". " +listaNomi.get(i));
       * }
       * 
       * System.out.println("Inserisci un nome da cercare nella lista: ");
       * String nomeDaCercare = sc.nextLine();
       * 
       * boolean nomeTrovato = false;
       * for(String ricerca : listaNomi){
       * if(ricerca.equalsIgnoreCase(nomeDaCercare)){
       * 
       * System.out.println("Il nome " + nomeDaCercare + " è presente nella lista.");
       * nomeTrovato = true;
       * }
       * }
       * 
       * if(!nomeTrovato){
       * System.out.println("Il nome " + nomeDaCercare +
       * " non è presente nella lista.");
       * 
       * }
       

      // manovrarsi fra le stringhe

      String nomeCompleto = "V1in1c1en1z2o";
      System.out.println(nomeCompleto.charAt(0));

      for (int i = 0; i < nomeCompleto.length(); i++) {
         System.out.print(nomeCompleto.charAt(i) + " ");
      }
      System.out.println();

      String[] dati = nomeCompleto.split("");
      for(String s : dati){
         System.out.print(s + " ");
      }

      char[] caratteri = nomeCompleto.toCharArray();

       // nomeCompleto = nomeCompleto.replaceAll("\\d+" , ""); regex per rimuovere i numeri
       nomeCompleto = nomeCompleto.replaceAll("[a-zA-Z]+" , ""); 
      System.out.println(nomeCompleto);*/
   }
}
