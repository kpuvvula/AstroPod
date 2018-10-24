package atom.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atom.User.datatransfer.UserDTO;



public interface UserRepository extends JpaRepository<UserDTO, Integer>{
	
}