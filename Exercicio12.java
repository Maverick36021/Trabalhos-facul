/*Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo):
C/5 = F-32/9
Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Fahrenheit");
		double temperaturaF = sc.nextDouble();
		double celcius = ((temperaturaF-32)/9)*5;
		System.out.println(temperaturaF+"F corresponde a: "+celcius+"°C");
		sc.close();

	}

}
