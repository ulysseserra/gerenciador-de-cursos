package br.com.aulascollections.aula;

import java.util.NoSuchElementException;

public class TestaBuscaAlunosNoCurso {
	
	public static void main(String[] args) throws NoSuchElementException {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Douglas Raphael");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		
		Aluno a1 = new Aluno("Roberto Carlos", 34672);
		Aluno a2 = new Aluno("Rogerio Rodrigues", 5617);
		Aluno a3 = new Aluno("Yago Gomes", 17645);
		Aluno a4 = new Aluno("Ulysses Serra", 5617);
		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem � o aluno com matr�cula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5618);
		System.out.println("Aluno: " + aluno);
	}

}
