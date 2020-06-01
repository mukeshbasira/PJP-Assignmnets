package mukesh.app.controller;

import mukesh.app.exception.NametooShortException;
import mukesh.app.model.User;
import mukesh.app.service.UserService;

public class UserManager {
	UserService serviceManger;
	User user;

	public UserService getserviceManger() {
		return serviceManger;
	}

	public void setserviceManger(UserService serviceManger) {
		this.serviceManger = serviceManger;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserManager(String nameString, String lastname, int id) throws NametooShortException {
		user.setFirstName(nameString);
		user.setLastName(lastname);
		user.setId(id);

		UserAdd(user);
	}

	public UserManager(String nameString, String lastname) throws NametooShortException {
		user.setFirstName(nameString);
		user.setLastName(lastname);

		serviceManger.Insertuser(user);
	}

	public UserManager() {

	}

	public boolean UserAdd(User user) throws NametooShortException {

		Boolean resultBoolean = serviceManger.Insertuser(user);
		return resultBoolean;

	}




}
