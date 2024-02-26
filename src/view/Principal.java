package view;

import controller.SomaController;

public class Principal {

		public static void main(String[] args) {
			
			int N = 10;
			
			int resposta = 0;
			
			SomaController sc = new SomaController();
			
			resposta = sc.fnSoma(N);
			
			System.out.print(resposta);
			
		}
	
}
