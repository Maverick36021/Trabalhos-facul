/* Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.*/
package ExercicioFaccat;

import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String usuario = "1234", senha = "9999";
		System.out.println("Digite o usuario: ");
		String codUsuario = sc.nextLine();
		if(codUsuario.equals(usuario)) {
			System.out.println("Digite a senha: ");
			String codSenha = sc.nextLine();
			if(codSenha.equals(senha)) {
				System.out.println("Acesso permitido!!!");
			}else {
				System.out.println("Senha invalida");
			}
		}else {
			System.out.println("Usuario invalido !!!");
		}sc.close();
		
		
	}

}
