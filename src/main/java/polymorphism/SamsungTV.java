package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("�Ｚtv ��ü ����1");
	}
	
	public SamsungTV(Speaker speakers) {
		System.out.println("�Ｚtv ��ü ����2");
		this.speaker=speakers;		
	}
	
	public SamsungTV(Speaker speakers, int price) {
		System.out.println("�Ｚtv ��ü ����3");
		this.speaker=speakers;
		this.price=price;
	}
	
	public void powerOn() {
		System.out.println("S-TV ��"+price);
	}
	
	public void powerOff() {
		System.out.println("S-TV ��");
	}
	
	public void volumeUp() {
//		speaker=new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		
//		speaker=new SonySpeaker();
		speaker.volumeDown();
		
		
	}
	
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��...");
	}
}
