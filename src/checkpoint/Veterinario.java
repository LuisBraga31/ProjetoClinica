package checkpoint;

public class Veterinario extends Funcionario{

    private String especialidade;

    public Veterinario(String nome, String telefone, String cpf, double salario, int horaTrabalho, String especialidade) {
        super(nome, telefone, cpf, salario, horaTrabalho);
        this.especialidade = especialidade;
    }

    @Override
    public double horaExtra(Integer horasExtras) {

        double salarioHora = getSalario()/getHoraTrabalho();
        return  Math.round((horasExtras * (salarioHora*1.5))*100.0)/100.0;

    }

    public String receberConsulta(){

        return "O veterinário está atendendo o pet";
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
