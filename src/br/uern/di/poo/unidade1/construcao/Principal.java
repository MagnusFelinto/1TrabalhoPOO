package br.uern.di.poo.unidade1.construcao;
public class Principal {
	public static void custo(Porta porta){
		double in = calcular.calculaServico(porta);
		System.out.println("Custo da porta: "+Math.round(porta.calculaPreco()));
		System.out.println("Custo de instalacao: "+String.valueOf(in));
	}
	public static void main(String[] args) {
			Porta porta1 = new Porta();
			Porta porta2 = new Porta(EspecificarPorta.PADRAO, 2.8, 1.2, "N");
			Porta porta3 = new Porta(EspecificarPorta.PADRAO, 3,   1.3, "S");
			Porta porta4 = new Porta(EspecificarPorta.LUXO,   3,   1.3, "S");
			System.out.println("Custo da porta 1");
			custo(porta1);
			System.out.println("Custo da porta 2");
			custo(porta2);
			System.out.println("Custo da porta 3");
			custo(porta3);
			System.out.println("Custo da porta 4");
			custo(porta4);
	}
}