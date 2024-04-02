package ex5;

public class Produto{
	
	private String nome;
	private double precoCusto, precoVenda, margemLucro;
	
	//NOME
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	//PRECO CUSTO
	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	//PRECO VENDA
	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda (double precoVenda) {
		if (precoVenda < precoCusto) {
			System.out.println("O preço de venda não pode ser inferior a o preço de compra do produto.");
		}else {
			this.precoVenda = precoVenda;
		}
	}

	//MARGEM LUCRO
	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	//METODOS
	public double calcularMargemLucro () {
		double margem = precoVenda - precoCusto;
		setMargemLucro(margem);
		return margem;
	}
	
	public double getMargemPocentagem () {
		return (getMargemLucro() / precoCusto) * 100;
	}
	
	
	
}
