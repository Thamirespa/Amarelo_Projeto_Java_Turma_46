package br.com.genaration.javaproject;

public class ExecucaoSite {

	public static void main(String[] args) {
		Start inicio = new Start(); // Construction neto
		Login acesso = new Login(); // Construction Son
		UserData usuario = new UserData(); //Construction Root
		Emocoes emotion = new Emocoes(); //Construction son


		inicio.start();
		acesso.login();
		usuario.userdata();
		emotion.emocoes();
	}

}
