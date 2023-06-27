package checkpoint;

import java.util.ArrayList;
import java.util.Collections;

public class Clinica {

    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Consulta> consultas;

    public Clinica(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.funcionarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void exibirFuncionarios() {

        ArrayList<String> nomes = new ArrayList<>();

        for(Funcionario funcionario: this.getFuncionarios()) {
            nomes.add(funcionario.getNome());
        }

        Collections.sort(nomes);

        System.out.println("Funcionários da Clinica por ordem Alfabética: " + nomes);


    }


    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);

    }

    public void removerFuncionario(Funcionario funcionario) {
            funcionarios.remove(funcionario);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
}
