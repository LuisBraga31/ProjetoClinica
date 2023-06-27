package checkpoint;
public abstract class Funcionario {

private String nome;
private String telefone;
private String cpf;
private double salario;
private int horaTrabalho;

    public Funcionario(String nome, String telefone, String cpf, double salario, int horaTrabalho) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.salario = salario;
        this.horaTrabalho = horaTrabalho;
    }

    public double horaExtra(Integer horasExtras){

        return 1.0;
    };


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoraTrabalho(){
        return horaTrabalho;
    }

    public void setHoraTrabalho(int horaTrabalho) {
        this.horaTrabalho = horaTrabalho;
    }
}