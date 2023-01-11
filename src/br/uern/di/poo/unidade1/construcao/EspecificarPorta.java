package br.uern.di.poo.unidade1.construcao;

public enum EspecificarPorta {
	SIMPLES("compensada","simpes",50.00),
	PADRAO("andiroba","com encaixe",140.00),
	LUXO("ipe","do tipo tetra",350.00);
	private final String madeira,fechadura;
	private final double preco;
	private EspecificarPorta(String madeira, String fechadura, double preco) {
		this.madeira = madeira;
		this.fechadura = fechadura;
		this.preco = preco;
	}
	public String getMadeira() {
		return madeira;
	}
	public String getFechadura() {
		return fechadura;
	}
	public double getPreco() {
		return preco;
	}
}

