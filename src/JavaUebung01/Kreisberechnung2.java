package JavaUebung01;

/* Kreisberechnung: Für einen Kreis werden der Umfang und der
 * Flächeninhalt berechnet.
 * Der Radius wird beim Programmstart als erstrer Parameter und die
 * Einheit wird als zweiter Parameter übergeben.
 */

public class Kreisberechnung2 {
	
	public static void main(String[] args) {
		double radius, umfang, inhalt;
		String einheit;
		
		einheit = args[1];
		radius = Double.parseDouble(args[0]);
		umfang = 2.0 * 3.1415926 * radius;
		inhalt = 3.1415926 * radius * radius;
		
		System.out.print("Umfang: ");
		System.out.println(umfang + " " + einheit);
		System.out.print("Flaeche: ");
		System.out.println(inhalt + " " + einheit + '\u00b2');
	}

}
