import java.util.Scanner;

public class DongulerOrnek4 {

	public static void main(String[] args) {
		/*
		 * N elemanlý bir kümenin elemanlarý ile oluþturulacak r elemanlý farklý
		 * gruplarýn sayýsý n’in r’li kombinasyonu olarak adlandýrýlýr. N’in r’li
		 * kombinasyonu C(n,r) þeklinde gösterilir.
		 * 
		 * Java ile kombinasyon hesaplayan program yazýnýz.
		 * 
		 * Kombinasyon formülü C(n,r) = n! / (r! * (n-r)!)
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("n sayýsýný giriniz : ");

		int n = scan.nextInt();

		System.out.print("r sayýsýný giriniz : ");

		int r = scan.nextInt();
		
		int x = n - r;

		int n_faktoriel = 1;

		for (int i = 1; i <= n; i++) {
			n_faktoriel = n_faktoriel * i;
		}
		
		System.out.println(n+" deðerinin faktoriyeli : " +n_faktoriel);

		int r_faktoriel = 1;

		for (int i = 1; i <= r; i++) {
			r_faktoriel = r_faktoriel * i;
		}
		
		System.out.println(r+" deðerinin faktoriyeli : " +r_faktoriel);
		
		int x_faktoriel = 1;
		for(int i=1; i<=x; i++) {
			x_faktoriel = x_faktoriel * i;
		}
		
		System.out.println("n - r deðerinin faktoriyeli : " +x_faktoriel);
		
		int combinasyon = (n_faktoriel) / (r_faktoriel * x_faktoriel);
		
		System.out.println(n+" nin " + r + " li combinasyonu : " +combinasyon );

	}

}
