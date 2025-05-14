import java.util.Scanner;

public class uçakbiletifiyatıhesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int km,yaş, tip,marka;
		double normalfiyat,yaşindirimi,tipindirimi;
		System.out.print("mesafeyi giriniz:");
		km=scan.nextInt();
		System.out.print("\nyaşınızı giriniz:");
		yaş=scan.nextInt();
		System.out.print("\nyolculuk tipiniz seçiniz:(1-tek gidiş,2-gidiş/dönüş):");
		tip=scan.nextInt();
		System.out.println("uçak !marka numarası! seçiniz:(pegasus:20   ,,,   türkhavayolları:10  ,,,sunexpress:30  )");
		marka=scan.nextInt();
	 
		if(km>0&&yaş>0&&(tip==1||tip==2)&&(marka==10||marka==20||marka==30)) {
		if(marka==10) {	
		normalfiyat=km*0.10;
		if(yaş<12) {
			 yaşindirimi = normalfiyat*0.5;
		}else if(yaş>=12 && yaş<=24) {
			yaşindirimi=normalfiyat*0.10;
		}else if(yaş>=65) {
			yaşindirimi=normalfiyat*0.30;
		}else {
			yaşindirimi=0;
		}
normalfiyat-=yaşindirimi;
if(tip==2) {
	tipindirimi=normalfiyat*0.20;

	normalfiyat=(normalfiyat-tipindirimi)*2;
}
System.out.println("bilet tutarı:"+normalfiyat+"TL");	
		}

if(marka==20) {
	normalfiyat=km*0.40;
	if(yaş<12) {
		 yaşindirimi = normalfiyat*0.3;
	}else if(yaş>=12 && yaş<=24) {
		yaşindirimi=normalfiyat*0.05;
	}else if(yaş>=65) {
		yaşindirimi=normalfiyat*0.20;
	}else {
		yaşindirimi=0;
	}
normalfiyat-=yaşindirimi;
if(tip==2) {
tipindirimi=normalfiyat*0.10;

normalfiyat=(normalfiyat-tipindirimi)*2;
}
System.out.println("bilet tutarı:"+normalfiyat+"TL");	
}		
		
if(marka==30) {
	normalfiyat=km*0.30;
	if(yaş<12) {
		 yaşindirimi = normalfiyat*0.4;
	}else if(yaş>=12 && yaş<=24) {
		yaşindirimi=normalfiyat*0.8;
	}else if(yaş>=65) {
		yaşindirimi=normalfiyat*0.25;
	}else {
		yaşindirimi=0;
	}
normalfiyat-=yaşindirimi;
if(tip==2) {
tipindirimi=normalfiyat*0.15;

normalfiyat=(normalfiyat-tipindirimi)*2;
}
System.out.println("bilet tutarı:"+normalfiyat+"TL");	
}
		}			
				
		else {
			System.out.println("girdiğiniz bilgiler eksik veya hatalı lütfen tekrar giriniz");
		}
		
	
		
		
	}

}
