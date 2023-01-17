package questao_adicional;

public class CampoRetangular {
	private ParOrdenado posSuperiorEsquerdo;
	private double comprimento,altura;
	private Bola bola;
	
	public CampoRetangular(ParOrdenado posSuperiorEsquerdo, double comprimento, double altura, Bola bola) {
		super();
		this.posSuperiorEsquerdo = posSuperiorEsquerdo;
		this.comprimento 		 = comprimento;
		this.altura  	 		 = altura;
		this.bola 		 		 = bola;
	}

	public ParOrdenado getPosSuperiorEsquerdo() {
		return posSuperiorEsquerdo;
	}

	public double getComprimento() {
		return comprimento;
	}

	public double getAltura() {
		return altura;
	}
	
	public Bola getBola() {
		return bola;
	}

	public boolean tocouSuperior() {
		if(altura/2 <= bola.getPosicao().getY()+ bola.getRaio())
			return true;
		return false;
	}
	public boolean tocouInferior() {
		if(-altura/2 >= bola.getPosicao().getY()+ bola.getRaio())
			return true;
		return false;
	}
	public boolean tocouEsquerda() {
		if(-comprimento/2 >= bola.getPosicao().getX()+ bola.getRaio())
			return true;
		return false;
	}
	public boolean tocouDireita() {
		if(comprimento/2 <= bola.getPosicao().getX()+ bola.getRaio())
			return true;
		return false;
	}
	public void movimentaBola() {
		if(tocouSuperior()){
			bola.setVel_vert(-1 * bola.getVel_vert());
		}
		else if(tocouInferior()){
			bola.setVel_vert(-1 * bola.getVel_vert());
		}
		else if(tocouEsquerda()){
			bola.setVel_hori(-1 * bola.getVel_hori());
		}
		else if(tocouDireita()){
			bola.setVel_hori(-1 * bola.getVel_hori());
		}
		bola.movimenta();
	}
}
