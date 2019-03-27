package domaci07032019;

public class Laptop extends Uredjaj {

	private int ram;
	private String procesor;

	

	public Laptop(int id) {
		super(id);
	}

	public Laptop(int id, int ram, String procesor) {
		super(id);
		this.ram = ram;
		this.procesor = procesor;
	}

	@Override
	public String toString() {
		return "Laptop (" + getId() + ":" + getStatus() + ")[" + this.ram + "GB," + this.procesor + " processor]";
	}

}
