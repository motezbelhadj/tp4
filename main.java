package employe;


public class main {
	

    public static void main(String[] args) {
    	 Salaire[] tab=new Salaire[5];

        
    	Employe p1 =new Employe(12345,"Walid",2002,15,4);
    	Vendeur p2 =new Vendeur(23445,"Yessine",2007,1000,0.1);
    	Vendeur p3 =new Vendeur(65478,"Nassime",2000,700,0.1);
    	Employe p4 =new Employe(87698,"Aymen ",2003,19,5);
    	Employe p5 =new Employe(12345,"Khaled",2008,7,4);
    	 tab[0] = p1;
         tab[1] =p2;
         tab[2] = p3;
         tab[3] = p4;
         tab[4] = p5;
     
 		System.out.println("**********************************************list des employés******************************************");

        for(int i=0;i<5;i++) {
        	if(tab[i] instanceof Employe) {
        		System.out.println(tab[i].toString());
        	}
        }
 		System.out.println("**********************************************list des vendeurs******************************************");

        for(int i=0;i<5;i++) {
        	if(tab[i] instanceof Vendeur) {
        		System.out.println(tab[i].toString());
        	}
        	
        }
    	Salaire minV=tab[0];
    	
        for(int i=1;i<5;i++) {
        	if(minV.recrutement<tab[i].recrutement) {
        		minV=tab[i];
        	}

        }
        System.out.println("******************* Nom du salarié le plus ancien dans l'entreprise ********************");
        System.out.println(minV.toString());
   	 Salaire maxe=new Salaire();
        for(Salaire s:tab) {
        	if(s instanceof Vendeur) {
        		if(((Vendeur) s).Salaire()>maxe.salaireDate()) {
        			maxe=s;
        		}
        	}

        }
        
        System.out.println("****************** Matricule du vendeur disposant du plus grand salaire ****************");
        System.out.println(maxe.toString());

    	
    	
}
}