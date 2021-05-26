package br.edu.iftm.virtualif.controller;



public class Jogador {
	
	private String classeJogador;
	private String armaJogador;
	private String nomeJogador;
	
	
	
	public String getClasseJogador() {
		
		return classeJogador;
	}

	public void setClasseJogador(int classe) {
		System.out.println("Digite 1 para ser um Bruxo: \n"
				+ "Digite 2 para ser um Bárbaro: \n"
				+ "Digite 3 para ser um Caçador: \n");
		
		
		switch (classe) {
		case 1: 
			
			this.classeJogador = "Bruxo";
			break;
		
		case 2:
		
			this.classeJogador = "Bárbaro";
			break;
			
		case 3:
			
			this.classeJogador = "Caçador";
			
		default:
		
			System.out.println("Número não encontrado");
			break;
		}
		
	}

	public String getArmaJogador() {
		return armaJogador;
	}

	public void setArmaJogador(int arma) {
		System.out.println("Digite 1 para pegar um cajado: \n"
				+ "Digite 2 para pegar uma espada: \n"
				+ "Digite 3 para pegar um arco: \n");
		
		
		switch (arma) {
		case 1: 
			
			this.armaJogador = "Cajado";
			break;
		
		case 2:
		
			this.armaJogador = "Espada";
			break;
			
		case 3:
			
			this.armaJogador = "Arco";
			break;
			
		default:
			
			System.out.println("Número não encontrado");
			break;
		}
	
	}

	public String getnomeJogador() {
		return nomeJogador;
	}

	public void setnomeJogador(String nome) {
		System.out.println("Digite teu nome: \n");
		
		this.nomeJogador = nome;
	}

	@Override
	public String toString() {
		return "Jogador [classeJogador=" + classeJogador + ", armaJogador=" + armaJogador + ", nomeJogador="
				+ nomeJogador + "]";
	}
	
	public String montarCavalo(){
		
		return "Você montou em um cavalo!!!! :)";
	}
	
	private String trocaRoupa(int roupa) {
	
		return "Roupa trocada";
		
		
	}
	public void escolherRoupa(int roupa) {
		
		
		System.out.println("Digite 1 para pegar a roupa de malha: \n"
				+ "Digite 2 para pegar a roupa de couro: \n"
				+ "Digite 3 para ficar sem roupa: \n");
		
		
		switch (roupa) {
		case 1:
			
			trocaRoupa(1);
			break;
			
		
		case 2:
			
			trocaRoupa(2);
			break;
			
		
		case 3:
			
			trocaRoupa(3);
			break;
			
		
		default:
			
			System.out.println("Número não encontrado");
			break;
		
		}
		
	}
}
