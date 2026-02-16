package fieldinjectionthrowjavabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class bean {

	@Bean
	public appconfig getconfig()
	{
		return new appconfig();
	}
	
	@Bean
	public student getStudent()
	{
		return new student();
	}
	
}
