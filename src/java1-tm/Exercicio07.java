/*
Em 2021 uma startup de tecnologia, denominada de �Empresa X� � avaliada
em R$ 1,13 milh�o e possui uma m�dia de crescimento anual de 148%. Uma
concorrente do ramo, �Empresa Y�, � avaliada em R$ 18,4 milh�es e com sua 
m�dia de crescimento anual em 32%.

Considerando este cen�rio, imprima no console (conforme formata��o acima) a 
evolu��o anual at� que a empresa X ultrapasse a empresa Y em seu valor de mercado.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class Exercicio07 {
    public static void main(String args[]) {
    	
        double x = 1.13;
        double y = 18.4;
    	
        // Data e formata��o
        LocalDate date = LocalDate.of(2021, 1, 1);
        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#.#");


		// Estado atual das empresas
        System.out.println(" Empresa X - " + date.format(formatadorBarra) + " - Valor da empresa: " + df.format(x) + "m");
        System.out.println(" Empresa Y - " + date.format(formatadorBarra) + " - Valor da empresa: " + df.format(y) + "m \n");

        
		// Progresso anual
        for(int i=1; x<=y;i++){
            y = y+((32 * y) / 100);
            x = x+((148 * x) / 100); 
            System.out.println(" Empresa X - " + date.plusYears(i).format(formatadorBarra) + " - Valor da empresa: " + df.format(x) + "m");
            System.out.println(" Empresa Y - " + date.plusYears(i).format(formatadorBarra) + " - Valor da empresa: " + df.format(y) + "m \n");
        }
    }
}
