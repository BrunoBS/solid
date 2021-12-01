package brunobs.com.br.LiskovSubstitutivePrinciple;

public class ContaDeEstudante extends ContaComum {

    public ContaDeEstudante(double saldo) {
        super(saldo);
    }

    public void rende()  {
        throw new RuntimeException();
    }
}