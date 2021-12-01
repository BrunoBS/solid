package brunobs.com.br.SingleResponsibilityPrinciple;

public class CalculadoraDeSalario {


    public double calcula(Funcionario funcionario) {
        if (Cargo.ENGENHEIRO.equals(funcionario.getCargo())) {
            return dezOuVintePorcento(funcionario);
        }

        if (Cargo.ESPECIALISTA.equals(funcionario.getCargo()) || Cargo.SUPERVISOR.equals(funcionario.getCargo())) {
            return quinzeOuVinteCincoPorcento(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }

    private double dezOuVintePorcento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        } else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

    private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 15000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }

    public static void main(String[] args) {
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
        Funcionario f = new Funcionario();
        f.setNome("Bruno");
        f.setCargo(Cargo.ESPECIALISTA);
        f.setSalario(1000);
        f.setSalarioBase(10000);

        System.out.println("SALARIO LIQUIDO: " + calculadoraDeSalario.calcula(f));
    }

}