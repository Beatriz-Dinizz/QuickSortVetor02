package controller;

import br.edu.fateczl.QuickSort.OrdenacaoQuickSort;

public class ControllerQuickSortEx02 {

	public ControllerQuickSortEx02() {
		super();
	}
	
	public void ordenaVetorQuickSort02() {
		OrdenacaoQuickSort quickSortEx02 = new OrdenacaoQuickSort();
		
		int[] vetor = {44, 43, 42, 41, 40, 39, 38};
		
		vetor = quickSortEx02.quickSort(vetor, 0, vetor.length - 1);
		
		for(int valor : vetor) {
			System.out.print(valor);
			System.out.print(" ");
		}
	}
}
