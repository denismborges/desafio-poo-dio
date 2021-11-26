package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    private LocalDate data;
    
    public Mentoria(String titulo, String descricao, LocalDate data) {
	super(titulo, descricao);
	this.data = data;	
    }

    @Override
    public double calcularXp() {
	return XP.PADRAO.getValue() + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
	return "Mentoria{titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + 
		getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "}";
    }
    
}
