
public class BinaryStringTree {
	private String tieto;
    private BinaryStringTree left;
    private BinaryStringTree right;
 
    public BinaryStringTree() {
        this.tieto = null;
        this.left = null;
        this.right = null;
    }
     
    public BinaryStringTree(String tieto) {
        this.tieto = tieto;
        this.left = null;
        this.right = null;
    }
 
    public static BinaryStringTree createTree( String content ) {
        BinaryStringTree binaaripuu = new BinaryStringTree();
        if( content != null ) {
            //
            // Remove the punctuation from the content
            //
            content = content.replaceAll("(\\w+)\\p{Punct}(\\s|$)", "$1$2");
            String[] words = content.split( " " );
            binaaripuu = new BinaryStringTree();
            for( int i = 0; i < words.length; i++ ) {
                binaaripuu.addNode( words[i]);
            }
        }
        return binaaripuu;
    }
 
     
    // As a convention, if the key to be inserted is less than the key of root
    // node, then key is inserted in
    // left sub-tree; If key is greater, it is inserted in right sub-tree. If it
    // is equal, as a convention, it
    // is inserted in right sub-tree
    public void addNode(String tieto) {
        if (this.tieto == null) {
            this.tieto = tieto;
        } else {
            if (this.tieto.compareTo(tieto) < 0) {
                if (this.left != null) {
                    this.left.addNode(tieto);
                } else {
                    this.left = new BinaryStringTree(tieto);
                }
 
            } else {
                if (this.right != null) {
                    this.right.addNode(tieto);
                } else {
                    this.right = new BinaryStringTree(tieto);
                }
 
            }
        }
    }
     
    //Juurisolmu, vasen lapsi, oikea lapsi. Virallinen järjestys puussa.
    public void esijarjesta() {        
    	System.out.println("Solmu: " + this.tieto);
        if (this.right != null) {        	
            this.right.esijarjesta();            
        }        
        if (this.left != null) {        	
            this.left.esijarjesta();            
        }
    }
    
    //Mitkä aakkoset ovat vasemmassa ja mitkä oikeassa alipuussa.
    public void tellLeftRight() {        
    	System.out.println("Solmu: " + this.tieto);
        if (this.right != null) {
        	System.out.println("vasen oksa:");
            this.right.esijarjesta();            
        }        
        if (this.left != null) {
        	System.out.println("oikea oksa:");
            this.left.esijarjesta();            
        }        
    }
 
    //Vasen lapsi, juurisolmu, oikea lapsi.
    public void sisajarjesta() {
        if (this.right != null) {
            this.right.sisajarjesta();
        }
        System.out.println("Solmu: " + this.tieto);
        if (this.left != null) {
            this.left.sisajarjesta();
        }
    }
 
    //Vasen lapsi, oikea lapsi, juurisolmu.
    public void jalkijarjesta() {
        if (this.right != null) {
            this.right.jalkijarjesta();
        }
        if (this.left != null) {
            this.left.jalkijarjesta();
        }
        System.out.println("Solmu: " + this.tieto);
    }
    
    public void printOrder() {
    	int luku = 0;
    	if (this.right != null) {
            this.right.printOrder();
        }
        if (this.left != null) {
            this.left.printOrder();
        }
        
        
    }
    

	public static void main(String[] args) {
        BinaryStringTree binaaripuu1 = new BinaryStringTree();
        BinaryStringTree binaaripuu2 = new BinaryStringTree();
        BinaryStringTree binaaripuu3 = new BinaryStringTree();
              
        binaaripuu1.addNode("F");
        binaaripuu1.addNode("C");
        binaaripuu1.addNode("G");
        binaaripuu1.addNode("A");
        binaaripuu1.addNode("I");
        binaaripuu1.addNode("D");
        binaaripuu1.addNode("E");
        binaaripuu1.addNode("J");
        binaaripuu1.addNode("H");
        binaaripuu1.addNode("B");
       
        System.out.println("Puu1: ");
        binaaripuu1.esijarjesta();
        System.out.println(" ");
        System.out.println("Mitkä missä:");
        binaaripuu1.tellLeftRight();
        System.out.println(" ");
        System.out.println("Puu1 printorder ");
        binaaripuu1.printOrder();
        
        System.out.println(" ");
        
        binaaripuu2.addNode("F");
        binaaripuu2.addNode("I");
        binaaripuu2.addNode("G");
        binaaripuu2.addNode("H");
        binaaripuu2.addNode("B");
        binaaripuu2.addNode("A");
        binaaripuu2.addNode("D");
        binaaripuu2.addNode("C");
        binaaripuu2.addNode("J");
        binaaripuu2.addNode("E");
        
        System.out.println("Puu2: ");
        binaaripuu2.esijarjesta();
        System.out.println(" ");
        System.out.println("Mitkä missä:");
        binaaripuu2.tellLeftRight();

        
        System.out.println(" ");
        
        binaaripuu3.addNode("F");
        binaaripuu3.addNode("E");
        binaaripuu3.addNode("I");
        binaaripuu3.addNode("C");
        binaaripuu3.addNode("B");
        binaaripuu3.addNode("G");
        binaaripuu3.addNode("A");
        binaaripuu3.addNode("H");
        binaaripuu3.addNode("D");
        binaaripuu3.addNode("J");
        
        System.out.println("Puu3: ");
        binaaripuu3.esijarjesta();
        System.out.println(" ");
        System.out.println("Mitkä missä:");
        binaaripuu3.tellLeftRight();
	}

}
