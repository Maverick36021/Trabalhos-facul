/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor. */
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o valor do salario fixo do funcionario: ");
		double salarioFixo = sc.nextDouble();
		System.out.println("Digite o valor da comissão fixa por carro vendido: ");
		double comissaoFixa = sc.nextDouble();
		System.out.println("Digite a quantidade de carros vendidos no mês: ");
		int carrosVendidos = sc.nextInt();
		System.out.println("Digite o valor total das vendas no mês: ");
		double vendasTotais = sc.nextDouble();
		double valorPorVenda = carrosVendidos*comissaoFixa;
		double valorComissaoTotalVendas = vendasTotais/100*5;
		double salarioFinal = salarioFixo+valorComissaoTotalVendas+valorPorVenda;
		System.out.printf("O salario do funcionario esse mês corresponde a: R$ %.2f",salarioFinal);
		sc.close();
	}
}