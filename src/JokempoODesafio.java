import java.util.Random;
import java.util.Scanner;

public class JokempoODesafio {

	public static void main(String[] args) {
	
		int jogador,maquina;
		
		
		Random sorteio = new Random();
		maquina = sorteio.nextInt(2) + 1;
		
		Scanner leitor = new Scanner(System.in);
		
		String Papel;
		String Pedra;
		String Tesoura;
		
		System.out.println("***********");
		System.out.println("Jokempo");
		System.out.println("***********");
		System.out.println();
		System.out.println("[1]- Pedra");
		System.out.println("[2]- Papel");
		System.out.println("[3]- Tesoura");
		System.out.println();
		System.out.print("Qual a sua escolha:(1,2 ou 3)? ");
		jogador = leitor.nextInt();
		
		if (maquina == 1 ) {
			
			System.out.println("A maquina escolheu : Pedra");
		} else if(maquina ==2) {
			
			System.out.println("A maquina escolheu : Papel ");
		} else {
			
			System.out.println("A maquina escolheu : Tesoura");
		}

			if (jogador  == 1 ) {
			
			System.out.println("Você escolheu : Pedra");
		} else if(jogador == 2) {
			
			System.out.println("Você escolheu : Papel ");
		} else {
			
			System.out.println("Você escolheu: Tesoura");
		}
			
			
			
			
		
		
		if ((jogador == 1 && maquina == 3) || (jogador ==2 && maquina==1) || (jogador == 3 && maquina ==2)) {
			System.out.println("Você ganhou!!!!");
			
		} else if ((jogador == 3 && maquina == 1) || (jogador == 1 && maquina == 2) || (jogador ==2 && maquina == 1)){
				System.out.println("Você perdeu!!!");
				
		} else { System.out.println("DEU EMPATE !!!");
				
				
		}
		
		
	
		
	
		
		

	
	
	
	
	
	
	
	}

}
