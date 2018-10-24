package astropoc.home;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import astropoc.commons.action.BasicAction;

@Controller
public class WelcomeAction extends BasicAction{
	
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping(value= "/")
	public String welcome(Map<String, Object> model) {
		return "forward:/index.html";
	}
	
	
	
	
}