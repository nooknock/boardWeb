package polymorphism2;

public class SamsungTV implements TV{
	
	private SonySpeaker speaker;
//	private int price;
//	
//	public SamsungTV() {
//		System.out.println("�Ｚtv ��ü ����1");
//	}
//	
	public SamsungTV(SonySpeaker speakers) {
		System.out.println("�Ｚtv ��ü ����2");
		this.speaker=speakers;		
	}
//	
//	public SamsungTV(Speaker speakers, int price) {
//		System.out.println("�Ｚtv ��ü ����3");
//		this.speaker=speakers;
//		this.price=price;
//	}
	
	public void powerOn() {
		System.out.println("S-TV ��");
	}
	
	public void powerOff() {
		System.out.println("S-TV ��");
	}
	
	public void volumeUp() {
		System.out.println("��");
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		
		System.out.println("�ٿ�");
		speaker.volumeDown();
		
	}
	
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��...");
	}
}
