package Exercicios_Repeticao;
import java.util.Scanner;
public class Ex22_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num1,num2;
		
		System.out.printf("Digite o valor do primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.printf("Digite o valor do segundo n�mero: ");
		num2 = ler.nextInt();
		
		while (num1 > num2) {
			System.out.println("ERRO! O VALOR DO PRIMEIRO N�O PODE SER MAIOR.");
			System.out.printf("Digite o valor do segundo n�mero: ");
			num2 = ler.nextInt();
		}
		
		System.out.println("O segundo n�mero � maior que o primeiro!");
	}

}
