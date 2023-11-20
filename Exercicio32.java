/*Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/

package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do time da casa: ");
		String timeCasa = sc.nextLine();
		System.out.println("Digite o nome do time visitante: ");
		String timeVisitante = sc.nextLine();
		System.out.println("Quantos gols o "+timeCasa+" marcou na partida ?");
		int golsCasa = sc.nextInt();
		System.out.println("E quantos gols o "+timeVisitante+" marcou ?");
		int golsVisitante = sc.nextInt();
		if(golsCasa>golsVisitante) {
			System.out.println(timeCasa+" venceu a partida por "+golsCasa+" x "+golsVisitante);
		}
		else if(golsCasa<golsVisitante) {
			System.out.println(timeVisitante+" venceu a partida por "+golsVisitante+" x "+golsCasa);
		}
		else {
			System.out.println("A partida terminou empatada em "+golsCasa+" x "+golsVisitante);
		}
		sc.close();
	}

}
