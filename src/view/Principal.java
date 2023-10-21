package view;

import javax.swing.JOptionPane;

import controller.IUControle;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		IUControle iu = new IUControle();
		Lista<Integer> A = new Lista<Integer>();
		Lista<Integer> B = new Lista<Integer>();
		
		A.addFirst(16);
		A.addFirst(7);
		A.addFirst(9);
		A.addFirst(12);
		A.addFirst(8);
		A.addFirst(5);
		A.addFirst(3);
		
		B.addFirst(7);
		B.addFirst(3);
		B.addFirst(2);
		B.addFirst(6);
		B.addFirst(9);
		
		
		int x = 0;
		
		while (x!=9) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 - Gerar Lista Intersecção\n2 - Gerar Lista União\n9 - Fim"));
			switch(x) {
			case 1:
				iu.Interseccao(A, B);
				break;
			case 2:
				iu.Uniao(A, B);
				break;
			case 9:
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}	
		}
		
	}

}
