package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context= 
                       new ClassPathXmlApplicationContext("Beans.xml");
     
    PaymentService service=
        context.getBean(PaymentService.class);
    
    service.doPayment(199.0);
	}

}
 