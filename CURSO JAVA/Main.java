import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
/*       // Numeros inteiros = 100, 234345, 255, 120, 1, 9218730283798213
         byte => 8 bits => -128 a 127
         short => 16 bits => -32.768 a 32.767
         int => 32 bites => -2.147.483.648 a 2.147.483.647
         long => 64 bites => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

         // Numeros decimais = 1.2, 3.4, 5.6, 7.8, 9.0
         //5.50
         float => 32 bits => precisão simples
         double => 64 bits> precisão dupla

         //String usar "" aspas duplas e char usar '' aspas simples
         String => representar palavras e frases
         char => representar um unico caractere => a, b, c, d
         char meuChar ='a';
         meuChar = "Pedro"; // da erro

         boolean => true ou false
         */

        byte b = 100;
        short s = 10000;
/*       int i = 100000;                  */
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Pedro";
        boolean bool = true;

        String[] nomesArr = new String[11];

        nomesArr[1] = "Alex";

        nomesArr[4] = "Rodolfeta";

        nomesArr[8] = "Juliao";

        nomesArr[10] = "Depinho";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Metalica");
        nomes.add("Abdalla");
        nomes.add("Cabelo");

/*        System.out.println(nomes.get(1));

        nomes.remove(1);
        nomes.remove("Abdalla");

        System.out.println(nomes.get(1)); */

/*        for (int meuInterador = 0; meuInterador < nomesArr.length; meuInterador++){
            System.out.println(nomesArr[meuInterador]);
        }*/

        for (String nome : nomesArr){
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Estou no while");
            contador++;
        }



    }
}


