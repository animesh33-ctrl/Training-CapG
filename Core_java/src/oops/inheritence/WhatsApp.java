package oops.inheritence;

public class WhatsApp extends App {
	public WhatsApp() {}
	public WhatsApp(String appName, double version, int sizeMB,long phoneNumber, int chats) {
		this.appName = appName;
		this.version = version;
		this.sizeMB = sizeMB;
		this.phoneNumber = phoneNumber;
		this.chats = chats;
	}

	long phoneNumber;
	int chats;

	void sendMessage(String msg) {
		System.out.println("Sending message: " + msg);
	}

	void showChats() {
		System.out.println("Total chats: " + chats);
	}

	public static void main(String[] args) {
		WhatsApp w = new WhatsApp();

		w.appName = "WhatsApp";
		w.version = 2.24;
		w.sizeMB = 85;

		w.phoneNumber = 9876543210L;
		w.chats = 120;

		w.install();
		w.update(2.25);
		w.showInfo();

		w.sendMessage("Hello!");
		w.showChats();
	}
}