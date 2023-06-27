package checkpoint;

import java.time.LocalDate;

public class Animal {

    private String nome;
    private String tipoEspecie;
    private String raca;
    private LocalDate nascimento;

    public Animal(String nome, String tipoEspecie, String raca, LocalDate nascimento) {
        this.nome = nome;
        this.tipoEspecie = tipoEspecie;
        this.raca = raca;
        this.nascimento = nascimento;
    }

    public void executarProcedimento() {
        System.out.println("O animal esta sendo atendido.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoEspecie() {
        return tipoEspecie;
    }

    public void setTipoEspecie(String tipoEspecie) {
        this.tipoEspecie = tipoEspecie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
