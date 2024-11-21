package tp_9_interface_abstract;

public abstract class Propriété {
	private int id;
    private Personne responsable;
    private String adresse;
    private double surface;
    
    public Propriété(int id, Personne responsable, String adresse, double surface) {
        this.id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surface = surface;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Personne getResponsable() {
		return responsable;
	}

	public void setResponsable(Personne responsable) {
		this.responsable = responsable;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	@Override
	 public String toString() {
        return "Propriete[id=" + id + ", responsable=" + responsable.toString() +", adresse=" + adresse + ", surface=" + surface + "]";
    }
	 public abstract double calculImpot();
}
