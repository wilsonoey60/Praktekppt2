import java.util.Scanner;
import java.io.*;
class Praktekppt2105 {
  public static void main(String[ ] args) {
  	Scanner Nama = new Scanner(System.in);
    System.out.print("Nama :");
    System.out.println(Nama.nextLine());
    System.out.print("Nilai Tugas 1 =");
    double nilaitugas1 = Nama.nextInt();
    System.out.print("Nilai Tugas 2 =");
    double nilaitugas2 = Nama.nextInt();
    System.out.print("Nilai Tugas 3 =");
    double nilaitugas3 = Nama.nextInt();
    System.out.print("Nilai Mid =");
    double nilaimid = Nama.nextInt();
    System.out.print("Nilai Final =");
    double nilaifinal = Nama.nextInt();
    double Nilairataratatugas = ((nilaitugas1 + nilaitugas2 + nilaitugas3)/3);
    double Nilaiakhir = (Nilairataratatugas*0.3 + nilaimid*0.3 + nilaifinal*0.4);
    System.out.println("Nilai Akhir =" +Nilaiakhir);
    if(Nilaiakhir > 80) {
   		System.out.println("Nilai Huruf : A");
	} 
	else if(Nilaiakhir > 60) {
   		System.out.println("Nilai Huruf : B");
	} 
	else if(Nilaiakhir > 50) {
   		System.out.println("Nilai Huruf : C");
	} 
	else if(Nilaiakhir > 40) {
   		System.out.println("Nilai Huruf : D");
	}
	else {
   		System.out.println("Nilai Huruf : E");
	}
  }
}