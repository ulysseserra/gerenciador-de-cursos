package br.com.aulascollections.aula;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<String>();
		//Collection<String> alunos = new HashSet<>();
		alunos.add("Ulysses Serra");
		alunos.add("Jornada Viana");
		alunos.add("Mariana Felipe");
		alunos.add("Ully Gabrielly");
		alunos.add("Joana Darck");
		alunos.add("Bartolomeu Dias");
		alunos.add("Mariana Felipe");
		
		boolean joaoMatriculado = alunos.contains("João Doria");
		alunos.remove("Bartolomeu Dias");
		System.out.println(joaoMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
		
		//List<String> alunosEmLista = new ArrayList<String>(alunos);
	}

}
