package questao_adicional;

import java.util.Scanner;

public class TesteCampo {
	private String casa;
	public void obterCampo() {
		
	}
	public void obterBola() {
		
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe os dados do campo(posição, altura e largura)");
		System.out.println("Posicao do eixo X:");
		String PosicaoX = ler.next();
		System.out.println("Posicao do eixo Y:");
		String PosicaoY = ler.next();
		System.out.println("Altura:");
		String Altura 	= ler.next();
		System.out.println("Largura:");
		String Largura 	= ler.next();
		
		System.out.println("Informe os dados da bola(posição, raio e velocidade)");
		System.out.println("Posicao do eixo X:");
		String PosX = ler.next();
		System.out.println("Posicao do eixo Y:");
		String PosY = ler.next();
		System.out.println("Raio:");
		String raio = ler.next();
		System.out.println("Velocidade horizontal:");
		String velHori = ler.next();
		System.out.println("Velocidade vertical:");
		String velVert = ler.next();
		
		PosX.replaceAll(",", ".");
		PosY.replaceAll(",", ".");
		
		ParOrdenado posCenter = new ParOrdenado(Double.parseDouble(PosX)	  , Double.parseDouble(PosY));
		ParOrdenado cordenadas= new ParOrdenado(Double.parseDouble(PosX)	  , Double.parseDouble(PosY));
		ParOrdenado posSupEsq = new ParOrdenado(-Double.parseDouble(Largura)/2, Double.parseDouble(Altura)/2);
		
		Bola 		bola  	  = new Bola(posCenter, Double.parseDouble(velHori), Double.parseDouble(velVert));
		CampoRetangular campo = new CampoRetangular(posSupEsq, Double.parseDouble(Largura), Double.parseDouble(Altura), bola);

		for (int i = 1; i < 31; i++) {
			campo.movimentaBola();
			System.out.println(i + ": " + campo.getBola().toString());
		}
	}

}
