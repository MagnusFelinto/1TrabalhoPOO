package questao2;
public class UERNBet {
	public static void efetuarJogo(Evento ev, Resultado resut) {
		System.out.println("O jogo "+ev.getDescricao()+" os times que iram joga seram "+ev.getTime01()+" vs "+ev.getTime02());
		ev.setResultado(resut);
		System.out.println("Time vencedor "+ev.timeVencedor());
	}
	public static void resultadoDaAposta(Aposta ap, Evento ev) {
		if(ap.getResultado() == ev.getResultado())
			 System.out.println("O apostador ganhou R$ " +
				 ap.calculaLucro(ev));
		 else
			 System.out.println("O apostador perdeu R$ " + 
		                 ap.getValorApostado());
	}
	public static void main(String[] args) {
		 Evento quartasFinal1 = new Evento("Quartas de final da copa do mundo",
		   		"Brasil", "Croácia", 1.18, 1.8, 2.5);
		 Evento quartasFinal2 = new Evento ("Quartas de final da copa do mundo",
		   		"Argentina", "Holanda", 1.4, 1.5, 1.9);
		 Aposta aposta1 = new Aposta(quartasFinal1, Resultado.TIME1, 1000);
		 Aposta aposta3 = new Aposta(quartasFinal2, Resultado.TIME2,  800);
		 efetuarJogo(quartasFinal1,Resultado.TIME1);
		 resultadoDaAposta(aposta1,quartasFinal1);
		 efetuarJogo(quartasFinal2,Resultado.TIME1);
		 resultadoDaAposta(aposta3,quartasFinal2);
		 Evento semifinal1 = new Evento ("Semifinal da copa do mundo", quartasFinal1.timeVencedor(), 
				 						  quartasFinal2.timeVencedor(), 1.4, 1.5, 1.9);
		 Aposta aposta2 = new Aposta(semifinal1, Resultado.TIME1, 400);
		 efetuarJogo(semifinal1,Resultado.TIME1);
		 resultadoDaAposta(aposta2,semifinal1);
	}
}