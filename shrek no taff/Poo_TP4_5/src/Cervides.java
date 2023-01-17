public class Cervides extends Animal {
	public String toString() {
		String s = super.toString();
		s += " C'est un cervidé";
		return s;
	}

	@Override
	public int getLongevite() {
		return 20;
	}

}
