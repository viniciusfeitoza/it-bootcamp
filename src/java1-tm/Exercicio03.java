/*
Desenvolva um programa para informar se um um número n é primo ou não,
sendo n um valor que o usuário irá inserir pelo console. Lembre-se que
um número é primo quando só é divisível por 1 e por si mesmo.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Entre o numero que quer verificar: ");
        int n = sc.nextInt();
        
        for (int i = 1; i<=n; i++){
            if (n % i == 0){
                count+=1;
            }
        }

        if (count == 2){
            System.out.println("O numero " + n + " SIM eh primo.");
        }else{
            System.out.println("O numero " + n + " NAO eh primo.");
        }
        sc.close();
    }
}
