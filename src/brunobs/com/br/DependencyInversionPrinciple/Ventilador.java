package brunobs.com.br.DependencyInversionPrinciple;

public class Ventilador {

    private boolean ligado;


    public void ligar() {
        ligado = Boolean.TRUE;
        System.out.println("Ventilador Ligado");
    }


    public void desligar() {
        ligado = Boolean.FALSE;
        System.out.println("Ventilador Desligado");
    }

      public boolean isLigado() {
        return ligado;
    }
}
