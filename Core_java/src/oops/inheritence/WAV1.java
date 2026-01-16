package oops.inheritence;

public class WAV1 {
	public void chat() {
		System.out.println("Chatting!!!");
	}

	public static void main(String[] args) {
		WAV1 w1 = new WAV1();
		WAV2 w2 = new WAV2();
		WAV3 w3 = new WAV3();
		WAV1 w5 = new WAV3(); // UpCasting
		
//		WAV3 w4 = (WAV3) new WAV1();  //ClassCastException
		WAV1 temp = new WAV3();// UpCasting
		WAV3 w4 = (WAV3) temp; // DownCasting
		w5.chat();
		w4.metaAI();
		w1.chat();
		w2.chat();
		w2.status();
		w3.chat();
		w3.status();
		w3.metaAI();
	}
}

class WAV2 extends WAV1 {
	public void status() {
		System.out.println("Statussss!!!");
	}
}

class WAV3 extends WAV2 {
	public void metaAI() {
		System.out.println("META AI!!!!!!!");
	}
}