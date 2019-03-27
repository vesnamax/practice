package domaci08032019;

public abstract class Parcela {
	public static int uid=1;
/*	Parcela ima jedinstven automatski generisan celobrojan identifikator i
	zadatu povrsinu(u kvadratnim metrima) prilikom kreiranja. 
	Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char). 
	Moze da joj se odredi prinos u periodu zadatom brojem godina. 
	Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRSINA].


	Suma je parcela koja ima zadate 
	-povrsinu koju zauzimaju stabla, 
	-prinos po zrelom stablu i 
	-period sazrevanja od zasada do sece izraZen u celom broju godina. 
	Oznaka vrste je S. 
	Prinos se ostvaruje formulom povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje). 
	Tekstualni oblik je *Parcela:(povrsstabla,prinosSt,Period).
	*Ovo se ostvaruje pozivom super.toString();

	Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru.
	Prinos po kvadratnom metru moze da se promeni.
	Oznaka vrste je N. Prinos njive se racuna po formuli: povrsina_parcele*prinosPoKvM. 
	Tekstualni oblik je Parcela:PrinosPoKvM.

	Napisati i glavni program koji kreira niz parcela koje mogu da budu ili sume ili njive i 
	ispisuje njihov prinos u toku 3 godine.
	
	
	*/
	private int id;
	private double povrsina;

	public Parcela(double povrsina) {//povrsina je zadata
		this.povrsina = povrsina;
		this.id = uid++;
	}

	public int getId() {//dohvati id
		return id;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public abstract char getVrsta();//moze da se dohvati vrsta
	
	public abstract double prinos(int brGodina);//Moze da joj se odredi prinos u periodu zadatom brojem godina. 

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getVrsta()).append("-").append(id).append("[");
		sb.append(povrsina).append("]");
		return sb.toString() ;
	}
	
	
	
	

}
