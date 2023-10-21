package controller;

import model.Lista;

public class IUControle {

	public IUControle() {
		super();
	}
	
	public void Interseccao(Lista<Integer> A, Lista<Integer>B) {
		ListaControle lc  = new ListaControle();
		Lista<Integer> I = new Lista<Integer>();
		int tamanhoA = A.size();
		int tamanhoB = B.size();
		int i, j, a, b;
		for (i = 0;i<tamanhoA;i++) {
			for (j = 0;j<tamanhoB;j++) {
				try {
					a = A.get(i);
					b = B.get(j);
					if (a==b) {
						I.addFirst(a);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		lc.ListaBubbleInt(I);
		
		int tamanho = I.size();
		System.out.println("Lista Insersecção: ");
		for (i = 0; i<tamanho; i++) {
			try {
				a = I.get(i);
				System.out.print(a + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println();
	}
	
	public void Uniao(Lista<Integer>A, Lista<Integer> B) {
		ListaControle lc  = new ListaControle();
		Lista<Integer> U = new Lista<Integer>();
		int tamanhoA = A.size();
		int tamanhoB = B.size();
		int i, a;
		for (i = 0;i<tamanhoA;i++) {
			try {
				a = A.get(i);
				U.addFirst(a);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (i = 0;i<tamanhoB;i++) {
			try {
				a = B.get(i);
				U.addFirst(a);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		lc.ListaBubbleInt(U);
		
		int tamanho = U.size();
		System.out.println("Lista União: ");
		for (i = 0; i<tamanho; i++) {
			try {
				a = U.get(i);
				System.out.print(a + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println();
		
	}

}
