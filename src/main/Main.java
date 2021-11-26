package main;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
	
	Curso curso1 = new Curso("Curso Java", "Descri��o curso java", 8);
	System.out.println(curso1);
	System.out.println("XP Curso1: " + curso1.calcularXp());
	
	Curso curso2 = new Curso("Curso JS", "Descri��o curso js", 4);
	System.out.println(curso2);
	System.out.println("XP Curso2: " + curso2.calcularXp());
	
	Mentoria mentoria = new Mentoria("Mentoria java", "Descri��o mentoria java", LocalDate.now());
	System.out.println(mentoria);
	System.out.println("XP Mentoria: " + mentoria.calcularXp());
	
	Bootcamp bootcamp = new Bootcamp();
	bootcamp.setNome("Bootcamp Java Developer");
	bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
	bootcamp.getConteudos().add(curso1);
	bootcamp.getConteudos().add(curso2);
	bootcamp.getConteudos().add(mentoria);
	System.out.println(bootcamp);
	
	Dev devCamila = new Dev();
	devCamila.setNome("Camila");
	devCamila.inscreverBootcamp(bootcamp);
	System.out.println("Conte�dos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("XP sem concluir cursos:" + devCamila.calcularTotalXp());	
	devCamila.progredir();
	System.out.println("- Progredindo no 1� conte�do");
	System.out.println("Conte�dos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("Conte�dos conclu�dos:" + devCamila.getConteudosConcluidos());
	System.out.println("XP:" + devCamila.calcularTotalXp());
	devCamila.progredir();
	System.out.println("- Progredindo no 2� conte�do");
	System.out.println("Conte�dos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("Conte�dos conclu�dos:" + devCamila.getConteudosConcluidos());
	System.out.println("XP:" + devCamila.calcularTotalXp());
	devCamila.progredir();
	System.out.println("- Progredindo no 3� conte�do");
	System.out.println("Conte�dos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("Conte�dos conclu�dos:" + devCamila.getConteudosConcluidos());
	System.out.println("XP:" + devCamila.calcularTotalXp());
	devCamila.progredir();
	System.out.println("- Progredindo no 4� conte�do - N�o existe");
	System.out.println("Conte�dos inscritos:" + devCamila.getConteudosInscritos());
	System.out.println("Conte�dos conclu�dos:" + devCamila.getConteudosConcluidos());
	System.out.println("XP:" + devCamila.calcularTotalXp());
	
    }

}
