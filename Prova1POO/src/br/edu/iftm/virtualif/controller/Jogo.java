package br.edu.iftm.virtualif.controller;


public class Jogo {
	private String mapa;
	private String guilda;
	private String chefao;
	
	
	public String getMapa() {
		
		return mapa;
		
	}
	public void setMapa(int lugar) {
		System.out.println("Escolha teu local de origem!\n"
				+ "Digite 1 para Shurima\n"
				+ "Digite 2 para Ionia\n"
				+ "Digite 3 para Demacia\n"
				+ "Digite 4 para Noxus\n");
		
		switch (lugar) {
		case 1: 
			
			this.mapa = "Shurima";
			break;
		
		case 2:
		
			this.mapa = "Ionia";
			break;
			
		case 3:
			
			this.mapa = "Demacia";
			break;
		
		case 4:
			
			this.mapa = "Noxus";
			break;
			
		default:
			
			System.out.println("N�mero n�o encontrado");
			break;
		}
		
	}
	public String getGuilda() {
		return guilda;
	}
	public void setGuilda(int lado) {
		
		System.out.println("Deseja ser de qual lado?\n"
				+ "Digite 1 para ser da Ordem"
				+ "Digite 2 para ser da Alian�a");
	
		switch (lado) {
		case 1: 
			
			this.guilda = "Ordem";
			break;
		
		case 2:
		
			this.guilda = "Alian�a";
			break;
			
		default:
			
			System.out.println("N�mero n�o encontrado");
			break;
		}
		
	}
	public String getChefao() {
		
		return chefao;
		
	}
	public void setChefao(int chefe) {

		System.out.println("Escolha agora qual ser� teu arqui inimigo!\n"
				+ "Digite 1 para T�rcis\n"
				+ "Digite 2 para Joaquim\n"
				+ "Digite 3 para Ot�vio\n"
				+ "Digite 4 para Jered o destruidor de egirls\n");
		
		switch (chefe) {
		case 1:
			
			this.chefao = "T�rcis";
			break;
			
		case 2:
			
			this.chefao = "Joaquim";
			break;
			
		case 3:
			
			this.chefao = "Ot�vio";
			break;
			
		case 4:
			
			this.chefao = "Jered o destruidor de egirls";
			break;
		
		default:
			
			System.out.println("N�mero invalido.");
			break;
		
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Jogo [mapa=" + mapa + ", guilda=" + guilda + ", chefao=" + chefao + "]";
	}
	
	public void showMap(int tp,int confirm) {
		
		String local = "";
		System.out.println("Selecione um local do mapa para marcar: \n"
				+ "1 para Shurima\n"
				+ "2 para Ionia\n"
				+ "3 para Demacia\n"
				+ "4 para Noxus\n");
		
		switch (tp) {
		case 1:
			
			local = "Shurima";
			System.out.printf("Deseja se teleportar para %s? \n"
					+ "Digite 1 para sim e 2 para n�o:",local);
			break;
			
		case 2:
			
			local = "Ionia";
			System.out.printf("Deseja se teleportar para %s? \n"
					+ "Digite 1 para sim e 2 para n�o:",local);
			break;
			
		case 3:
			
			local = "Demacia";
			System.out.printf("Deseja se teleportar para %s? \n"
					+ "Digite 1 para sim e 2 para n�o:",local);
			break;
			
		case 4:
			
			local = "Noxus";
			System.out.printf("Deseja se teleportar para %s? \n"
					+ "Digite 1 para sim e 2 para n�o:",local);
			break;
	
		default:
			
			System.out.println("N�mero invalido.");
			break;
		
		}
 
		
		 switch (confirm) {
		 case 1: 
			
			teleporte(local);
			break;
			
		 default:
			
			  System.out.println("Ok");
			  break;
		 }	
	     
	    }
	
	private static void teleporte(String local) {
		
		System.out.printf("Voc� foi teleportado para %s!\n",local);
		
	}
	
}
