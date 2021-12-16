import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Salário Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();


        System.out.printf("\nFuncionário: %s, $ %.2f\n\n",  funcionario.nome, funcionario.calcularSalarioLiquido());
        System.out.print("Digite a porcentagem para aumentar o salário: ");

        double porcentagem = sc.nextDouble();

        System.out.printf("\nSalário atualizado: %s, $ %.2f\n", funcionario.nome, funcionario.calcularAumentoSalario(porcentagem));

        sc.close();
    }
}
