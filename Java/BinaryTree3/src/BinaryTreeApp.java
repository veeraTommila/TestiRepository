class Solmu {
  Solmu left;
  Solmu right;
  int tieto;
}

class BinaryTree {
 
//Vasen lapsi, juurisolmu, oikea lapsi.
  public void sisajarjesta(Solmu solmu) {
    if(solmu == null) {
      return;
    }
    
    sisajarjesta(solmu.left);
    System.out.print(solmu.tieto + " ");
    sisajarjesta(solmu.right);
  }
  
//Juurisolmu, vasen lapsi, oikea lapsi. Virallinen järjestys puussa.
  public void esijarjesta(Solmu solmu) {
    if(solmu == null) {
      return;
    }
    
    System.out.print(solmu.tieto + " ");
    esijarjesta(solmu.left);
    esijarjesta(solmu.right);
  }
  
//Vasen lapsi, oikea lapsi, juurisolmu.
  public void jalkijarjesta(Solmu solmu) {
    if(solmu == null) {
      return;
    }
    
    jalkijarjesta(solmu.left);
    jalkijarjesta(solmu.right);
    System.out.print(solmu.tieto + " ");
  }
  
  public Solmu luoSolmu(int arvo) {
    Solmu newNode = new Solmu();
    newNode.tieto = arvo;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
}

public class BinaryTreeApp {

	public static void main(String[] args) {
		  BinaryTree puu = new BinaryTree();
		    
		    Solmu root = puu.luoSolmu(10);
		    root.left = puu.luoSolmu(5);
		    root.right = puu.luoSolmu(20);
		    
		    root.left.left = puu.luoSolmu(3);
		    root.left.right = puu.luoSolmu(9);
		    root.left.left.left = puu.luoSolmu(1);
		    root.left.left.right = puu.luoSolmu(4);    
		    root.right.right = puu.luoSolmu(25);
		    root.right.left = puu.luoSolmu(15);
		    root.right.left.right = puu.luoSolmu(17);
		    root.right.left.left = puu.luoSolmu(13);
		    root.right.right.right = puu.luoSolmu(30);
		    
		    System.out.print("Sisäjärjestys: ");
		    puu.sisajarjesta(root);
		    System.out.println();

		    System.out.print("Esijärjestys: ");
		    puu.esijarjesta(root);
		    System.out.println();
		    
		    System.out.print("Jälkijärjestys: ");
		    puu.jalkijarjesta(root);
		    System.out.println();
		    
		    System.out.println(" ");
		    BinaryTree puu2 = new BinaryTree();
		    
		    Solmu root2 = puu2.luoSolmu(3);
		    root2.left = puu2.luoSolmu(7);
		    root2.right = puu2.luoSolmu(5);
		    root2.left.left = puu2.luoSolmu(2);
		    root2.left.left.left = puu2.luoSolmu(1);
		    root2.left.right = puu2.luoSolmu(6);
		    root2.left.right.left = puu2.luoSolmu(5);
		    root2.left.right.right = puu2.luoSolmu(11);
		    root2.right.right = puu2.luoSolmu(9);
		    root2.right.right.right = puu2.luoSolmu(12);
		    root2.right.right.left = puu2.luoSolmu(4);
		    
		    System.out.print("Sisäjärjestys: ");
		    puu2.sisajarjesta(root2);
		    System.out.println();

		    System.out.print("Esijärjestys: ");
		    puu2.esijarjesta(root2);
		    System.out.println();
		    
		    System.out.print("Jälkijärjestys: ");
		    puu2.jalkijarjesta(root2);
		    System.out.println();

	}

}
