import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RadixSort {
	
	public static void radixSort(int iArr[]) {
		
		// 1- Converte para String stringArray e para intengerArray 
		
        String[] strArray = new String[iArr.length];
        
        for (int i = 0; i < iArr.length; i++) {
            strArray[i] = String.valueOf(iArr[i]);
        }
        
        // 2- Acha o maior numero de digitos e completa com zeros a esquerda
        
        List <String> strings = Arrays.asList(strArray);    
        String longest = strings.stream().
            max(Comparator.comparingInt(String::length)).get();
        int maxLength = longest.length();
        
        for (int i = 0; i < strArray.length; i++) {
        	strArray[i] = String.format("%0"+ maxLength +"d", Integer.parseInt(strArray[i]));
        }
        
        
		
        // 3- Criar 10 listas inicialmente vazias. L0 até L9.
        
        List<String>L0 = new ArrayList<String>();
        List<String>L1 = new ArrayList<String>();
        List<String>L2 = new ArrayList<String>();
        List<String>L3 = new ArrayList<String>();
        List<String>L4 = new ArrayList<String>();
        List<String>L5 = new ArrayList<String>();
        List<String>L6 = new ArrayList<String>();
        List<String>L7 = new ArrayList<String>();
        List<String>L8 = new ArrayList<String>();
        List<String>L9 = new ArrayList<String>();  
        
        System.out.println(Arrays.toString(strArray) +"\n");

        // 4- Percorrer stringsArray[] verificando o ultimo digito e adicionando a lista.
        char digitoAtual;
        String digito;
        
        // k mantém a posição do digito desejado, rotando de forma decrescente
        for (int k = maxLength - 1; k>=0; k--) {  
        	
        	// i mantém a posição do numero que esta sendo analisado na array
	        for (int i=0; i < strArray.length; i++) {
	        
	        	
	        		digitoAtual = strArray[i].charAt(k);
	        		digito = String.valueOf(digitoAtual);
	        	
	        		// atribuição para as listas com base no digito
	        		switch (digito){
		            case "0":
		                L0.add(strArray[i]);
		                break;
		            case "1":
		            	L1.add(strArray[i]);
		                break;
		            case "2":
		            	L2.add(strArray[i]);
		                break; 
		            case "3":
		            	L3.add(strArray[i]);
		                break;
		            case "4":
		            	L4.add(strArray[i]);
		                break; 
		            case "5":
		            	L5.add(strArray[i]);
		                break;
		            case "6":
		            	L6.add(strArray[i]);
		                break; 
		            case "7":
		            	L7.add(strArray[i]);
		                break;
		            case "8":
		            	L8.add(strArray[i]);
		                break; 
		            case "9":
		            	L9.add(strArray[i]);
		                break;
	        	}
	        	}
	        
	        // juntando todas as listas L0, L1.....
	        List<String> s = Stream.of(L0, L1, L2, L3, L4, L5, L6, L7, L8, L9)
	                .flatMap(Collection::stream)
	                .collect(Collectors.toList());
	        strArray = s.toArray(new String[0]);
	        
	        // checa cada iteração para ver a evolução da ordem
	        System.out.println(Arrays.toString(strArray));
	        
	        // limpa as listas pra proxima rodada
	        L0.clear();
	        L1.clear();
	        L2.clear();
	        L3.clear();
	        L4.clear();
	        L5.clear();
	        L6.clear();
	        L7.clear();
	        L8.clear();
	        L9.clear();
	        
	        	}
        System.out.println(Arrays.toString(strArray));
        
        for (int i = 0; i < strArray.length; i++) {
            iArr[i] = Integer.parseInt(strArray[i]);
        }
        
        
	        } 
        	
	
	public static void main(String[] args) {
		int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
		
		radixSort(iArr);
		
		System.out.print("\nResultado ordenado: ");
		for (int i : iArr) {
			System.out.print(i + " ");
		}
	}
}
