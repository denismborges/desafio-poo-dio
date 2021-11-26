package main;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
	
	Curso curso1 = new Curso("Curso Java", "Descrição curso java", 8);
	System.out.println(curso1);
	System.out.println("XP Curso1: " + curso1.calcularXp());
	
	Curso curso2 = new Curso("Curso JS", "Descrição curso js", 4);
	System.out.println(curso2);
	System.out.println("XP Curso2: " + curso2.calcularXp());
	
	Mentoria mentoria = new Mentoria("Mentoria java", "Descrição mentoria java", LocalDate.now());
	System.out.println(mentoria);
	System.out.println("XP Mentoria: " + mentoria.calcularXp());
	
	Bootcamp bootcamp = new Bootcamp();
	bootcamp.setNome("Bootcamp Java Developer");
	bootcamp.setDescricao("Descrição Bootcamp Java Developer");
	bootcamp.getConteudos().add(curso1);
	bootcamp.getConteudos().add(curso2);
	bootcamp.getConteudos().add(mentoria);
	System.out.println(bootcamp);
	
	Dev devCamila = new Dev();
	devCamila.setNome("Camila");
	devCamila.inscreverBootcamp(bootcamp);
	System.out.println("Conteúdos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("XP sem concluir cursos:" + devCamila.calcularTotalXp());	
	devCamila.progredir();
	System.out.println("- Progredindo no 1º conteúdo");
	System.out.println("Conteúdos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("Conteúdos concluídos:" + devCamila.getConteudosConcluidos());
	System.out.println("XP:" + devCamila.calcularTotalXp());
	devCamila.progredir();
	System.out.println("- Progredindo no 2º conteúdo");
	System.out.println("Conteúdos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("Conteúdos concluídos:" + devCamila.getConteudosConcluidos());
	System.out.println("XP:" + devCamila.calcularTotalXp());
	devCamila.progredir();
	System.out.println("- Progredindo no 3º conteúdo");
	System.out.println("Conteúdos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("Conteúdos concluídos:" + devCamila.getConteudosConcluidos());
	System.out.println("XP:" + devCamila.calcularTotalXp());
	devCamila.progredir();
	System.out.println("- Progredindo no 4º conteúdo - Não existe");
	System.out.println("Conteúdos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("Conteúdos concluídos:" + devCamila.getConteudosConcluidos());
	System.out.println("XP:" + devCamila.calcularTotalXp());
	
    }

}
