 /* As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem 
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e 
escreva o custo total da compra.*/

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorTotal=0;
		System.out.println("Informe a quantidade de macas desejadas");
		int qntDeMacas = sc.nextInt();
		if(qntDeMacas<12){
		    valorTotal= qntDeMacas*1.30;
		    System.out.printf("O preço de "+qntDeMacas+" maças, é igual a: RS %.2f",valorTotal);
		}
		else {
		   valorTotal = qntDeMacas*1;
		   System.out.printf("O preço de "+qntDeMacas+" maças, é igual a: RS %.2f",valorTotal);
		}
		sc.close();
	}

}
