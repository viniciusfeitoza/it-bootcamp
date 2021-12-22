/*
Dado um vetor de 10 posi��es, preenchido pelos valores: 
52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127

Imprima no console:
a) Sua ordena��o crescente.
b) Sua ordena��o decrescente.
*/

import java.util.Collections;
import java.util.Arrays;

public class Exercicio06 {
    public static void main(String args[]) {
		
    	System.out.println("Array inicial: ");
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        System.out.println(Arrays.toString(array));
		
        System.out.println("\nOrdem crescente: ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
		
		System.out.println("\nOrdem decrescente: ");
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}