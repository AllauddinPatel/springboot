package com.codekul.Java28SeptSpring;

import com.codekul.Java28SeptSpring.aop.Boy;
import com.codekul.Java28SeptSpring.aop.Girl;
import com.codekul.Java28SeptSpring.aop.Human;
import com.codekul.Java28SeptSpring.di.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java28SeptSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Java28SeptSpringApplication.class, args);

		Company e = context.getBean(Company.class);
		e.getData();

//		Human human=context.getBean(Human.class);
//		human.wakeup();

		Girl girl=context.getBean(Girl.class);
		girl.study();

		Boy boy=context.getBean(Boy.class);
		boy.study(1);


	}

	@GetMapping("hii")
	public String getmsg(){
		return "Hello spring";
	}


}
