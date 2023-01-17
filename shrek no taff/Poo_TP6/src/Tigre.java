public class Tigre extends Felin{
	public Tigre(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public String toString() {
		String s = super.toString();
		s += " C'est un tigre.";
		return s;
	}
	
	@Override
	public int getLongevite() {
		return 23;
	}
}
