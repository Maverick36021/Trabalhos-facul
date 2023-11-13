/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.*/
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¨¨¨¨¨¨Apuração de votos¨¨¨¨¨¨¨¨");
		System.out.println("Por Favor, digite a quantidade total de eleitores no municipio: ");
		int totalEleitores = sc.nextInt();
		System.out.println("Agora, digite a quantidade de votos brancos: ");
		int votosBrancos = sc.nextInt();
		System.out.println("E agora a quantidade de votos nulos: ");
		int votosNulos = sc.nextInt();
		System.out.println("E agora, a quantidade de votos validos: ");
		int votosValidos = sc.nextInt();
		int porcentagemBrancos = votosBrancos*100/totalEleitores;
		int porcentagemNulos = votosNulos*100/totalEleitores;
		int porcentagemValidos = votosValidos*100/totalEleitores;
		
		System.out.println("Tivemos "+porcentagemValidos+"% de votos validos");
		System.out.println(porcentagemBrancos+"% Votaram em branco.");
		System.out.println(porcentagemNulos+"% Votaram nulo.");
		
		sc.close();
	}

}
