package domaci08032019;

public class Njiva extends Parcela {
//	Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru.
//	Prinos po kvadratnom metru moze da se promeni.
//	Oznaka vrste je N. Prinos njive se racuna po formuli: povrsina_parcele*prinosPoKvM. 
//	Tekstualni oblik je Parcela:PrinosPoKvM.

	private double prinosPoKvM;


	public Njiva(double povrsina, double prinosPoKvM) {
		super(povrsina);
		this.prinosPoKvM = prinosPoKvM;
	}

	public void setPrinosPoKvM(double prinosPoKvM) {
		this.prinosPoKvM = prinosPoKvM;
	}

	public double getPrinosPoKvM() {
		return prinosPoKvM;
	}

	@Override
	public char getVrsta() {
		return 'N';
	}

	@Override
	public double prinos(int brGodina) {

		return getPovrsina() * getPrinosPoKvM() * brGodina;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(":").append(prinosPoKvM).append(".");
		return sb.toString();
	}

	


}
