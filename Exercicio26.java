/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'. */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a quantidade atual do produto em estoque ? ");
		int estoqueAtual = sc.nextInt();
		System.out.println("Qual a capacidade maxima de estoque ? ");
		int estoqueMaximo = sc.nextInt();
		System.out.println("E qual a capacidade minima de estoque ? ");
		int estoqueMinimo = sc.nextInt();
		int estoqueMedio = (estoqueMaximo+estoqueMinimo)/2;
		if(estoqueAtual >= estoqueMedio)
			System.out.println("Não efetuar a compra!!!!" );
		else
			System.out.println("Efetuar a compra !!!");
		sc.close();
	}

}
