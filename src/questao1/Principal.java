package questao1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) throws ParseException {
			 Scanner entrada = new Scanner(System.in);
			 System.out.println("14.19: (Imprimindo datas em vários formatos) As datas são impressas em vários formatos comuns. Dois dos formatos mais comuns em inglês são 04/25/1955 e April 25, 1955 Elabore um aplicativo que lê uma data no primeiro formato e imprime no segundo formato. ");
			 System.out.println("Digite uma data(dd/mm/yyyy): ");
             String data = entrada.nextLine();
             String ano =data.substring(6,data.length());
             String mes = data.substring(3, 5);
             String dia = data.substring(0, 2);
			 System.out.println("Resultado: ");
             switch (mes) {
             case "01":
                 System.out.println("Janeiro " + dia+", " + ano);
             break;
             case "02":
                 System.out.println("Fevereiro" + dia+", " + ano);
             break;
             case "03":
                 System.out.println("Março " + dia+", " + ano);
             break;
             case "04":
                 System.out.println("Abril" + dia+", " + ano);
             break;
             case "05":
                 System.out.println("Maio" + dia+", " + ano);
             break;
             case "06":
                 System.out.println("Junho" + dia+", " + ano);
             break;
             case "07":
                 System.out.println("Julho" + dia+", " + ano);
             break;
             case "08":
                 System.out.println("Agosto" + dia+", " + ano);
             break;
             case "09":
                 System.out.println("Setembro" + dia+", " + ano);
             break;
             case "10":
                 System.out.println("Outubro" + dia+", " + ano);
             break;
             case "11":
                 System.out.println("Novembro" + dia+", " + ano);
             break;
             case "12":
                 System.out.println("Dezembro " + dia+", " + ano);
             break;
             default:
                 System.out.println("Informe a data corretamente!");
             }
	}
}
