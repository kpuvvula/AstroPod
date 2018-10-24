package astropoc.commons.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class BasicAction {
	
	@Autowired
	private Environment env;
	
	public String getText(String globalText) {
		return env.getProperty(globalText);
	}
}