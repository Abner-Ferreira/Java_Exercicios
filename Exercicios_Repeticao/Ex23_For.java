package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex23_For {

public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	String sexo;
	sexo = "genero";
	for (int i = 0; sexo.equals("M") || sexo.equals("F") || sexo != "M" || sexo != "F"; i++) {
		System.out.println("Qual � seu sexo (M ou F)? ");
		sexo = ler.nextLine();
		sexo = sexo.toUpperCase();
		if (sexo.equals("M")) {
			System.out.println("Voc� � do sexo masculino!");
			break;
		}else if  (sexo.equals("F")) {
			System.out.println("Voc� � do sexo feminino!");
			break;
			
		}else {
			System.out.println("ERRO, escolha somente M ou F");
			
		}
	}
	}

}
