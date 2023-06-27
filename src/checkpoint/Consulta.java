package checkpoint;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Consulta {

    private LocalDate dataConsulta;
    private LocalTime horaConsulta;
    private Double valorTotal;
    private String diagnostico;
    private Veterinario veterinario;
    private Dono dono;

    public Consulta(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Consulta(LocalDate dataConsulta, LocalTime horaConsulta, Double valorTotal,
                    String diagnostico, Veterinario veterinario, Dono dono) {
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.valorTotal = valorTotal;
        this.diagnostico = diagnostico;
        this.veterinario = veterinario;
        this.dono = dono;

    }

    public void listaServicos(){

        System.out.println("Sua consulta já foi marcada! Agora precisamos das informações para o Diagnostico:");
        System.out.println("Serviços disponíveis: \n1 - Raio-X (100R$) \n2 - Vacina (75R$) \n3 - Consulta comum (50R$)");
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um serviço (número): ");
            int servico = scanner.nextInt();
            System.out.println("Serviço digitado: " + servico);

            if(servico == 1) {
                this.adicionarDespesa(100D);
                this.atualizarDiagnostico("Raio-x");
            } else if(servico == 2) {
                this.adicionarDespesa(75D);
                this.atualizarDiagnostico("Vacina");
            } else if(servico == 3) {
                this.adicionarDespesa(50D);
                this.atualizarDiagnostico("Consulta comum");
            } else {
                System.out.println("Opção inválida");
                break;
            }

            System.out.print("Deseja continuar? (S/N): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }

        }

        System.out.print("Deseja cancelar sua consulta? S/N: ");
        String cancelamento = scanner.next();
        if (cancelamento.equalsIgnoreCase("S")) {
            System.out.println("Consulta Cancelada");
            this.cancelarConsultar();
        } else {
            System.out.println("Consulta Atualizada!");
            System.out.println("Valor total da consulta: " + this.getValorTotal());
            System.out.println("Serviços escolhidos: " + this.getDiagnostico());
        }

    }

    public Double adicionarDespesa(Double valor) {
        this.valorTotal = this.valorTotal + valor;
        return this.valorTotal;
    }

    public LocalDateTime marcaConsulta(LocalDate dataConsulta, LocalTime horaConsulta, Veterinario veterinario, Dono dono) throws ConsultaException{
            LocalDate hoje = LocalDate.now();
            this.horaConsulta = horaConsulta;
            this.veterinario = veterinario;
            this.dono = dono;

            if(dataConsulta.isBefore(hoje)) {
                throw new ConsultaException("Não é possível agendar uma consulta anterior a data:" + hoje);
            } else {
                this.dataConsulta = dataConsulta;
                System.out.println("Consulta Marcada!");
            }

            return this.dataConsulta.atTime(this.horaConsulta);
    }

    public void cancelarConsultar(){

        this.dataConsulta = null;
        this.horaConsulta = null;
        this.diagnostico = null;
    }

    public void atualizarDiagnostico(String diagnostico){

        if(this.diagnostico == null) {
            this.diagnostico = diagnostico;
        } else {
            this.diagnostico += ", " + diagnostico;
        }

    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
