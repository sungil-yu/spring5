package chap06;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean{
	
	private String host;
	
	
	
	public Client() {
		System.out.println("객체 생성");
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	 System.out.println("초기화후 실행");
	}

	public void send() {
		System.out.println("Clinet.send() to" + host);
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("객체 소멸");
	}

}
