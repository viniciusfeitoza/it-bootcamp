/* 
Desenvolva um programa para mostrar no console os primeiros n n�meros
primos entre 1 e m, sendo m um valor que o usu�rio ir� inserir pelo console.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count;

        System.out.println("Entre o valor que deseja verificar: ");
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++){
            count = 0;
            for (int j=1; j<=i; j++){
                if(i % j ==0){
                    count+=1;
                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }
        sc.close();
    }
}