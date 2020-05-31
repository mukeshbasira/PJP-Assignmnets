package mukesh.app.controller;

import mukesh.app.exception.NametooShortException;
import mukesh.app.model.User;
import mukesh.app.service.UserService;

public class UserManager {
	UserService manager = new UserService();
	User user = new User();

	public UserManager(String nameString, String lastname, int id) throws NametooShortException {
		user.setFirstName(nameString);
		user.setLastName(lastname);
		user.setId(id);

		UserAdd(user);
	}

	public UserManager(String nameString, String lastname) throws NametooShortException {
		user.setFirstName(nameString);
		user.setLastName(lastname);

		manager.Insertuser(user);
	}

	public UserManager() {

	}

	public boolean UserAdd(User user) throws NametooShortException {

		manager.Insertuser(user);
		return true;

	}




}
