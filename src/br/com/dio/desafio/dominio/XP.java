package br.com.dio.desafio.dominio;

public enum XP {

    PADRAO(10);
    
    private final int value;

    private XP(int value) {
	this.value = value;
    }

    public int getValue() {
        return value;
    }
    
}
