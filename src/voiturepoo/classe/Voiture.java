package voiturepoo.classe;
	/*Créer un repository dans GitHub avec le nom voiture-poo
		• Définir une classe Voiture avec les attributs suivants : marque, vitesse, puissance.
		• Définir un constructeur permettant d’initialiser les attributs d'un objet voiture par des
		valeurs passées en paramètre.
		• Définir la méthode toString() permettant d’afficher les informations d'une voiture.
		• Ecrire un programme pour tester la classe Voiture :
		o Créer des instances de la classe voiture
		o Mettre chacune de ces instances dans un tableau de type, par exemple comme
		cela :
		Voiture[] voitures = new Voiture[nbVoiture] ;
		o Afficher le contenu du tableau et donc les caractéristiques de chacune des
		voitures (cf. méthode toString() de la classe Voiture).
	*/
public class Voiture {

	private String marque ="";
	private int vitesse =0;
	private int puissance =1;
	
	
	
	
	
	public Voiture(String marque, int vitesse, int puissance) {
		super();
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
	}




	public String toString() {
		return "Voiture [marque=" + marque + ", vitesse=" + vitesse + ", puissance=" + puissance + "]";
	}
	
	
	
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	
}
