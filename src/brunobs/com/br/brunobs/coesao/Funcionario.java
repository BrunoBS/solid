package brunobs.com.br.brunobs.coesao;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;

    public boolean isGerente(){
        return Cargo.GERENTE == this.cargo;
    }






}
