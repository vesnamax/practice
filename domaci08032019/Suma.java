package domaci08032019;

public class Suma extends Parcela {

	/*
	 * Suma je parcela koja ima zadate 
	 * -povrsinu koju zauzimaju stabla, 
	 * -prinos po zrelom stablu i 
	 * -period sazrevanja od zasada do sece izraZen u celom broju godina. 
	 * Oznaka vrste je S. 
	 * Prinos se ostvaruje formulom
	 * povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
	 * Tekstualni oblik je *Parcela:(povrsstabla,prinosSt,Period).
	 * Ovo se ostvaruje pozivom super.toString();
	 */
	private double povrsinaStabla;
	private double prinosStablo;
	private int sazrevanje;

	public Suma(double povrsina, double povrsinaStabla, double prinosStablo, int sazrevanje) {
		super(povrsina);

		this.povrsinaStabla = povrsinaStabla;
		this.prinosStablo = prinosStablo;
		this.sazrevanje = sazrevanje;
	}

	@Override
	public char getVrsta() {

		return 'S';

	}

	@Override
	public double prinos(int brGodina) {
		// Prinos se ostvaruje formulom
		 // povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
		return getPovrsina() / povrsinaStabla * prinosStablo * brGodina / sazrevanje;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(":(").append(povrsinaStabla).append(",").append(prinosStablo).append(",");
		sb.append(sazrevanje).append(")");
		return sb.toString();
	}
	//Parcela:(povrsstabla,prinosSt,Period)

}
