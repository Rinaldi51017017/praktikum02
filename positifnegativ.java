import java.util.Scanner;
class positifnegativ
{
public static void main(String[] args)
{
//kamus data
int bilangan;
Scanner sc=new Scanner(System.in);

//body program
 System.out.println("Masukkan bilangan positif dan negatif");
bilangan=sc.nextInt();
if (bilangan<0){
System.out.println("bilangan" +bilangan+ "adalah bilangan negatif");
}
if (bilangan>0){
System.out.println("bilangan" +bilangan+ "adalah bilangan positif");
}
if (bilangan==0){
System.out.println("bilangan" +bilangan+ "adalah bukan positif atau negatif");
}
}
}
