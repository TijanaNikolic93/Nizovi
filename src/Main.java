public class Main {
    public static void main(String[] args) {


        int[] niz = {12, 4, 5, 2, 5};

//NIZOVI BEZ PETLJE

      System.out.println(niz[0]);
      System.out.println(niz[1]);
      System.out.println(niz[2]);
      System.out.println(niz[3]);
      System.out.println(niz[4]);


//NIZOVI SA WHILE PETLJOM

      int j = 0;
      while (j < niz.length) {
          System.out.println(niz[j]);
          j++;
       }


//  NAJVECI CLAN NIZA - varijabla max dobija pocetnu vrednost niza, na osnovu toga u for petlji i dobija vrednost 1, jer je pocetna vrenost iskoricena.
        // i uslov da je i manje od niza. Ako je max manje od niza, u max dodeljujemo niz.

        int max = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (max < niz[i])
                max = niz[i];
        }
        System.out.println("Najveci clan je:" + max);


//  SUMA CLANOVA NIZA

      int sum = 0;
      for (int i = 0; i < niz.length; i++) {
          sum = sum + niz[i];
      }
      System.out.println("Suma clanova niza:" + sum);


//  SREDNJA VREDNOST CLANOVA NIZA

        double sum1 = 0.0;
        double sVrednost = 0.0;
        for (int i = 0; i < niz.length; i++) {
          sum1 = sum1 + niz[i];
          sVrednost = sum1/ niz.length;
        }
        System.out.println("Srednja vrednost:" + sVrednost);

       double sum2 = 0.0;
       for (int i = 0; i < niz.length; i++) {//
          sum2 = sum2 + niz[i];
        }
        System.out.println("Srednja vrednost:" + sum2/niz.length);


}
}