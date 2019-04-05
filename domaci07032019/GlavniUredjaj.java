package domaci07032019;

public class GlavniUredjaj {

	public static void main(String[] args) {

		Uredjaj u1 = new Uredjaj(2);
		u1.ukljuci();
		Uredjaj u2 = new Uredjaj(16);
		u2.iskljuci();

		System.out.println(u1.toString());
		System.out.println(u2.toString());

		Laptop l1 = new Laptop(2, 8, "intel");
		l1.iskljuci();
		System.out.println(l1.toString());

		Tv t1 = new Tv(3, "TV Sabac");
		t1.ukljuci();

		System.out.println(t1.toString());

	}

}
