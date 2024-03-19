package ex1;

public class IMC {

	String nome;
	int idade;
	double peso, altura;
	
	String calcularImc () {
		
		double imc = peso / (altura * altura);
		imc = Math.round(imc * 100.0) / 100.0;
		
		if (imc < 18.5) {
			return ("Seu imc é " + imc + " Abaixo do peso");
		}else if (imc < 25) {
			return ("Seu imc é " + imc + " Peso normal");
		}else if (imc < 30) {
			return ("Seu imc é " + imc + " Sobrepeso");
		}else if (imc < 35) {
			return ("Seu imc é " + imc + " Obesidade grau 1");
		}else if (imc < 40) {
			return ("Seu imc é " + imc + " Obesidade grau 2");
		}else {
			return ("Seu imc é " + imc + " Obesidade grau 3 ");
		}
		
		
		
	}
	
}
