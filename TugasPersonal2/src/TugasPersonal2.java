import java.io.IOException;
import java.util.Scanner;

public class TugasPersonal2 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cek=true;
		while (cek) {	
		
			int printangka, angkabeda=0, angkaarit = 1, angkageo=1, angkafaktorial=1;
			int minLength = 2;
			int maxLength = 10;
			boolean done=false;
			boolean selesai=false;
			System.out.println("\n-----Selamat Datang DI Program Math-------- ");
			System.out.println("--------------------------------------------- ");
			
			do {
				System.out.print("Masukan banyak angka yang mau dicetak [2-10] : ");
				printangka = input.nextInt();
				if(printangka <= maxLength && printangka >= minLength)
					{
					done=true;
					}
			}while(!done);
			
			do {
				System.out.print("Masukan beda masing - masing angka [2-9] : ");
				angkabeda=input.nextInt();
				if (angkabeda < maxLength && angkabeda >= minLength) 
					{
						selesai=true;
					}
			}while(!selesai);
		

				System.out.println("\n		Layar Tampilan Deret Aritmatika, Geometri dan Faktorial		 ");
				System.out.println("		-------------------------------------------------------		 ");
				System.out.println ("Deret Aritmatika = ");
			for (int i=0; i<printangka; i++) 
            {
            	System.out.print(angkaarit + " ");
            	angkaarit += angkabeda;
            }
		
            	System.out.println ("\nDeret Geometri = ");
        for (int j=0; j<printangka; j++) {
            		System.out.print(angkageo + " ");
            		angkageo *= angkabeda;
            	}
		
		System.out.println ("\nFaktorial dari " + printangka + " = ");
		for (int k=printangka; k>0; k--) {
			angkafaktorial *=k;
			if(k>1)
				System.out.print(k+" x ");
			else
				System.out.print(k);
		}
		System.out.println(" = " + angkafaktorial);
		   
		System.out.print("Ingin coba lagi (Y/N) ? ");
		Scanner x = new java.util.Scanner(System.in);
        String coba = x.nextLine();
        if (coba.equalsIgnoreCase("N"))
            cek = false;
        else if (coba.equalsIgnoreCase("Y"))
            cek = true;
        else
            System.exit(0);
     
		}
	}
}


