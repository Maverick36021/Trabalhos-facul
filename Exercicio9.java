/*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
Calcular e escrever o valor do novo salário*/

package ExercicioFaccat;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor atual do salario: ");
		double salarioAtual = sc.nextDouble();
		System.out.println("Agora, digite o valor do reajuste: ");
		double reajuste = sc.nextDouble();
		double valorReajuste = salarioAtual/100*reajuste;
		double salarioReajustado = salarioAtual+valorReajuste;
		System.out.println("O salario atual do funcionario, com reajuste de "+reajuste+" %, é igual a: R$"+salarioReajustado);
		sc.close();
	}
}

