package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double x = sc.nextDouble();
		System.out.println("Digite outro numero: ");
		double y = sc.nextDouble();
		double z = x*y+5;
		String resposta;
		if(z <= 0) {
			resposta = "A";
		}
		else if(z <= 100) {
			resposta = "B";
		}
		else {
			resposta = "c";
		}
		System.out.println(z+"\t"+resposta);
		sc.close();

	}

}
