package polymorphism;

public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("���� ����Ŀ �������");
	}
	
	public void volumeUp() {
		System.out.println("���� ����Ŀ �Ҹ� �ø�");
	}
	
	public void volumeDown() {
		System.out.println("���� ����Ŀ �Ҹ� ����");
	}
}
