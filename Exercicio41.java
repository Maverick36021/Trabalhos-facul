/*Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
Média_de_Aproveitamento = (N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios)/7*/

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nomeDoAluno = sc.nextLine();
		System.out.println("Digite a 1º nota de "+nomeDoAluno);
		double nota1 = sc.nextDouble();
		System.out.println("Digite a 2º nota de "+nomeDoAluno);
		double nota2 = sc.nextDouble();
		nota2=nota2*2;
		System.out.println("Digite a 3º nota de "+nomeDoAluno);
		double nota3 = sc.nextDouble();
		nota3=nota3*3;
		System.out.println("E agora digite a media dos exercicios feitos por "+nomeDoAluno);
		double mediaExercicios = sc.nextDouble();
		double mediaAproveitamento = (nota1+nota2+nota3+mediaExercicios)/7;
		if(mediaAproveitamento >= 9) {
			System.out.println("Aluno(a): "+nomeDoAluno+" Conceito: A");
		}else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			System.out.println("Aluno(a): "+nomeDoAluno+" Conceito: B");
		}else if(mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			System.out.println("Aluno(a): "+nomeDoAluno+" Conceito: C");
		}else {
			System.out.println("Aluno(a): "+nomeDoAluno+" Conceito: D");
		}
		sc.close();
	}

}
