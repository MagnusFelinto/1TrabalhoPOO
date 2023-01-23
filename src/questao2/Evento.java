package questao2;

public class Evento {
	
	private String descricao, time01, time02;
	private double time1Win, empate, time02Win;
	private Resultado Resultado;
	
	public double getEmpate() {
		return empate;
	}
	public void setEmpate(double empate) {
		this.empate = empate;
	}
	public Resultado getResultado() {
		return Resultado;
	}
	public void setResultado(Resultado resultado) {
		Resultado = resultado;
	}
	public Evento() {
		// TODO Auto-generated constructor stub
	}
	public Evento(String descricao, String time01, String time02, double time1Win,double empate, double time02Win) {
		super();
		this.descricao = descricao;
		this.time01    = time01;
		this.time02    = time02;
		this.time1Win  = time1Win;
		this.empate    = empate;
		this.time02Win = time02Win;
	}
	public String timeVencedor() {
		String TimeWin="";
		if(this.Resultado == Resultado.TIME1) 
			TimeWin = this.time01;
		else if(this.Resultado == Resultado.TIME2) 
			TimeWin = this.time02;
		else
			TimeWin = "Empate";
		
		return TimeWin;
	}

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getTime01() {
		return time01;
	}


	public void setTime01(String time01) {
		this.time01 = time01;
	}


	public String getTime02() {
		return time02;
	}


	public void setTime02(String time02) {
		this.time02 = time02;
	}


	public double getTime1Win() {
		return time1Win;
	}


	public void setTime1Win(double time1Win) {
		this.time1Win = time1Win;
	}


	public double getTime02Win() {
		return time02Win;
	}


	public void setTime02Win(double time02Win) {
		this.time02Win = time02Win;
	}

}
