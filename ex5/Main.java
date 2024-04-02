package ex5;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		Produto pro1 = new Produto();
		
		System.out.println("Informe o nome do produto:");
		pro1.setNome(in.next());
		
		System.out.println("Informe o preço de custo:");	
		pro1.setPrecoCusto(in.nextDouble());
		
		System.out.println("Informe o preço de venda:");
		pro1.setPrecoVenda(in.nextDouble());
		
		System.out.println("Produto: " + pro1.getNome());
        System.out.printf("Lucro: R$%.2f\n", pro1.calcularMargemLucro());
        System.out.printf("Porcentagem de lucro: %.2f%%\n", pro1.getMargemPocentagem());
		
		
	}

}
