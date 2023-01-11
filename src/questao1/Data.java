package questao1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Data {
	private Date data;
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private String texto = "00/00/0000", texto2;
	public Data() {
		// TODO Auto-generated constructor stub
		// data = new Date(00);
		this.texto = formato.format(data);
	}
	public Data(String texto2) {
		// TODO Auto-generated constructor stub
		this.texto2 = texto2;

		this.texto = formato.format(texto2);
	}
	/*
	public Data(Date d1) {
		// TODO Auto-generated constructor stub
		this.data = d1;
		this.texto = formato.format(d1);
	}
	*/
	public void Mostrar(){ 
		//  Date casa  = new Date();
		//  casa = formato.parseObject(texto);
		System.out.println(texto);
	}
	
}
