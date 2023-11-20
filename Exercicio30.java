// Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("OBS: Digite valores diferentes: ");
		System.out.println("Digite o 1º valor: ");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o 2º valor: ");
		double valor2 = sc.nextDouble();
		System.out.println("Digite o 3º valor: ");
		double valor3 = sc.nextDouble();
		
		if(valor1<valor2 && valor2<valor3) {
			System.out.println(valor1+" / "+valor2+" / "+valor3);
		}
		else if(valor1<valor2 && valor2>valor3 && valor1<valor3) {
			System.out.println(valor1+" / "+valor3+" / "+valor2);
		}
		else if(valor1<valor2 && valor2>valor3 && valor1>valor3) {
			System.out.println(valor3+" / "+valor1+" / "+valor2);
		}
		else if(valor2<valor1 && valor2>valor3) {
			System.out.println(valor3+" / "+valor2+" / "+valor1);
		}
		else if(valor2<valor1 && valor2<valor3 && valor1<valor3) {
			System.out.println(valor2+" / "+valor1+" / "+valor3);
		}
		else if(valor2<valor1 && valor2<valor3 && valor1>valor3) {
			System.out.println(valor2+" / "+valor3+" / "+valor1);
		}
		sc.close();
		
		
	}	
}
