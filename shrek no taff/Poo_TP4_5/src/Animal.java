public abstract class Animal {
	protected String nom;
	protected int age;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract int getLongevite();
	
	@Override
	public String toString() {
		return nom + " a " + age + " ans.";
	}
}
