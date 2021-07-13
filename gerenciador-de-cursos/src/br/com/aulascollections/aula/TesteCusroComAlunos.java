package br.com.aulascollections.aula;

public class TesteCusroComAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Ulysses Serra");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Roberto Carlos", 665323);
		Aluno a2 = new Aluno("Rogerio Rodrigues", 6653);
		Aluno a3 = new Aluno("Yago Gomes", 685472);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno carlos = new Aluno("Roberto Carlos", 665323);
		System.out.println("E esse Carlos, está matriculado:");
		System.out.println(javaColecoes.estaMatriculado(carlos));
		
		System.out.println("O a1 é equals Carlos?");
		System.out.println(a1.equals(carlos));
		
		// Obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == carlos.hashCode());
	
     }
}


