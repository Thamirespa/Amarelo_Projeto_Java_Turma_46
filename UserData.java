package br.com.genaration.javaproject;

import java.util.Scanner;

public class UserData {

	public void userdata() {
		//Variaveis
		Scanner entrada = new Scanner(System.in);
		String nome[] = new String[10];
		String endereco[] = new String[10];
		String idade[] = new String[10];
		String outro[] = new String[10];
		int gen[] = new int[10];
		float telefone[] = new float[10];
		int urgente;
		int opSexual[] = new int[10];
		//String email[] = new String[10];
		//float senha[] = new float[10];
				//Abertura
		  /*Classe Start*/

		//Login
		  /*Classe Login*/

		// Formulario
		  /* Classe User */
		
		for (int i = 0; i < 1; i++) {
			if (i != 1) {
			//Caso o grau de atendimento seja emergencial
				System.out.println("Conte um pouco mais sobre voc�: \n\n");
				//System.out.println("Digite um e-mail v�lido:");
				//email[i] = entrada.next();
				//.out.println("Digite um e-mail v�lido:");
				//[i] = entrada.nextFloat();
				System.out.println("Digite o seu Nome: ");
				nome[i] = entrada.next();
				System.out.println("Digite sua Data de Nascimento: ");
				idade[i] = entrada.next();
				System.out.println("Digite seu Telefone:");
				telefone[i] = entrada.nextFloat();
				System.out.println("Endere�o: ");
				endereco[i] = entrada.next();
				System.out.println("Escolha o g�nero no qual se identifica: "
						+"\n[1] - Masculino {Trans ou Cis}"
					    +"\n[2] - Feminino {Trans ou Cis}"
						+"\n[3] - N�o - binare"
					    +"\n[4] - Prefiro n�o dizer"
						+"\n[5] - Outro");
				gen[i] = entrada.nextInt();
			}
		}
		for (int i = 0; i < 1; i++) {
			if (gen[i] == 5) {System.out.println("Digite sua identidade de g�nero:\n");
				outro[i] = entrada.next();
			} else {
				System.out.println( );
			}
		}
		for (int i = 0; i < 1; i++) {
			System.out.println("\nEscolha sua orienta��o sexual: \n"
					+ "[1] - Homossexual {Gay ou L�sbica}\r\n"
					+ "[2] - Bissexual\n"
					+ "[3] - H�tero\n"
					+ "[4] - Prefiro n�o dizer\n"
					+ "[5] - Outro\n");
			opSexual[i] = entrada.nextInt();
		}
		for (int i = 0; i < 1; i++) {
			if (opSexual[i] == 5) {System.out.println("Caso for a op��o 5, digite: \n");
				outro[i] = entrada.next();
			} else {
				System.out.println( );
			}
		}

		//Impressao de emocoes
		Emocoes emotion = new Emocoes();
		emotion.emocoes();
	}
}
