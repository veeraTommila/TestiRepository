/**
 * 
 */
/**
 * @author Veera Tommila
 *
 */
public class Solmu {
	//Bin‰‰rihaun toteutukseen. 
		Solmu left, right;
		int tieto;
		int key;
		
		public Solmu(int tieto) {	//Julkinen olion muodostinfunktio Solmu.
			this.tieto = tieto;
		}
		
		public void lisaaSolmu(int arvo) {
			if (arvo <= tieto) {
				if (left == null) {	//Jos vasen haara on tyhj‰.
					left = new Solmu(arvo);	//Jos siell‰ ei ole vasenta solmua, lis‰t‰‰n solmu.
				} else {
					left.lisaaSolmu(arvo);
				}
			} else {
				if  (right == null) {	//Jos oikea haara on tyhj‰. 
					right = new Solmu(arvo);	//Jos ei ole oikeata solmua, lis‰t‰‰n solmu.
				} else {
					right.lisaaSolmu(arvo);
				}
			}
		}		
		
		public boolean sisaltaa(int arvo) {
			 if (arvo == tieto) {
				 return true;
			 } else if ( arvo < tieto) {
				 if ( left == null) {
					 return false;
				 } else {
					 return left.sisaltaa(arvo);
				 }				
			 } else {
				 if (right == null) {
					 return false;
				 } else {
					 return right.sisaltaa(arvo);
				 }
			 }
		}
		
		public void poistaSolmu(int arvo) {
			if (arvo >= tieto) {
				if (left != null) {	
					left = new Solmu(arvo);	
				} else {
					left.poistaSolmu(arvo);
				}
				System.out.println("Poistettiin: "+arvo);
			} else {
				if  (right != null) {	
					right = new Solmu(arvo);	
				} else {
					right.poistaSolmu(arvo);
				}
			}
		}
		
		
		
		public void pintaa() {
			if (left != null) {	//Jos vasen lapsi on olemassa, tulostetaan se ensin ulos.
				left.sisajarjesta();
			}
			System.out.println("Solmu: "+tieto);	//Tulostetaan tieto.
			if (right != null) {	//Jos oikea lapsi on olemassa, tulostetaan se ensin ulos.
				right.sisajarjesta();
			}
		}
		
	    //Juurisolmu, vasen lapsi, oikea lapsi. Virallinen j‰rjestys puussa.
		public void esijarjesta() {        
			System.out.println("Solmu: " + tieto);
	        if (this.right != null) {        	
	            this.right.esijarjesta();            
	        }        
	        if (this.left != null) {        	
	            this.left.esijarjesta();            
	        }
	    }
		
	    //Vasen lapsi, juurisolmu, oikea lapsi.
	public void sisajarjesta() {        
			if (this.left != null) {        	
	            this.left.sisajarjesta();            
	        }     
	        System.out.println("Solmu: " + tieto);
	        if (this.right != null) {        	
	            this.right.sisajarjesta();            
	        }
	    }
		
	    //Vasen lapsi, oikea lapsi, juurisolmu.
		void jalkijarjesta() { 
	        if (this.right != null) {        	
	            this.right.jalkijarjesta();            
	        }        
	        if (this.left != null) {        	
	            this.left.jalkijarjesta();            
	        }
	        System.out.println("Solmu: " + tieto);
	    }
		
		public void tellLeftRight() {        
	    	System.out.println("Solmu: " + tieto);
	        if (this.left != null) {
	        	System.out.println("Vasemman alipuun numerot:");
	            this.left.esijarjesta();            
	        }        
	        if (this.right != null) {
	        	System.out.println("Oikean alipuun numerot:");
	            this.right.esijarjesta();            
	        }        
	    }
		

	public static void main(String[] args) {
		//Luodaan olio bin‰‰ripuun muodostukseen.
		Solmu solmu1 = new Solmu(5); //Alkuarvo = puun juurinumero on 5.
		Solmu solmu2 = new Solmu(10);
		
		//Lis‰t‰‰n solmuja bin‰‰ripuuhun. 
		//solmu1.lisaaSolmu(10);
		solmu1.lisaaSolmu(1);
		solmu1.lisaaSolmu(2);
		solmu1.lisaaSolmu(3);
		solmu1.lisaaSolmu(4);
		//solmu1.lisaaSolmu(5);
		solmu1.lisaaSolmu(6);
		solmu1.lisaaSolmu(7);
		solmu1.lisaaSolmu(8);
		solmu1.lisaaSolmu(9);
		solmu1.lisaaSolmu(10);
		solmu1.lisaaSolmu(11);
		
		//Tulostetaan bin‰‰ripuun solmut. Huomaa tulostusj‰rjestyksen ero!
		System.out.println("");
        System.out.println("Mitk‰ ovat vasemmassa oksassa ja mitk‰ oikeassa oksassa:");
		solmu1.tellLeftRight();
		System.out.println("");
		System.out.println("Esij‰rjestys:");
		solmu1.esijarjesta();
		System.out.println("");
		System.out.println("Sis‰j‰rjestys");
		solmu1.sisajarjesta();
		System.out.println("");
		System.out.println("J‰lkij‰rjestys:");
		solmu1.jalkijarjesta();
		System.out.println("");		
		
		solmu2.lisaaSolmu(5);
		solmu2.lisaaSolmu(9);
		solmu2.lisaaSolmu(3);
		solmu2.lisaaSolmu(4);
		solmu2.lisaaSolmu(1);
		solmu2.lisaaSolmu(20);
		solmu2.lisaaSolmu(15);
		solmu2.lisaaSolmu(17);
		solmu2.lisaaSolmu(13);
		solmu2.lisaaSolmu(25);
		solmu2.lisaaSolmu(30);
		
		System.out.println("");
        System.out.println("Mitk‰ ovat vasemmassa oksassa ja mitk‰ oikeassa oksassa:");
        solmu2.tellLeftRight();
		System.out.println("");
		System.out.println("Esij‰rjestys:");
		solmu2.esijarjesta();
		System.out.println("");
		System.out.println("Sis‰j‰rjestys");
		solmu2.sisajarjesta();
		System.out.println("");
		System.out.println("J‰lkij‰rjestys:");
		solmu2.jalkijarjesta();
		System.out.println("");		
		

	}

}
