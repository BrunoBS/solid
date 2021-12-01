package brunobs.com.br.brunobs.coesao;

import java.math.BigDecimal;

public class Funcionario2 {

    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
    private String cep;
    private String logradouro;
    private String  bairro;
    private String cidade;
    private String uf;

    public boolean isGerente(){
        return Cargo.GERENTE == this.cargo;
    }

    public void  formataCPF(){
        //Lógica para formatar cpf
    }

    public void  formataCep(){
        //Lógica para formatar cep
    }

    public void  completaEndereco(){
        //Lógica para chamar um WS dos correios (por exemplo)
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
