//Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.

import java.util.Random;

class App {
	public int dice() {
		Random gerador1 = new Random();
		Random gerador2 = new Random();
		
		return gerador1.nextInt(6)+1 + gerador2.nextInt(6)+1;
	}
	public static void main(String[] args) {
		App e = new App();
		
		int contagem = 0; int ponto = 0;
		while(true) {
			int valor = e.dice();
			contagem ++;
			System.out.println(contagem + "O Jogo: ");
			if (contagem == 1) {
				if (valor == 7 || valor == 11) {
					System.out.println(valor + " Você vencedor!*");
					System.out.println("---");
					break;
				} else if (valor == 2 || valor == 3 || valor == 12){
					System.out.println(valor + " Droga! Seu perdedor!");
					break;
				} else {
					System.out.println(valor + " Ponto");
					ponto = valor;
					System.out.println("---");
					continue;	
				}
			} else {
				if (valor == 7) {
					System.out.println(valor + " Você é perdedor!");
					break;
				}  else if (valor == ponto) {
					System.out.println(ponto + "Você é vencedor!");
					break;
				}  else  {
					System.out.println(valor);
					System.out.println("---");
					continue;	
				}
			}
				
		}
	}
}