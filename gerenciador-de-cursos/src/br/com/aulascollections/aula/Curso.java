package br.com.aulascollections.aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String intrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new LinkedHashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String intrutor) {
		this.nome = nome;
		this.intrutor = intrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getIntrutor() {
		return intrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		
//		return tempoTotal;

		return this.aulas.stream().mapToInt(Aula::getTempo).sum();

	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ". tempo total: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
			return this.alunos.contains(aluno);
	
	}

	public Aluno buscaMatriculado(int numero) {
		if(matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}

}
