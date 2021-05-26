package br.edu.iftm.virtualif.controller;

public class Campeonato {
	
	public Jogo jg = new Jogo();
	
	private String duelo;
	private String numeroJogadores;
	private String andaresDungeon;
	
	public String getDuelo() {
		return duelo;
	}

	public void setDuelo(int pvpon) {
		
		System.out.println("Deseja o pvp ativado?\n"
				+ "Digite 1 para Sim ou 2 para não");
		
		switch (pvpon) {
		case 1: 
			
			this.duelo = "On";
			break;
		
		case 2:
			
			this.duelo = "Off";
			break;
			
		default:
			
			System.out.println("Número não encontrado");
			break;
		}
	}

	public String getNumeroJogadores() {
		return numeroJogadores;
	}

	public void setNumeroJogadores(int numPlayers) {
		System.out.println("Digite a qauntidade de jogadores que deseja entrar(limite máximo de 4):");
		switch (numPlayers) {
		case 1:
			
			this.numeroJogadores = "1";
			break;
			
		case 2:
			
			this.numeroJogadores = "2";
			break;
			
		case 3:
			
			this.numeroJogadores = "3";
			break;
		
		case 4:
			
			this.numeroJogadores = "4";
			break;

		default:
			System.out.println("Número máximo excedido!!!");
			break;
		}
	}

	public String getAndaresDungeon() {
		return andaresDungeon;
	}

	public void setAndaresDungeon(int numAndares) {
		System.out.println("Digite a quantidade de andares que deseja jogar(limite máximo de 4):");
		switch (numAndares) {
		case 1:
			
			this.andaresDungeon = "1";
			break;
			
		case 2:
			
			this.andaresDungeon = "2";
			break;
			
		case 3:
			
			this.andaresDungeon = "3";
			break;
		
		case 4:
			
			this.andaresDungeon = "4";
			break;

		default:
			System.out.println("Número máximo excedido!!!");
			break;
		}
	}

	public void chefeDungeon(int num) {
			
		jg.setChefao(num);
	
		jg.getChefao();
		
		System.out.printf("O chefe da sua dungeon sera: "+jg.getChefao());
		
	}
	
	public void mostrarListaDeAmigos() {
		
		System.out.println("Qual id você deseja adicionar?\n"
				+ "Digite 1 Para Carlão\n"
				+ "Digite 2 para Rita\n"
				+ "Digite 3 para Harry\n");
		
		
	}
	public void pedidoAmizade(int pedido) {
	
	
		buscarJogador(pedido);	
		
	}
	
	private String buscarJogador(int id) {
		String jogador;
		
		switch (id) {
		case 1: 
			
			jogador = "Carlão";
			
			break;
		
		case 2:
			
			jogador = "Rita";
			break;
		
		case 3:
			
			jogador = "Harry";
			break;
			
		default:
			
			jogador = null;
			break;
		
		
		}
		if(buscarJogador(id)!= null) System.out.println("Pedido de amizade enviado!!");
		return jogador;
	}
}
