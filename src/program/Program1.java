package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Companhia;
import entidades.Contribuinte;
import entidades.Individual;

public class Program1 {

	public static void main(String[] args) {
		
		List<Contribuinte> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o numero de contribuintes:");
		int n = sc.nextInt();
		
		for(int k=1; k<=n; k++) {
			System.out.println("Dados do #" + k + " contribuinte: ");
			System.out.print("Individual ou companhia(i/c) ?");
			char M = sc.next().charAt(0);
			
			System.out.print("Nome:");
			String nome = sc.nextLine();
			sc.next();
			System.out.print("Rendimento anual:");
			double rendimentoAnual = sc.nextDouble();
			
			
			if(M == 'i') {
			System.out.print("Despesas com saúde:");
			double gastosSaude = sc.nextDouble();
			
			list.add(new Individual(nome, rendimentoAnual, gastosSaude));
			}
			else {
				System.out.print("Numero de funcionarios:");
				int numeroFuncionarios = sc.nextInt();
				
				list.add(new Companhia(nome, rendimentoAnual, numeroFuncionarios));
			}
			
		}
		
		double sum = 0;
		System.out.println();
		System.out.println("Impostos pagos: ");
		for(Contribuinte cont : list) {
			double taxa = cont.taxa();
			System.out.println(cont.getNome() + ": $ " + String.format("%.2f", taxa));
			sum += taxa;
		}
		
		System.out.println();
		System.out.println("TOTAL PAGO: $ " + String.format("%.2f", sum));
		
		
		
		
		
		
		
		sc.close();
		
	}

}
