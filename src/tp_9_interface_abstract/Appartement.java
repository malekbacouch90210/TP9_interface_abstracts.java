package tp_9_interface_abstract;

public class Appartement extends PropriétéPrivee{
	private int numEtage;

	public Appartement(int id, Personne responsable, String adresse, double surface, int nbPieces) {
		super(id, responsable, adresse, surface, nbPieces);
		this.numEtage=numEtage;
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	public String toString() {
		return super.toString()+",numEtage="+numEtage;
	}
	
	

}
