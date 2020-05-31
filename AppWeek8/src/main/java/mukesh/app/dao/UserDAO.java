package mukesh.app.dao;

import java.util.List;

import mukesh.app.exception.UserNotFoundException;
import mukesh.app.model.User;

public class UserDAO implements IuserDAO {



	public void saveUserdb(User u) {
		// TODO Auto-generated method stub
		System.out.println("saved" + u);
	}

	public void updateUserdb(User u) {

		System.out.println("update" + u);
	}

	public void deleteUserdb(User u) throws Exception {
		if (!u.found()) {
			throw new UserNotFoundException("User not found" + u.getFirstName());
		}
		System.out.println("Delete" + u);
	}

	public List<User> getAllUsersdb() {
		// TODO Auto-generated method stub
		System.out.println("All users");
		return null;
	}



}
