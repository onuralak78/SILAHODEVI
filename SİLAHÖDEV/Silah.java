package SÝLAHÖDEV;

public class Silah {
	int enuzakMenzil;
	Sarjor sarjor;
	public Silah(int enuzakMenzil) {
		this.enuzakMenzil=enuzakMenzil;
	}

	public void Ateset(int menzil) {
		if (menzil>enuzakMenzil) {
			System.out.println("Hedefi ýskaladýnýz. en uzak menzilden dýþarý atýþ yaptýnýz.");
			sarjor.atesleme();
		}
		else if(sarjor==null) {
			System.out.println("Silahta sarjor yok. Þarjor doldurunuz.");
			sarjor.sarjorDoldurma();
		}
		else {
			if(sarjor.mevcutMermi<0) {
				System.out.println("Merminiz yok. Sarjorunuz dolduruluyor.");
				sarjor.sarjorDoldurma();
			}
			else {
				System.out.println("Hedef vuruldu.");
				sarjor.atesleme();
			}
		}
	}
}

