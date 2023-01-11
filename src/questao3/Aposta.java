package questao3;

public class Aposta {
	private Evento evento;
	private float ValorApostado;
	private Resultado Resultado;
	public Aposta() {
		// TODO Auto-generated constructor stub
	}
	public Aposta(Evento evento,  Resultado Resultado, float valor) {
		super();
		this.evento 	   = evento;
		this.ValorApostado = valor;
		this.Resultado 	   = Resultado;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public float getValorApostado() {
		return ValorApostado;
	}
	public void setValorApostado(float valor) {
		this.ValorApostado = valor;
	}
	public Resultado getResultado() {
		return Resultado;
	}
	public void setResultado(Resultado Resultado) {
		this.Resultado = Resultado;
	}
	public double calculaLucro(Evento evento){
		double ganho = 0;
		if (this.getResultado() == evento.getResultado()) {
			if(this.getResultado() == Resultado.TIME1) 
				 ganho = this.ValorApostado * evento.getTime1Win();
			else if(getResultado() == Resultado.TIME2)
				 ganho = this.ValorApostado * evento.getTime02Win();
			else 
				 ganho = this.ValorApostado * evento.getEmpate();
		}
		else {
			ganho = -(this.ValorApostado);
		}
		
		return ganho; 
	}
}
