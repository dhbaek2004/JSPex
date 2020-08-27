package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();
		
		//aplicaationContext.xml에 beans를 미리 선언해 놨으므로 new 키워드를 사용할 필요가 없다.
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		ctx.close();
	}
}
