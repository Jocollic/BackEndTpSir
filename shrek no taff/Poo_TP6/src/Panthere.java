public class Panthere extends Felin{
	public Panthere(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public String toString() {
		String s = super.toString();
		s += " C'est une panthere.";
		return s;
	}
	
	@Override
	public int getLongevite() {
		return 15;
	}
}
