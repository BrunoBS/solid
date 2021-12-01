package brunobs.com.br.brunobs.encapsulamento;

import brunobs.com.br.brunobs.coesao.Cargo;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;


    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo=" + cargo +
                ", salario=" + salario +
                '}';
    }

    public boolean isGerente() {
        return Cargo.GERENTE == this.cargo;
    }


    public void reajustarSalario(BigDecimal aumento) {
        BigDecimal percentual = (aumento.divide(this.salario)).multiply(BigDecimal.valueOf(100l));
        if (percentual.compareTo(BigDecimal.valueOf(40l)) > 0) {
            throw new IllegalArgumentException("percentual de reajuste deve ser inferior a 40%");
        }
        this.salario= this.salario.add(aumento);
    }


}
