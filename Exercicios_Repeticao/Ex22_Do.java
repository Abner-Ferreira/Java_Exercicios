package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex22_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1,num2;
		
		System.out.println("Digite o valor do primeiro n�mero: ");
		num1 = ler.nextInt();
		do{
			System.out.printf("Digite o valor do segundo n�mero: ");
			num2 = ler.nextInt();
			
		}
		while (num1>num2);
		System.out.println("O segundo n�mero � maior que o primeiro!");
	}

}
