package SÝLAHÖDEV;

public class Sarjor {
	int mermiSayisi;
	int mevcutMermi;
	public Sarjor(int mermiSayisi,int mevcutMermi) {
		this.mermiSayisi=mermiSayisi;
		this.mevcutMermi=mevcutMermi;
	}
	
	public void atesleme() {
		if(mevcutMermi==0) {
			System.out.println("Merminiz tükendi. Sarjor deðiþtirin.");	
		}
		else {
			mevcutMermi--;
			System.out.println("Atýþ yapýldý. Kalan mermi sayýsý:" +mevcutMermi);
		}
	}
	
	public void sarjorDoldurma(){
		mevcutMermi=mermiSayisi;
		System.out.println("Sarjor dolduruldu. Mevcut mermi sayýnýz:"+mevcutMermi);	
	}

}

