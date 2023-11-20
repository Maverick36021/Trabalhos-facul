/*Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
e mostre seu peso ideal, utilizando as seguintes fórmulas:
 - para sexo masculino: peso ideal = (72.7 * altura) - 58
 - para sexo feminino: peso ideal = (62.1 * altura) - 44.7 */

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double pesoIdeal=0;		
		System.out.println("Qual o seu nome? ");
		String nome = sc.next();
		System.out.println("Qual o seu sexo? (M-MASCULINO OU F-FEMININO)");
		String sexo = sc.next();
		System.out.println("Agora me informe a sua altura: ");
		double altura = sc.nextDouble();
		if(sexo.equals("F"))
			pesoIdeal = (62.1*altura)-44.7;
		else
			pesoIdeal = (72.7*altura)-58;
		System.out.println(nome.toUpperCase()+" O seu peso ideal é: "+pesoIdeal);
		sc.close();
		
	}

}
