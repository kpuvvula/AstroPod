package astropoc.about;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import atom.Repository.UserRepository;
import atom.User.datatransfer.UserDTO;



@RestController
public class AboutPageAction {
	
	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping("/aboutDetails")
	public List<UserDTO> getAboutDetails(){
		List<UserDTO> list=userRepository.findAll();
		return list;
	}
}