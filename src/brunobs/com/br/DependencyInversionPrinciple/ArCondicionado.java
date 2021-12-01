package brunobs.com.br.DependencyInversionPrinciple;

public class ArCondicionado implements Dispositivo {

    private boolean ligado;

    @Override
    public void ligar() {
        ligado = Boolean.TRUE;
        System.out.println("Ar condicionado Ligado");
    }

    @Override
    public void desligar() {
        ligado = Boolean.FALSE;
        System.out.println("Ar condicionado Desligado");
    }

    @Override
    public boolean isLigado() {
        return ligado;
    }
}
