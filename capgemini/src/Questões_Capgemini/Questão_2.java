package Quest�es_Capgemini;

import java.util.Scanner;

public class Quest�o_2 {

	public static void main(String[] args) {
		int countMaiusculo = 0;
		int countMinusculo = 0;
		int countDigito = 0;
		int countCaractereEspecial = 0;

		// nesta parte o usuario dever� colocar sua senha no qual ser� lido pelo
		// scanner.
		System.out.print("Insira a sua senha: ");
		Scanner sc = new Scanner(System.in);
		String senha = sc.next();

		// *nesta estrutura caso o usuario digite um valor abaixo dos 6 caracteres ele
		// vai imprimir na tela que, n�o possui a quantidade correta.*//

		if (senha.length() < 6) {
			int digitosRestantes = 6 - senha.length();
			System.out.printf("Sua Senha n�o possui a quantidade correta de caracteres", digitosRestantes);
		}
		//* aqui ele vai verificar se h� letra maiuscula, minuscula ou caracter especial, *//
		//*	um pouco mais a baixo vai ser feito outra verifica��o para saber se os *// 
		//*	parametros est�o certos.*//
		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if (Character.isUpperCase(c)) {
				countMaiusculo += 1;
			} else if (Character.isLowerCase(c)) {
				countMinusculo += 1;
			} else if (Character.isDigit(c)) {
				countDigito += 1;
			} else if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
					|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
					|| senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
				countCaractereEspecial += 1;
			}

		}

		if (countMaiusculo == 0) {
			System.out.println("n�o possui letra mai�scula");
		} else if (countMinusculo == 0) {
			System.out.println("n�o possui letra mi�scula");
		} else if (countDigito == 0) {
			System.out.println("n�o possui d�gito");
		} else if (countCaractereEspecial == 0) {
			System.out.println("n�o possui caractere especial");
		} else {
			//* se tudo estiver certo ele vai imprimir na tela que a senha e forte e segura.*//
			System.out.println("Esta senha � forte e segura");
		}
			
		sc.close();
	}

}