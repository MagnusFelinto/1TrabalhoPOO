package questao_adicional;

import java.util.Random;
import java.util.Scanner;

public class TesteCampo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe os dados do campo(altura e largura)");
		System.out.println("Altura: ");
		String Altura  = ler.next();
		
		System.out.println("Largura: ");
		String Largura = ler.next();
		
		System.out.println("Informe o raio da bola");
		System.out.println("Raio: ");
		String Raio  = ler.next();
		
		ParOrdenado Pos_incial = new ParOrdenado(0, 0);
		
		Random aleatorio = new Random();
		double total = Double.parseDouble(Largura) +Double.parseDouble(Altura);
		double max   = (10*total)/100;
		double min   = (5*total)/100;
		double velo  = aleatorio.nextDouble((max - min) + 1) + min;;
		
		Bola bola 			  = new Bola(Pos_incial, velo, velo);
		CampoRetangular campo = new CampoRetangular(Pos_incial, velo, velo, bola);
		for (int i = 1; i < 31; i++) {
			campo.movimentaBola();
			System.out.println(i + ": " + campo.getBola().toString());
		}
	
	}

}
