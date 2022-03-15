package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		Set<Aluno> set = new HashSet<>();
	
	
		for(int i=0; i<3;i++) {

			System.out.print("Quantos Estudantes para o Curso " + i + " ? ");
			int quant = sc.nextInt();
			
			for( int j=0; j<quant; j++ ) {
				int id = sc.nextInt();
				set.add(new Aluno(id));
			}
		}
			
				System.out.println("Total Alunos: " + set.size());
				
				for(Aluno aluno: set) {
					System.out.print(aluno);
				}
				
				
				sc.close();
	}
}