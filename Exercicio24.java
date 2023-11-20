/*) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total. */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double comissao=0, salarioTotal=0, comissaoAdicional=0;
		System.out.println("Informe o valor do salario fixo do funcionario: ");
		double salarioFixo = sc.nextDouble();
		System.out.println("Agora informe o valor das vendas do funcioario esse mês: ");
		double vendas = sc.nextDouble();
		if(vendas > 1.500) {
			comissao = 1500/100*3;
		    comissaoAdicional = (vendas-1500)/100*5;
		}
		else {
			comissao = vendas/100*3;
		}
		salarioTotal = salarioFixo+comissao+comissaoAdicional+vendas;
		System.out.println("O salario do funcionario esse mês é: "+salarioTotal);
		sc.close();
	}

}
