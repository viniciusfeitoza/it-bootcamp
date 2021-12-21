/* 
Desenvolva um programa para mostrar os primeiros n n�meros m�ltiplos de m,
sendo n e m valores que o usuário irá inserir via console. Lembre-se que
um número a é divisível por b quando o resto da divisão de a por b é igual a 0.
*/

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String args[]) { 
    Scanner sc= new Scanner(System.in);
    System.out.println("Entre o primeiro numero"); 
    int n = sc.nextInt();
    System.out.println("Entre o segundo numero"); 
    int m = sc.nextInt();
    System.out.println("Esses sao os primeiros " + n + " numeros multiplos de "+ m +":");

    for (int i = 1; i<=n; i++){
      System.out.println(m*i);    
    } 
    sc.close();
  } 
}