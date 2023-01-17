public class main {
	public static void main(String[] args) {
		Lion lion = new Lion("Mon super Lion", 0 + (int) (Math.random() * ((12) + 1)));
		Tigre tigre = new Tigre("Mon super Tigre", 0 + (int) (Math.random() * ((23) + 1)));
		Panthere panthere = new Panthere("Mon super Panthere", 0 + (int) (Math.random() * ((15) + 1)));
		Perroquet perroquet = new Perroquet("Mon super Perroquet", 0 + (int) (Math.random() * ((45) + 1)));
		Faucon faucon = new Faucon("Mon super Faucon", 0 + (int) (Math.random() * ((13) + 1)));
		Aigle aigle = new Aigle("Mon super Aigle", 0 + (int) (Math.random() * ((14) + 1)));
		Cerf cerf = new Cerf("Mon super Cerf", 0 + (int) (Math.random() * ((20) + 1)));
		Daim daim = new Daim("Mon super Daim", 0 + (int) (Math.random() * ((20) + 1)));
		Elan elan = new Elan("Mon super Elan", 0 + (int) (Math.random() * ((20) + 1)));
		
		Elan elanPasDansleZoo = new Elan("Mon super Elan pas dans le zoo", 0 + (int) (Math.random() * ((20 - 0) + 1)));
		
		Zoo monZoo = new Zoo(10);
		monZoo.ajouterAnimal(lion);
		monZoo.ajouterAnimal(tigre);
		monZoo.ajouterAnimal(panthere);
		monZoo.ajouterAnimal(perroquet);
		monZoo.ajouterAnimal(faucon);
		monZoo.ajouterAnimal(aigle);
		monZoo.ajouterAnimal(cerf);
		monZoo.ajouterAnimal(daim);
		monZoo.ajouterAnimal(elan);
		
		System.out.println(monZoo.toString());
		monZoo.doyen();
		monZoo.enfants();
		monZoo.ageMoyen();
		
		monZoo.creerSpectacle(monZoo.trouverOiseauMoinsFatigue());
		monZoo.creerSpectacle(monZoo.trouverOiseauMoinsFatigue());
		monZoo.creerSpectacle(monZoo.trouverOiseauMoinsFatigue());
		monZoo.creerSpectacle(monZoo.trouverOiseauMoinsFatigue());
		monZoo.creerSpectacle(monZoo.trouverOiseauMoinsFatigue());
		
		System.out.println(monZoo.toString());
	}
}
