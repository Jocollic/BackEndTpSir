public abstract class Oiseaux extends Animal{
	protected int nombreSpectacle;
	
	public String toString() {
		String s = super.toString();
		s += " C'est un Oiseau qui a fait " + nombreSpectacle + " spectacles.";
		return s;
	}
	
}
