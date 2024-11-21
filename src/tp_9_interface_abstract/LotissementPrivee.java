package tp_9_interface_abstract;

public class LotissementPrivee extends Lotissement {

    public LotissementPrivee(int capacite) {
        super(capacite); 
    }

   
    @Override
    public boolean ajouter(Propriété p) {
        
        if (p instanceof PropriétéPrivee) {
            return super.ajouter(p);
        }
        System.out.println("Erreur");
        return false;
    }

 
    @Override
    public PropriétéPrivee getPropriétéByIndex(int i) {
        if (i >= 0 && i < nombre && tabProp[i] instanceof PropriétéPrivee) {
            return (PropriétéPrivee) tabProp[i];
        }
        return null;
    }


    @Override
    public int getNbPiéces() {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof PropriétéPrivee) {
                totalPieces += ((PropriétéPrivee) tabProp[i]).getNbPiéces();
            }
        }
        return totalPieces;
    }
}
