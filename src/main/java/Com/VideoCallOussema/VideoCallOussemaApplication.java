package Com.VideoCallOussema;

import Com.VideoCallOussema.user.User;
import Com.VideoCallOussema.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoCallOussemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCallOussemaApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("Oussema")
					.email("oussema@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Amine")
					.email("Amine@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Yassin")
					.email("Yassin@mail.com")
					.password("aaa")
					.build());
		};
	}
}
