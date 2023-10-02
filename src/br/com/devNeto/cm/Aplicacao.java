package br.com.devNeto.cm;

import br.com.devNeto.cm.modelo.Tabuleiro;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		tabuleiro.alterarMarcacao(4, 4);
		tabuleiro.alterarMarcacao(4, 5);
		tabuleiro.abrir(3, 3);
		
		System.out.println(tabuleiro);
	}

}
