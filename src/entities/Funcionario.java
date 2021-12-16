package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double calcularSalarioLiquido() {
        return salarioBruto - imposto;
    }

    public double calcularAumentoSalario(double porcentagem) {
        return calcularSalarioLiquido() + this.salarioBruto * (porcentagem / 100);
    }
}
