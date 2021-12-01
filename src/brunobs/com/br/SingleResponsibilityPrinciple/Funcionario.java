package brunobs.com.br.SingleResponsibilityPrinciple;



public class Funcionario {

    private String nome;
    private String cpf;
    private Cargo cargo;
    private double salario;
    private double salarioBase;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
