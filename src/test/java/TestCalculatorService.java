import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naresh.config.Config;
import com.naresh.service.CalculatorService;

public class TestCalculatorService {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		CalculatorService calc = ctx.getBean("calculatorService", CalculatorService.class);
		calc.add(5, 2);
		calc.sub(5, 2);
		
	}

}
