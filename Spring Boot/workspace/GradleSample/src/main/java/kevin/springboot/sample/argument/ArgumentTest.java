package kevin.springboot.sample.argument;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

//@Component
public class ArgumentTest {
	
	// Bean�� �����ڰ� �ϳ��� �ְ� �������� input�� bean�̸� spring�� �ڵ����� �ش� bean�� �������ش�.
	public ArgumentTest(ApplicationArguments args) {
		System.out.println(">> programArgs: " + args.containsOption("programArgs"));
		System.out.println(">> vmArgs: " + args.containsOption("vmArgs"));
		
		System.out.println(">> " + System.getProperty("data_source"));
	}
}
