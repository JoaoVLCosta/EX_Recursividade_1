package controller;

public class SomaController {

	public SomaController() {
		
		super();

	}

	public int fnSoma(int N) {
		
		//Condição de parada ==> Quando o valor de N é reduzido a 0. Ou seja, não há mais somas válidas.
		//Essa condicional também serve para retornar 0 para qualquer N negativo ao checar se N <= 0.
		if(N <= 0) {
			return 0;
		} else {
			return N + fnSoma(N-1);
			//Retorno é dado ao somar o valor de N com a chamada de função que recebe N-1 como parâmetro.
		}
		
	}
	
}