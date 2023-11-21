/*Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
estar em condições, um dos seguintes requisitos deve ser satisfeito:
 - Ter no mínimo 65 anos de idade.
 - Ter trabalhado no mínimo 30 anos.
 - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'. */

package ExercicioFaccat;

import java.util.Scanner;
public class Exercicio42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano = 2023;
		System.out.println("Digite o codigo do funcionário: ");
		String codFuncionario = sc.nextLine();
		System.out.println("Digite o ano de nascimento do funcionario: ");
		int anoNascimento = sc.nextInt();	
		System.out.println("Qual o ano em que o funcionario ingressou na empresa ?");
		int anoDeIngresso = sc.nextInt();
		int idade = ano-anoNascimento;
		int tempoDeTrabalho = ano-anoDeIngresso;
		System.out.println("Funcionário: "+codFuncionario+"\nIdade: "+idade+"\nTempo de serviço: "+tempoDeTrabalho+" Anos");
		if(idade>=65) {
			System.out.println("Requerer Aposentadoria !");
		}else if(tempoDeTrabalho>=30) {
			System.out.println("Requerer Aposentadoria !");
		}else if(idade>=60 && tempoDeTrabalho>=25) {
			System.out.println("Requerer Aposentadoria !");
		}else {
			System.out.println("Não requerer");
		}sc.close();
		

	}

}
