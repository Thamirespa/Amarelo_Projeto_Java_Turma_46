package br.com.genaration.javaproject;

import java.util.Scanner;

public class Start {

	public void start () {
		
		Scanner entrada = new Scanner(System.in);
		int urgente[] = new int[3];
		String email[] = new String[100];
		float senha[] = new float[100];
		String endereco[]= new String[100];
		//Abertura
		System.out.println("Ol�, estamos aqui para apoi�-lo, seja em um momento "
				+ "mais delicado ou para se conhecer melhor.");
		System.out.println();
		System.out.println("Tipos de Atendimento \n"
				+ "Emerg�ncia = Atendimento imediato.\n"
				+ "Urg�ncia = Necessita de atendimento r�pido mas pode aguardar outros casos.\n"
				+ "Pouca Urg�ncia = Pode aguardar casos descritos como emerg�ncia e urg�ncia, \nmas sabemos da sua necessidade.\n");

		//Grau de necessidade de atendimento
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite a op��o que mais se enquadra com o que est� sentindo:  " );
			System.out.println("[1] - Emerg�ncia \n" + "[2] - Urg�ncia \n" + "[3] - Pouca Urg�ncia \n");
			urgente[i] = entrada.nextInt();

			if (urgente[i] != 1) {
				System.out.println("Cadastre-se aqui: " );
				UserData acesso = new UserData();
				acesso.userdata();
				System.exit(i);
			} else  {
			System.out.println("Digite seu nome: ");
			email[i] = entrada.next();
			System.out.println("Digite seu telefone com DDD: ");
			senha[i] = entrada.nextFloat();
			System.out.println("Digite seu endereco: ");
			endereco[i] = entrada.next();
			System.out.println("Obrigada! Entraremos em contato imediatamente!");
			System.exit(i);

			}//else {
				//System.out.println("");
			//Emocoes emotion = new Emocoes();
		//	emotion.emocoes();
			// System.exit(i);
		}
	//	}
		//Next Class ==> Login
	}
}
