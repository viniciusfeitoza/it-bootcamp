/*
Desenvolva um programa para mostrar os primeiros n n˙meros pares,
sendo n um valor que o usu·rio ir· inserir pelo console. Lembre-se
que um n˙mero È par quando divisÌvel por 2.
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros pares quer exibir? ");
        int numero = sc.nextInt();

        for (int i = 1; i<=numero*2; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}