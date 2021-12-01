package brunobs.com.br.LiskovSubstitutivePrinciple;

public class ManipuladorDeSaldo {

    private  double saldo;

    public ManipuladorDeSaldo(double saldo) {
        this.saldo = 0;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende(double taxa)  {
        this.saldo*= taxa;
    }    
}