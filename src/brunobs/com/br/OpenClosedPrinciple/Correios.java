package brunobs.com.br.OpenClosedPrinciple;

public class Correios {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}