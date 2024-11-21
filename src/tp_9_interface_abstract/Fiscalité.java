package tp_9_interface_abstract;

public class Fiscalité {
	/*public static void main(String[] args) {
        Personne p1 = new Personne(1, "Ali", "Ben Salah");
        Personne p2 = new Personne(2, "Samir", "Trabelsi");
        Personne p3 = new Personne(3, "Leila", "Hammami");
        Lotissement lotissement = new Lotissement(0);
        lotissement.ajouter(new PropriétéPrivee(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400.5, 6, true));
        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200.8, 3));
        lotissement.ajouter(new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new PropriétéProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));
        lotissement.afficherProprietes();
        System.out.println("Nombre total de pièces : " + lotissement.getNbPiéces());
        Propriété MoinsImpot = null;
        double impotsMin = Double.MAX_VALUE;
        for (int i = 0; i < lotissement.getNombre(); i++) {
            Propriété p = lotissement.getPropriétéByIndex(i);
            if (p instanceof PropriétéPrivee) {
                double impots = p.calculImpot();
                if (impots < impotsMin) {
                    impotsMin = impots;
                    MoinsImpot = p;
                }
            }
        }
        
        if (MoinsImpot != null) {
            System.out.println("Propriété privée avec le moins d'impôts : " + MoinsImpot);
            System.out.println("Impôts : " + impotsMin);
        }
        
        lotissement.supprimer(new Appartement(3, p2, "Hammamet", 1200.8, 3));
        
        lotissement.afficherProprietes();
        

	}*/
	public static void main(String[] args) {
        Personne p1 = new Personne(1, "Zaineb", "BAE");
        Personne p2 = new Personne(2, "Adam", "Hichri");
        Personne p3 = new Personne(3, "Malek", "Bacouch");
        LotissementPrivee lt = new LotissementPrivee(10);
        lt.ajouter(new PropriétéPrivee(1, p1, "Corniche", 350, 4));
        lt.ajouter(new Villa(2, p2, "Dar Chaabane", 400.5, 6, true));
        lt.ajouter(new Appartement(3, p2, "Hammamet", 1200.8, 3));
        lt.ajouter(new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true));
        lt.ajouter(new PropriétéProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));
        lt.afficherProprietes();
        PropriétéPrivee prop = lt.getPropriétéByIndex(0);
        if (prop != null) {
            System.out.println("Propriété à l'indice  : " + prop);
        }
        System.out.println("Nombre total de pièces : " + lt.getNbPiéces());
	}
	

}
