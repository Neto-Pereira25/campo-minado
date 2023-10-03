package br.com.devNeto.cm;

import br.com.devNeto.cm.modelo.Tabuleiro;
import br.com.devNeto.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
	}

}
