package ex1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		IMC imc1 = new IMC();
		
		System.out.println("Informe o Nome: ");
		imc1.nome = in.next();
		
		System.out.println("Informe a Idade: ");
		imc1.idade = in.nextInt();
		
		System.out.println("Informe o Peso: ");
		imc1.peso = in.nextDouble();
		
		System.out.println("Informe o Altura: ");
		imc1.altura = in.nextDouble();
		
		System.out.println(imc1.calcularImc());
		
		IMC imc2 = new IMC();
		
		System.out.println("Informe o Nome: ");
		imc2.nome = in.next();
		
		System.out.println("Informe a Idade: ");
		imc2.idade = in.nextInt();
		
		System.out.println("Informe o Peso: ");
		imc2.peso = in.nextDouble();
		
		System.out.println("Informe o Altura: ");
		imc2.altura = in.nextDouble();
		
		System.out.println(imc2.calcularImc());
	}

}
