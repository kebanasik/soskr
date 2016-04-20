package pl.keban.soskr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="pl.keban.soskr")
@Import({DateBaseConfiguration.class})
public class WebAppConfiguration {
	
}
