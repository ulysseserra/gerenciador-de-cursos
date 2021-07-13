package br.com.aulascollections.aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Ulysses Serra");
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		
	}

}
