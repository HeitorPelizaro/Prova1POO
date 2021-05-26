package br.edu.iftm.virtualit.principal;

import java.util.Scanner;

import br.edu.iftm.virtualif.controller.Campeonato;
import br.edu.iftm.virtualif.controller.Jogador;
import br.edu.iftm.virtualif.controller.Jogo;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Digite 1 para começar: \n");
		Jogo jog = new Jogo();
		
		Scanner sc = new Scanner(System.in);
		
		jog.setMapa(sc.nextInt());	
		
		jog.setGuilda(sc.nextInt());
		
		jog.setChefao(sc.nextInt());
		
		jog.showMap(sc.nextInt(),sc.nextInt());
		
		System.out.println("Digite 1 para começar as mudanças do jogador: \n");
		
		Jogador jd = new Jogador();
		
		jd.setClasseJogador(sc.nextInt());
		
		jd.setArmaJogador(sc.nextInt());
		
		jd.setnomeJogador(sc.next());
		
		jd.escolherRoupa(sc.nextInt());
		
		System.out.println("Digite 1 para definir o online: \n");
		Campeonato cp = new Campeonato();
		cp.setDuelo(sc.nextInt());
		
		cp.setNumeroJogadores(sc.nextInt());
		
		cp.setAndaresDungeon(sc.nextInt());
		
		cp.pedidoAmizade(sc.nextInt());
		
		sc.close();

	}

}
