public class Aigle extends Oiseaux{
	public Aigle(String nom, int age) {
		this.nom = nom;
		this.age = age;
		this.nombreSpectacle = 1;
	}
	
	public String toString() {
		String s = super.toString();
		s += " C'est un aigle.";
		return s;
	}
	
	@Override
	public int getLongevite() {
		return 14;
	}
}
