package dev.lucaslowhan.exercicio38.test;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private Integer gravidade;

    public Paciente(String nome, Integer gravidade) {
        this.nome = nome;
        this.gravidade = gravidade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getGravidade() {
        return gravidade;
    }

    @Override
    public String toString() {
        return  nome +
                "( Gravidade: " + gravidade +
                ')';
    }

    @Override
    public int compareTo(Paciente o) {
        return this.gravidade.compareTo(o.gravidade);
    }
}
