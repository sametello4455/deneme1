import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class nothesaplama {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
			System.out.println("lütfen adınızı giriniz");
	        String ad = scanner.nextLine();
	        
	        System.out.println("lütfen soy adınızı giriniz");
	        String soyadString =scanner.nextLine();
	        
	        System.out.println("lütfen dersinizi giriniz");
	        String ders = scanner.nextLine();
	        
	        System.out.println("lütfen vize notunuzu giriniz");
	        double vize = scanner.nextDouble();
	         
	        System.out.println("lütfen final notunuzu giriniz");
	        double finalnot = scanner.nextDouble();
	        
	        double sonuc =(vize*0.4)+(finalnot*0.6);
	         if (sonuc>= 50) {
	        	 System.out.println("adınız:"+ad+"soyadınız:"+soyadString+"dersiniz:"+ders+"tebrikler dersten geçtiniz:"+sonuc);
	        	 
	         }
	         else {
				System.out.println(ders+"adlı dersten ne yazıkki kaldınız üzülmeyin seneye tekrar verirsiniz");
	        	 
	        	 
	        	 
			}
				
			}
}
