package domaci07032019;

public class Tv extends Uredjaj {

	private String kanal;
	

	public Tv(int id) {
		super(id);
	}

	public Tv(int id, String kanal) {
		super(id);
		this.kanal = kanal;

	}
	//Televizoru moze da se postavi kanal i 
	//da se dohvati trenutni kanal, ukoliko je ukljucen.
	public String getKanal() {
		if (getStatus() == "on")

			return kanal;
		else
			return "tv nije ukljucen";
	}

	public void setKanal(String kanal) {
		this.kanal = kanal;
	}

	@Override
	public String toString() {
		return "Televizor(" + getId() + ":" + getStatus() + ") je na kanalu " + getKanal();
	}

}
