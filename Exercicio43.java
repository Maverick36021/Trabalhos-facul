package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mens="não é possivel formar um triângulo";
		System.out.println("Informe a 1º medida: ");
		double a= sc.nextDouble();
		System.out.println("Informe a 2º medida: ");
		double b= sc.nextDouble();
		System.out.println("Informe a 3º medida: ");
		double c= sc.nextDouble();
		if(a==b && b==c && a==c) {
			mens = "Triâgulo Equilatero";
		}else if(a!=b && b!=c && a!=c) {
			mens = "Tiângulo Escaleno";
		}else if(a==b || b==c || a==c) {
			mens = "Triangulo Isosceles";
		}
			System.out.println(mens);
			sc.close();

	}

}
