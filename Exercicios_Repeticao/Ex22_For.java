package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex22_For {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int num1,num2,i;
	
	System.out.println("Digite o valor do primeiro n�mero: ");
	num1 = ler.nextInt();
	
	System.out.println("Digite o valor do segundo n�mero: ");
	num2 = ler.nextInt();
	
	for (i = 0 ; num1 > num2 ; i++ ) {
		
		if (num2>num1) {
			System.out.println("O segundo n�mero � maior que o primeiro!");
		}else {
			System.out.println("Digite o valor do segundo n�mero: ");
			num2 = ler.nextInt();
		}
	}

	
	}

}
