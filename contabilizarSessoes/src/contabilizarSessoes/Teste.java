package contabilizarSessoes;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("- Digite o nome do oansista:");
		String nome = input.next();
		
		System.out.println("- Digite o manual do oansista:");
		String manual = input.next();
		
			
			
		int total = 0;
			
		int totalDePraticas = 0;
		int totalDeMemorizacao = 0;
			
		System.out.println(">>> HORA DO MANUAL!! <<<");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("> Digite '1' para atividade prática ou '2' para atividade de memorização:");
			int escolha = input.nextInt();
			if(escolha == 1) {
				totalDePraticas = totalDePraticas + 1;
			} else if(escolha == 2){
				totalDeMemorizacao = totalDeMemorizacao + 2;
			} else {
				System.out.println("Opção invalida!");
			}
		}
			
		total = totalDePraticas + totalDeMemorizacao;
			
		System.out.println("- Você realizou " + totalDePraticas + " Atividade(s) práticas e " + (totalDeMemorizacao - 2) + " Atividade(s) de memorização");
		System.out.println("- Você adquiriu " + total + " Talentos");
			
		input.close();
	}
}
