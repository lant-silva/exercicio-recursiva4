package view;

public class Main {
	public static void main(String[] args) {
		
		int[] vetor = {2,3,6,4,-1,-6,3,10,-9,-7,23,15,-2};
		int tamanho = vetor.length;
		int total =0;
		total = recursivaNegativo(vetor, tamanho);
		
		
		System.out.println(total);
		
	}

	private static int recursivaNegativo(int[] vetor,int tamanho) {
		if(tamanho==0) { // condição de parada
			return 0;
		}else {
			tamanho--;
			int total = recursivaNegativo(vetor, tamanho); // chamada do retorno
			if(vetor[tamanho] < 0) {
				total++;
			}
			return total;
		}
	}
}
