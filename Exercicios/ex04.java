package Exercicios;
 import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double n1, n2, n3, n4, media ;
		System.out.printf("Digite o valor do primeiro n�mero: ");
		n1 = ler.nextDouble();
		System.out.printf("Digite o valor do segundo n�mero: ");
		n2 = ler.nextDouble();
		System.out.printf("Digite o valor do terceiro n�mero: ");
		n3 = ler.nextDouble();
		System.out.printf("Digite o valor do quarto n�mero: ");
		n4 = ler.nextDouble();
		media = (n1 + n2 + n3 + n4)/ 4 ; 
		System.out.printf("A m�dia aritim�tica desses n�meros � %.2f.", media);

	}

}