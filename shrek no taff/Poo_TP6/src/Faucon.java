public class Faucon extends Oiseaux{
	public Faucon(String nom, int age) {
		this.nom = nom;
		this.age = age;
		this.nombreSpectacle = 1;
	}
	
	public String toString() {
		String s = super.toString();
		s += " C'est un faucon.";
		return s;
	}
	
	@Override
	public int getLongevite() {
		return 13;
	}
}
