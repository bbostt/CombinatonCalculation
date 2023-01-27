import java.util.Scanner;

public class DongulerOrnek4 {

	public static void main(String[] args) {
		/*
		 * N elemanl� bir k�menin elemanlar� ile olu�turulacak r elemanl� farkl�
		 * gruplar�n say�s� n�in r�li kombinasyonu olarak adland�r�l�r. N�in r�li
		 * kombinasyonu C(n,r) �eklinde g�sterilir.
		 * 
		 * Java ile kombinasyon hesaplayan program yaz�n�z.
		 * 
		 * Kombinasyon form�l� C(n,r) = n! / (r! * (n-r)!)
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("n say�s�n� giriniz : ");

		int n = scan.nextInt();

		System.out.print("r say�s�n� giriniz : ");

		int r = scan.nextInt();
		
		int x = n - r;

		int n_faktoriel = 1;

		for (int i = 1; i <= n; i++) {
			n_faktoriel = n_faktoriel * i;
		}
		
		System.out.println(n+" de�erinin faktoriyeli : " +n_faktoriel);

		int r_faktoriel = 1;

		for (int i = 1; i <= r; i++) {
			r_faktoriel = r_faktoriel * i;
		}
		
		System.out.println(r+" de�erinin faktoriyeli : " +r_faktoriel);
		
		int x_faktoriel = 1;
		for(int i=1; i<=x; i++) {
			x_faktoriel = x_faktoriel * i;
		}
		
		System.out.println("n - r de�erinin faktoriyeli : " +x_faktoriel);
		
		int combinasyon = (n_faktoriel) / (r_faktoriel * x_faktoriel);
		
		System.out.println(n+" nin " + r + " li combinasyonu : " +combinasyon );

	}

}
