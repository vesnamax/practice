package domaci08032019;

public class GlavniParcela {

	public static void main(String[] args) {
		Parcela[]parcele=new Parcela[3];
		int brGodina=3;
		
		parcele[0]=new Suma(200,130, 250, 3);
		parcele[1]=new Njiva(100, 150);
		parcele[2]=new Suma(20, 10, 15, 1);
		 
		System.out.println(parcele[0].prinos(brGodina));
		System.out.println(parcele[0].toString());

		
		System.out.println(parcele[1].prinos(brGodina));
		System.out.println(parcele[1].toString());
		
		System.out.println(parcele[2].prinos(brGodina));
		System.out.println(parcele[2].toString());
	}

}
