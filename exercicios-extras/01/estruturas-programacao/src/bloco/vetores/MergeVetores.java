package bloco.vetores;

import java.util.Arrays;

public class MergeVetores {

    public static void main (String[] args) {

        String[] a = {"Giovana", "Célia", "Luana", "Pedro", "Bruno", "Jorge", "Mariana"};
        Arrays.sort(a);
        String[] b = {"Zélia", "Alice", "Marcos", "Sônia", "Gustavo", "Carina", "Tiago"};
        Arrays.sort(b);

        String[] c = mergeVetores(a, b);

        System.out.println(Arrays.toString(c));

    }

    static String[] mergeVetores(String[] a, String[] b){

        String[][] array = {a,b};
        String[] merged = new String[a.length+b.length];

        int counter = 0;

        for(String[] s : array){

            Arrays.sort(s);

            for(String c : s){
                merged[counter] = c;
                counter++;
            }
        }

        Arrays.sort(merged);

        return merged;

    }
}
