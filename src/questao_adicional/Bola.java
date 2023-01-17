package questao_adicional;

public class Bola {

	private ParOrdenado posicao;
	private double vel_hori, vel_vert;
	final private double raio = 2.5;
	
	public Bola(ParOrdenado posCenter, double vel_hori, double vel_vert) {
		super();
		this.posicao 	= posCenter;
		this.vel_hori 	= vel_hori;
		this.vel_vert 	= vel_vert;
	}
	
	public void movimenta(){
		posicao.setX(posicao.getX() + vel_hori);
		posicao.setY(posicao.getY() + vel_vert);

	}
	
	@Override
	public String toString() {
		return "A bola está na posição " +this.posicao.toString()+ " se movendo a uma velocidade ("+(vel_hori)+","+(vel_vert)+") pixels por movimento";
	}

	public ParOrdenado getPosicao() {
		return posicao;
	}

	public double getRaio() {
		return raio;
	}

	public double getVel_hori() {
		return vel_hori;
	}

	public void setVel_hori(double vel_hori) {
		this.vel_hori = vel_hori;
	}

	public double getVel_vert() {
		return vel_vert;
	}

	public void setVel_vert(double vel_vert) {
		this.vel_vert = vel_vert;
	}
		
}
