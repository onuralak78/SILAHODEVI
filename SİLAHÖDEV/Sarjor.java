package S�LAH�DEV;

public class Sarjor {
	int mermiSayisi;
	int mevcutMermi;
	public Sarjor(int mermiSayisi,int mevcutMermi) {
		this.mermiSayisi=mermiSayisi;
		this.mevcutMermi=mevcutMermi;
	}
	
	public void atesleme() {
		if(mevcutMermi==0) {
			System.out.println("Merminiz t�kendi. Sarjor de�i�tirin.");	
		}
		else {
			mevcutMermi--;
			System.out.println("At�� yap�ld�. Kalan mermi say�s�:" +mevcutMermi);
		}
	}
	
	public void sarjorDoldurma(){
		mevcutMermi=mermiSayisi;
		System.out.println("Sarjor dolduruldu. Mevcut mermi say�n�z:"+mevcutMermi);	
	}

}

