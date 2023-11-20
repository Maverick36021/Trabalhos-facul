//Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maior =0;
		for(int i=1;i<4;i++) {
			System.out.println("Digite o "+i+"º valor");
			double valor = sc.nextInt();
			if(valor>maior) {
				maior = valor;
			}
		}
		System.out.println("O maior valor digitado foi: "+maior);
		sc.close();
	}

}
