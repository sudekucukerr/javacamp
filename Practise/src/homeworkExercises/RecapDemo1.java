package homeworkExercises;

public class RecapDemo1 {

	public static void main(String[] args) {
		
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 30; 
		
		if(sayi1>sayi2 & sayi1>sayi3 ) {
			System.out.println("Sayı1 = 20'ye eşittir ve en büyük sayıdır.");
		}
		else if(sayi2>sayi1 & sayi2>sayi3) {
			System.out.println("Sayı2 = 25'e eşittir ve en büyük sayıdır.");
		}
		else if (sayi3>sayi1 & sayi3>sayi2) {
			System.out.println("Sayı3 = 30'a eşittir ve en büyük sayıdır.");
		}
		else {
			System.out.println("Girilen sayı tanımlanamamaktadır.");
		}

	}

}