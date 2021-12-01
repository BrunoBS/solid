package brunobs.com.br.brunobs.encapsulamento.acoplamento;


public class Fatura {
    private double valorMensal;
    private String cliente;

    public Fatura() {
    }

    public Fatura(double valorMensal, String cliente) {
        this.valorMensal = valorMensal;
        this.cliente = cliente;
    }

    public double getValorMensal() {
        return this.valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
