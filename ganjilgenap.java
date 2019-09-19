import java.util.Scanner;
public class ganjilgenap
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.println("masukkan nilai = ");
		nilai = input.nextInt();
		
	//posisi if berjalan
	if(nilai % 2 == 0){
		System.out.println("angka yang dimasukkan adalah Genap");
		}
		else
		 System.out.println("angka yang dimasukkan adalah Ganjil");
		}
	}
	
	
