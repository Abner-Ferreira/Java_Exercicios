package Exercicios;
 import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double num1, num2, num3 ;
		System.out.printf("Digite o valor do primeiro n�mero: ");
		num1 = ler.nextDouble();
		System.out.printf("Digite o valor do segundo n�mero: ");
		num2 = ler.nextDouble();
		System.out.printf("Digite o valor do terceiro n�mero: ");
		num3 = ler.nextDouble();
		if (num1 > num2 && num1 > num3) {
			System.out.printf("O maior valor entre eles � o %.1f", num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.printf("O maior valor entre eles � o %.1f", num2);
		} else {
			System.out.printf("O maior valor entre eles � o %.1f", num3);
		}
	}

}
