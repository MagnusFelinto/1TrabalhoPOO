package br.uern.di.poo.unidade1.construcao;
public class Porta {
	private EspecificarPorta tipoPorta;
	private double altura;
	private double largura;
	private String pivotanteSN;
	final private double sePivotante   = 350.00;
	final private double alturaPadrao  = 1.8;
	final private double larguraPadrao = 0.7;
	public Porta() {
		this.tipoPorta = EspecificarPorta.SIMPLES;
		this.altura  =  alturaPadrao;
		this.largura = larguraPadrao;
		this.pivotanteSN = "N";
	}
	public Porta(EspecificarPorta tipoPorta, double altura, double largura, String pivotanteSN) {
		super();
		this.tipoPorta = tipoPorta;
		this.altura = altura;
		this.largura = largura;
		this.pivotanteSN = pivotanteSN;
	}
	public EspecificarPorta getTipoPorta() {
		return tipoPorta;
	}
	public void setTipoPorta(EspecificarPorta tipoPorta) {
		this.tipoPorta = tipoPorta;
	}
	public double getAltura() {
		return altura;
	}
	 public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public String getPivotanteSN() {
		return pivotanteSN;
	}
	public void setPivotanteSN(String pivotanteSN) {
		this.pivotanteSN = pivotanteSN;
	}
	public double getSePivotante() {
		return sePivotante;
	}
	
	public double getAlturaPadrao() {
		return alturaPadrao;
	}

	public double getLarguraPadrao() {
		return larguraPadrao;
	}
	public double calculaPreco() {
		double valor = this.altura*this.largura * tipoPorta.getPreco();
		if(this.pivotanteSN == "S")
			return sePivotante + valor;
		else 
			return valor;
	}
	public void exibePorta(){
		System.out.println("--------- Informações sobre a porta ---------");
		System.out.println(" Tipo de porta: "+this.tipoPorta);
		System.out.println(" Altura: "+this.altura  );
		System.out.println(" Lagura: "+this.largura );
		System.out.println(" Pivotante(S/N): "+this.pivotanteSN);
		System.out.println("---------------------------------------------");
	}
}