package brunobs.com.br.LiskovSubstitutivePrinciple;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (ContaComum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:"+conta.getSaldo());
        }
    }

    private static List<ContaComum> contasDoBanco() {
        List<ContaComum> contaComums  = new ArrayList<>();
        contaComums.add(new ContaComum(10));
        contaComums.add(new ContaComum(20));
        return contaComums;
    }
}