public class Lion extends Felin{
	public Lion(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public String toString() {
		String s = super.toString();
		s += " C'est un lion.";
		return s;
	}
	
	@Override
	public int getLongevite() {
		return 12;
	}
}
