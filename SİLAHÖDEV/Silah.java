package S�LAH�DEV;

public class Silah {
	int enuzakMenzil;
	Sarjor sarjor;
	public Silah(int enuzakMenzil) {
		this.enuzakMenzil=enuzakMenzil;
	}

	public void Ateset(int menzil) {
		if (menzil>enuzakMenzil) {
			System.out.println("Hedefi �skalad�n�z. en uzak menzilden d��ar� at�� yapt�n�z.");
			sarjor.atesleme();
		}
		else if(sarjor==null) {
			System.out.println("Silahta sarjor yok. �arjor doldurunuz.");
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

