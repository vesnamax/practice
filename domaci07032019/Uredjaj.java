package domaci07032019;

public class Uredjaj {

//	Uredjaj ima stanje da li je ukljucen ili iskljucen.
//  Njegovo stanje moze da se postavi i da se dohvati.
// Takodje poseduje i jedinstveni identifikator koji se zadaje prilikom
// kreiranja uredjaja i moze da se dohvati.
//	Ispisuje se u formatu “Uredjaj(ID:STATUS)”
//	STATUS treba da ima vrednosti ON i OFF;

//	Televizor je uredjaj koji pored stanje poseduje i kanal tipa string na kom se nalazi. 
// Televizoru moze da se postavi kanal i 
//da se dohvati trenutni kanal, ukoliko je ukljucen.
//	Ispisuje se u formatu “Televizor(ID:STATUS) je na kanalu KANAL”;
//	STATUS treba da ima vrednosti ON i OFF;

//	Laptop je uredjaj koji poseduje RAM memoriju izrazenu u GB, Model procesora (String).
//	Ispisuje se u formatu “Laptop(ID:STATUS)[RAM GB,Model Procesor]”
//	STATUS treba da ima vrednosti ON i OFF;

	private String status;
	private int id;

	
	
	public Uredjaj(int id) {
		this.status="";
		this.id = id;
	}

	

	// geteri i seteri
	public void ukljuci() {
		this.status = "on";

	}

	public void iskljuci() {
		this.status = "off";

	}

	public String getStatus() {
		return this.status;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Uredjaj(" + getId() + ":" + getStatus() + ")";
	}

}
