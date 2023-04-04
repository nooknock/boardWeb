package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("伙己tv 按眉 积己1");
	}
	
	public SamsungTV(Speaker speakers) {
		System.out.println("伙己tv 按眉 积己2");
		this.speaker=speakers;		
	}
	
	public SamsungTV(Speaker speakers, int price) {
		System.out.println("伙己tv 按眉 积己3");
		this.speaker=speakers;
		this.price=price;
	}
	
	public void powerOn() {
		System.out.println("S-TV 脑"+price);
	}
	
	public void powerOff() {
		System.out.println("S-TV 阐");
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
		System.out.println("按眉 昏力 傈俊 贸府且 肺流 贸府...");
	}
}
