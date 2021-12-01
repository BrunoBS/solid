package brunobs.com.br.DependencyInversionPrinciple;

public class Interruptor {

    private Ventilador ventilador;

    public Interruptor(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    public void acionar() {
        if (this.ventilador.isLigado()) {
            ventilador.desligar();
        } else {
            ventilador.ligar();
        }
    }


    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();
        new Interruptor(ventilador).acionar();

    }

}
