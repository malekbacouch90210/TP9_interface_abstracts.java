package tp_9_interface_abstract;

public class Villa extends PropriétéPrivee{
	private boolean avecPiscine;
	public Villa(int id, Personne responsable, String adresse, double surface, int nbPieces,boolean avecPiscine) {
		super(id, responsable, adresse, surface, nbPieces);
		this.avecPiscine=avecPiscine;
		
	}
	public boolean isAvecPiscine(){
		return avecPiscine;
	}

	public void setAvecPiscine(boolean avecPiscine) {
		this.avecPiscine = avecPiscine;
	}
	public String toString(){
		return super.toString()+"avecPiscine ="+avecPiscine;
	}
	
	

}
