/* Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever 
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o 
aluno é aprovado). Escrever também a média calculada. */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media;
		System.out.println("Infore o nome do aluno(a): ");
		String nomeDoAluno = sc.next();
		System.out.println("Informe a nota da 1º avaliacao: ");
		double n1 = sc.nextDouble();
		System.out.println("Agora, informe a nota da 2º avaliacao: ");
		double n2 = sc.nextDouble();
		media = (n1+n2)/2;
		if(media>=6){
		System.out.println(nomeDoAluno+" teve media de "+media+" e foi Aprovado(a)!!!");
		}
		else{
		    System.out.println(nomeDoAluno+" teve media de "+media+" e foi Reprovado(a)!!!");
		}
		sc.close();
	}
}
	
