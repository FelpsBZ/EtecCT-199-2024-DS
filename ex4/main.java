package ex4;
import java.util.*;
public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		String nome;
		int idade;
		double peso = 0, altura = 0;
		
		IMC imc1 = new IMC();
		
		System.out.println("Informe o Nome: ");
		nome = in.next();
		imc1.setNome(nome);
		
		System.out.println("Informe a Idade: ");
		idade = in.nextInt();
		imc1.setIdade(idade);
		
		System.out.println("Informe o Peso: ");
		peso = in.nextDouble();
		imc1.setPeso(peso);
		
		System.out.println("Informe o Altura: ");
		altura = in.nextDouble();
		imc1.setAltura(altura);
		 
		System.out.println(imc1.calcularImc());
		
		IMC imc2 = new IMC();
		
		System.out.println("Informe o Nome: ");
		nome = in.next();
		imc2.setNome(nome);
		
		System.out.println("Informe a Idade: ");
		idade = in.nextInt();
		imc2.setIdade(idade);
		
		System.out.println("Informe o Peso: ");
		peso = in.nextDouble();
		imc2.setPeso(peso);
		
		System.out.println("Informe o Altura: ");
		altura = in.nextDouble();
		imc2.setAltura(altura);
		
		System.out.println(imc2.calcularImc());
	}

}