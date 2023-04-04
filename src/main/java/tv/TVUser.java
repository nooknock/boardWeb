package tv;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
//		TV tv=new LgTV();
//		TV tv=new SamsungTV(); ������ �������̽� TV tv�� �ٲٴ� �ڵ尡 �ز� �پ�����
		
//		BeanFactory factory=new BeanFactory();
		
		//������������ BeanFactory�� �̸� ����� ApplicationContext �� ���� ������ �����̳� ����
		//ApplicationContext�� ��� �ε� �ܿ� �پ��� ����� �����ϹǷ� �̰� ���
		
		//Abstract implementation of the org.springframework.context.ApplicationContextinterface. 
		//Create a new GenericXmlApplicationContext, loading bean definitionsfrom the given resource locations and automatically refreshing the context.
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");//�ڹٸ��ҽ������� xml ������ �о��
		//�ڹٹ���� new ��� ���������� �� ����� ����.
		//GenericXmlApplicationContext ��ü�� �����Ǿ� ������ �����̳ʰ� ������
		
		//������ �����̳ʷκ��� �Ｚtv ��ü�� ��
		TV tv=(TV) factory.getBean("tv");
		TV tv1=(TV) factory.getBean("tv");
		TV tv2=(TV) factory.getBean("tv");
		TV tv3=(TV) factory.getBean("tv");
		
		
//		tv.powerOn();	
//		tv.volumeUp();
//		tv.volumeDown();	
//		tv.powerOff();
		
		//������ �����̳� ����  Close this application context, destroying all beans in its bean factory.
		factory.close();
//		tv.volumeUp();
	}
	
}