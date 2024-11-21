package tp_9_interface_abstract;

public class Lotissement implements GestionPropriete{

	
	protected Propriété[] tabProp;
	protected int nombre;
	
	public Lotissement(int capacite) {
        
        this.tabProp = new Propriété[capacite];
        this.nombre = 0;
    }
	
	public Propriété getPropriétéByIndex(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        }
        return null;
    }
	
	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public boolean ajoutertabProp(Propriété p) {
		if(nombre < tabProp.length) {
			tabProp[nombre++]=p;
			return true;
		}
		return false;
	}

	@Override
	public void afficherProprietes() {
	    for (int i = 0; i < nombre; i++) { 
	        Propriété p = tabProp[i];
	        if (p != null) {
	            System.out.println(p);
	            System.out.println("Impôts:" + p.calculImpot());
	        }
	    }
	}


	@Override
	public boolean ajouter(Propriété p) {
		if (nombre < tabProp.length) {
            for (int i = 0; i < nombre; i++) {
                if (tabProp[i].getId() == p.getId()) {
                    return false; 
                }
            }
            tabProp[nombre++] = p;
            return true;
        }
        return false;
		
		
	}

	@Override
	public boolean supprimer(Propriété p) {
		for (int i = 0; i < nombre; i++) {
            if (tabProp[i].getId() == p.getId()) {
                for (int j = i; j < nombre - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                tabProp[--nombre] = null;
                return true;
            }
        }
        return false;
	}
	public int getNbPiéces() {
		int totalPieces = 0;
	    for (int i = 0; i < nombre; i++) {
	        Propriété p = tabProp[i];
	        if (p instanceof PropriétéPrivee) {
	            totalPieces += ((PropriétéPrivee) p).getNbPiéces();
	        }
	    }
	    return totalPieces;
    }
	
	
	

	
	

}
