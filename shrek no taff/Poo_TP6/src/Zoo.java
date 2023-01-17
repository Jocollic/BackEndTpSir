import java.util.*;
public class Zoo {
	private List<Animal> tabAnim = new ArrayList<Animal>();
	private int capaciteeTotale;
	private int nbAnim;

	public Zoo(int cap) {
		this.capaciteeTotale = cap;
		nbAnim = 0;
	}

	public void creerSpectacle(Oiseaux monBelOiseau) {
		System.out.println(monBelOiseau.nom + " participe a son " + monBelOiseau.nombreSpectacle + "em spectacle");
		monBelOiseau.nombreSpectacle++;
	}
	
	private String trouverAnimal(Animal i) {
		String s = i.getClass().toString();
		s = s.substring(6);
		s = s.toLowerCase();
		return s;
	}
	
	public Oiseaux trouverOiseauMoinsFatigue() {
		int nbSpectacles = -1;
		Oiseaux oizo = null;
		for(Animal i : tabAnim) {
			if(i instanceof Oiseaux) {
				if(nbSpectacles == -1) {
					nbSpectacles = ((Oiseaux) i).nombreSpectacle;
					oizo = (Oiseaux) i;
				}
				else if(((Oiseaux) i).nombreSpectacle < nbSpectacles) {
					nbSpectacles = ((Oiseaux) i).nombreSpectacle;
					oizo = (Oiseaux) i;
				}
			}
		}
		try {
			if(oizo == null)
				throw new Exception("Il n'y a pas d'oiseaux dans votre joli zoo");			
		} catch (Exception e){
			System.out.println(e);
		}
		return oizo;
	}

	public void ajouterAnimal(Animal a) {
		try {
			if(nbAnim == capaciteeTotale) {
				throw new Exception("Ohlala c'est plein");
			} else {
				tabAnim.add(a);
				nbAnim++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void supprimerAnimal(Animal a) {
		try {
			if(tabAnim.contains(a)) {
				tabAnim.remove(a);				
			}
			else {
				throw new Exception("AAAAAH vous retirez un animal non présent dans le zoo");				
			}
		} catch (Exception e){
			System.out.println(e);
		}

	}

	@Override
	public String toString() {
		String s = "";
		for(Animal i : tabAnim) {
			s += i.getNom() + " est un super " + trouverAnimal(i) + ". Il a " + i.age +" ans.\n";
		}

		return s;
	}

	public void doyen() {
		int index = 0;
		int max = tabAnim.get(index).age;
		for(Animal i : tabAnim) {
			if(i.age > max) {
				max = i.age;
				index = tabAnim.indexOf(i);
			}
		}

		System.out.println("Le plus agé des animaux est " + tabAnim.get(index).nom + 
				". Il a l'âge canonique de " + tabAnim.get(index).age + " ans");

	} 

	public void ageMoyen() {
		int totalAges = 0; 
		for(Animal a : tabAnim) {
			totalAges += a.age;
		}

		System.out.println("L'âge moyen des animaux est de " + (float)totalAges/tabAnim.size());
	}

	public void enfants() {
		for(Animal i : tabAnim) {
			if(i.age <= 0.25 * i.getLongevite()) {
				System.out.println(i.nom + " est un bébé. Oh le bébé. Il a " + i.age + " années.");
			}
		}
	}
}
