import java.util.Scanner;
public class pesawat {
	public static void main (String[] args){
		
		Scanner input = new Scanner (System.in);
		
		int pesawat;
		
		System.out.println ("Masukkan pesawat:");
		pesawat=input.nextInt();
		
		if(pesawat==1){
			System.out.println("Pesawat Garuda");}
		else if(pesawat == 2){
			System.out.println("Pesawat Batik");}	
		else if (pesawat==3){
			System.out.println("Pesawat Lion");}
			
		else
			System.out.println("Kode yang Dimasukkan Salah");
			
			
	}
}