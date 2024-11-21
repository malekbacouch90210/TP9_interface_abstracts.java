package tp_9_interface_abstract;

public class PropriétéProfessionnelle extends Propriété{
	
	private int nbEmployes;
	private boolean estEtatique;
	
	public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double surface,int nbEmployes , boolean estEtatique){
		super(id, responsable, adresse, surface);
		this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
	}

	public int getNbEmployes() {
		return nbEmployes;
	}



	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
	}



	public boolean isEstEtatique() {
		return estEtatique;
	}



	public void setEstEtatique(boolean estEtatique) {
		this.estEtatique = estEtatique;
	}



	@Override
	public double calculImpot(){
		if (estEtatique) {
            return 0;
        }
        return (100 * (getSurface() / 100)) + (30 * nbEmployes);
		
	}
	
	public String toString() {
		return super.toString() + ", nbEmployes=" + nbEmployes + ", estEtatique=" + estEtatique;
	}
	

}
