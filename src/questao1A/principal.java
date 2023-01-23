package questao1A;
import java.util.Scanner;
public class principal{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("14.17: Elabore um aplicativo que lê uma palavra com cinco letras fornecida pelo usuário e produz cada string possível com três letras que podem ser derivadas das letras dessa palavra. Por exemplo, as palavras de três letras produzidas a partir da palavra “bathe” incluem “ate,” “bat,” “bet,” “tab,” “hat,” “the” e “tea”");
		System.out.println("Escreva uma palavra com 5 letras: ");
		String texto = ler.next();
		if(texto.length() != 5) {
			System.out.println("A palavra nao possui a quantidade de letras requerida de letras:");
			return;
		}
		 char data[] = texto.toCharArray();
	     int tamanho = data.length ;
	     for (int i = 0; i < tamanho; i++) 
	    	 for (int j = 0; j < tamanho; j++) 
		    	 for (int k = 0; k < tamanho; k++) {
		    		 if(!(i == j || j == k || k== i)){
			    		 System.out.print(data[i]); 
			    		 System.out.print(data[j]);
				    	 System.out.print(data[k]); 
				       	 System.out.println("");
		    		 }
				} 
	}
}