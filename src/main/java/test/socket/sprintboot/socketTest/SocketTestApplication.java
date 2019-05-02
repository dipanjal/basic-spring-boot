package test.socket.sprintboot.socketTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
public class SocketTestApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SocketTestApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SocketTestApplication.class, args);
		openHomePage();
	}

	private static void openHomePage() {
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec( "google-chrome http://localhost:8080");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}

}
