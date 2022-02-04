package br.com.genaration.javaproject;

import java.util.Scanner;

public class Login extends UserData {

	Scanner entrada;
	private String resposta[] = new String[2];
	private String email[] = new String[50];
	private float senha[] = new float[50];


	public void login() {

		for(int i = 0; i == 1; i++) {
			if (i == 0) {
				System.out.println("Digite seu email: ");
				email[i] = entrada.next();
				System.out.println("Digite sua senha: ");
				senha[i] = entrada.nextFloat();
			}
		}
	}
}
