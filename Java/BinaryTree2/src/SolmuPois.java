class PoisSolmu{
	PoisSolmu left;
	PoisSolmu right;
	int tieto;
}

class Puu{
	public PoisSolmu delete(PoisSolmu PoisSolmu, int val) {
	    if(PoisSolmu == null) {
	    	System.out.println("Deleted this: "+ val);
	    	return PoisSolmu;
	    }
	    
	    if(val < PoisSolmu.tieto) {
	    	//System.out.println("Deleted this: "+ val);
	      PoisSolmu.left = delete(PoisSolmu.left, val);
	    } else if(val > PoisSolmu.tieto) {
	    	//System.out.println("Deleted this: "+ val);
	      PoisSolmu.right = delete(PoisSolmu.right, val);
	    } else {
	    	System.out.println("Deleted this: "+ val);
	      if(PoisSolmu.left == null || PoisSolmu.right == null) {
	    	  //System.out.println("Deleted this: "+ val);
	    	  PoisSolmu temp = PoisSolmu.left != null ? PoisSolmu.left : PoisSolmu.right;

	        if(temp == null) {
	          return null;
	        } else {
	          return temp;
	        }
	      } else {
	        PoisSolmu successor = getSuccessor(PoisSolmu);
	        PoisSolmu.tieto = successor.tieto;
	        
	        PoisSolmu.right = delete(PoisSolmu.right, successor.tieto);
	        return PoisSolmu;
	      }
	    }
	    
	    return PoisSolmu;
	  }
	  
	  public PoisSolmu getSuccessor(PoisSolmu PoisSolmu) {
	    if(PoisSolmu == null) {
	      return null;
	    }
	    
	    PoisSolmu temp = PoisSolmu.right;
	    
	    while(temp.left != null) {
	      temp = temp.left;
	    }
	    
	    return temp;
	  }
	  
	  public PoisSolmu insert(PoisSolmu PoisSolmu, int val) {
	    if(PoisSolmu == null) {
			System.out.println("Inserted this: "+ val);

	      return createNewPoisSolmu(val);
	    }
	    
	    if(val < PoisSolmu.tieto) {
	      PoisSolmu.left = insert(PoisSolmu.left, val);
	    } else if((val > PoisSolmu.tieto)) {
	      PoisSolmu.right = insert(PoisSolmu.right, val);
	    }
	    
	    return PoisSolmu;
	  }
	  
	  public PoisSolmu createNewPoisSolmu(int k) {
	    PoisSolmu a = new PoisSolmu();
	    a.tieto = k;
	    a.left = null;
	    a.right = null;
	    
	    return a;
	  }
}
public class SolmuPois {

	public static void main(String[] args) {
		Puu a = new Puu();
	    PoisSolmu root = null;
	    
	    root = a.insert(root, 8);
	    root = a.insert(root, 3);
	    root = a.insert(root, 6);
	    root = a.insert(root, 10);
	    root = a.insert(root, 4);
	    root = a.insert(root, 7);
	    root = a.insert(root, 1);
	    root = a.insert(root, 14);
	    root = a.insert(root, 13);
	    
	    root = a.delete(root, 8);
	}

}
