package miniExercises;

import java.util.Scanner;

public class DortIslemHesaplama {

	public static void main(String[] args) {
		int sayi1,sayi2,islemler;
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("1 - Toplama");
		System.out.println("2 - Cikarma");
		System.out.println("3 - Carpma");
		System.out.println("4 - Bolme");
		
		System.out.println("1. Sayiyi Giriniz: ");
		sayi1 = scanf.nextInt();
		
		System.out.println("2. Sayiyi Giriniz: ");
		sayi2 = scanf.nextInt();
		
		System.out.println("islemi Giriniz: ");
		islemler = scanf.nextInt();
		
		if(islemler == 1) {
			System.out.println("Toplama islemi sonucu = " + (sayi1+sayi2));
		}
		else if(islemler == 2) {
			System.out.println("Cıkarma islemi sonucu = " + (sayi1-sayi2));
		}	
		else if(islemler == 3) {
			System.out.println("Carpma islemi sonucu = " + (sayi1*sayi2));
		}
		else if(islemler == 4) {
			System.out.println("Bolme islemi sonucu = " + (sayi1/sayi2));
		}
		else {
			System.out.println("İslem tanimli degildir.");
		}
		
		
	}

}
