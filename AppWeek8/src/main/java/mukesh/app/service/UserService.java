package mukesh.app.service;

import java.util.List;

import mukesh.app.contracts.IUserService;
import mukesh.app.dao.UserDAO;
import mukesh.app.exception.NametooShortException;
import mukesh.app.model.User;

public class UserService implements IUserService {

	UserDAO dao;

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User Insertuser(User u) throws NametooShortException {
		if(u.getFirstName().length() < 4)
		{
			throw new NametooShortException("Short name exception " + u.getFirstName());
		}
		System.out.println(u + "Inserted");
		return null;
	}

	public User UpdateUser(User u) {
		// TODO Auto-generated method stub
		System.out.println(u + "updated");
		return null;
	}

	public User DeleteUser(User u) {
		// TODO Auto-generated method stub
		System.out.println(u + "Deleted");
		return null;
	}


}