package mukesh.app.dao;

import java.util.List;

import mukesh.app.exception.UserNotFoundException;
import mukesh.app.model.User;

public class UserDAO implements IuserDAO {



	public Boolean saveUserdb(User u) {
		// TODO Auto-generated method stub
		System.out.println("saved" + u);
		return false;
	}

	public Boolean updateUserdb(User u) {

		System.out.println("update" + u);
		return false;
	}

	public Boolean deleteUserdb(User u) throws UserNotFoundException {
		if (!u.found()) {
			throw new UserNotFoundException("User not found" + u.getFirstName());
		}
		System.out.println("Delete" + u);
		return false;
	}

	public List<User> getAllUsersdb() {
		// TODO Auto-generated method stub
		System.out.println("All users");
		return null;
	}



}
