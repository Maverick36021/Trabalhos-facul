// Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maior =0,meio=0;
		System.out.println("Digite o 1º valor ");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o 2º valor ");
		double valor2 = sc.nextDouble();
		System.out.println("Digite o 3º valor ");
		double valor3 = sc.nextDouble();
		if(valor1<valor2 && valor2<valor3) {
			maior=valor3;
			meio=valor2;
		}
		else if(valor1<valor2 && valor2>valor3 && valor1<valor3) {
			maior=valor2;
			meio=valor3;
		}
		else if(valor1<valor2 && valor2>valor3 && valor1>valor3) {
			maior=valor2;
			meio=valor1;
		}
		else if(valor2<valor1 && valor2>valor3) {
			maior=valor1;
			meio=valor2;
		}
		else if(valor2<valor1 && valor2<valor3 && valor1<valor3) {
			maior=valor3;
			meio=valor1;
		}
		else if(valor2<valor1 && valor2<valor3 && valor1>valor3) {
			maior=valor1;
			meio=valor3;
		}
		System.out.println("A soma dos 2 maiores valores digitados é igual a: "+(maior+meio));
		sc.close();	
	}
}
	