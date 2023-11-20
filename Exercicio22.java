/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas).*/

package ExercicioFaccat;

import java.util.Scanner;

public abstract class Exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horasNormais=0, horaExtra =0;
		System.out.println("Informe o valor do salário pago por hora para o funcionário");
		double salarioPorHora = sc.nextDouble();
		for(int i=1;i<5;i++) {
			System.out.println("Digite a quantidade de horas trabalhadas na "+i+"º semana");
			int horaTrabalhada = sc.nextInt();
			if(horaTrabalhada>40) {
				horaExtra=horaExtra+horaTrabalhada-40;
				horasNormais=horasNormais+40;}
			else {
				horasNormais=horasNormais+horaTrabalhada;}
		}
		double salarioPorHoraExtra = salarioPorHora+(salarioPorHora/100*50);
		double salarioHoraExtra = horaExtra*salarioPorHoraExtra;
		double salarioMelsal = salarioPorHora*horasNormais+(salarioHoraExtra);
		System.out.println("O funcionario trabalhou "+(horaExtra+horasNormais)+" horas esse mês e o seu salario é: "+salarioMelsal);
		sc.close();
	}
}
