package ex3;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    	
        Scanner in = new Scanner(System.in);
        
        Funcionario pedro = new Funcionario();
        System.out.println("Insira o salario bruto de Pedro");
        pedro.salarioBruto = in.nextDouble();
        
        System.out.println("O salario liquido de Pedro é:"+pedro.calcSalarioLiquido());
        
        System.out.println("Me fale quantos porcento você deseja aumentar o salario de pedro");
        double valor = in.nextDouble();
        pedro.aumentaSalario(valor);
        System.out.println("salario bruto atual: "+pedro.salarioBruto);
        System.out.println("O salario liquido atual de Pedro é de: "+pedro.salarioLiquido);
        
        
		Funcionario vagner = new Funcionario();
		System.out.print("Insira o salario bruto de Vagner: ");
		vagner.salarioBruto = in.nextDouble();
		
		System.out.println("O salário liquido de Vagner é: "+vagner.calcSalarioLiquido());
		
		System.out.print("Insira a porcentagem de aumento no salário de Vagner: ");
		valor = in.nextDouble();
		vagner.aumentaSalario(valor);
        System.out.println("salario bruto atual: "+pedro.salarioBruto);
  		System.out.println("O salário líquido de Vagner após reajuste ficou em: "+vagner.salarioLiquido);
    }
}