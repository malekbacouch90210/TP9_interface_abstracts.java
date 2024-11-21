package tp_9_interface_abstract;

public class PropriétéPrivee extends Propriété{
	
	private int nbPiéces;

	public PropriétéPrivee(int id, Personne responsable, String adresse, double surface,int nbPiéces) {
		super(id, responsable, adresse, surface);
		this.nbPiéces=nbPiéces;
	}
	
	

	public int getNbPiéces() {
		return nbPiéces;
	}



	public void setNbPieces(int nbPiéces) {
		this.nbPiéces = nbPiéces;
	}


	@Override
	public double calculImpot() {
		return (50 * (getSurface() / 100)) + (10 * nbPiéces);
	}



	@Override
	public String toString() {
		return super.toString()+"PropriétéPrivee [nbPieces=" + nbPiéces + ", Impot =" + calculImpot() + "]";
	}
	
	
}
