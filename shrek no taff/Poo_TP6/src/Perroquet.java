public class Perroquet extends Oiseaux{
	public Perroquet(String nom, int age) {
		this.nom = nom;
		this.age = age;
		this.nombreSpectacle = 1;
	}
	
	@Override
	public int getLongevite() {
		return 45;
	}
}
