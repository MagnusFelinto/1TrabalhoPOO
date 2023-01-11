package br.uern.di.poo.unidade1.construcao;
public class calcular {
	public static double calculaServico(Porta porta){
		final double PORTALUXO 	        =   0.1;
		final double METROINSTACAO      =  70.0;
		final double INSTALACAOPIVOTANTE= 250.0;
		double valorTotal;
		valorTotal =+ porta.getAltura() * porta.getLargura() * METROINSTACAO;
		if(porta.getPivotanteSN() == "S")
			valorTotal =+ INSTALACAOPIVOTANTE;
		if(porta.getTipoPorta() == EspecificarPorta.LUXO)
			valorTotal =+ (PORTALUXO * valorTotal) + valorTotal;
		return valorTotal ;
	}
}