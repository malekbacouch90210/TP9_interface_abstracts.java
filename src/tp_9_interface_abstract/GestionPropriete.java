package tp_9_interface_abstract;

public interface GestionPropriete {
	int MAX_PROPRIETES = 10;
    void afficherProprietes();
    boolean ajouter(Propriété p);
    boolean supprimer(Propriété p);

}
