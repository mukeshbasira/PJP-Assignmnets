package mukesh.app.service;

import java.util.List;

import mukesh.app.contracts.IUserService;
import mukesh.app.dao.UserDAO;
import mukesh.app.exception.NametooShortException;
import mukesh.app.exception.UserNotFoundException;
import mukesh.app.model.User;

public class UserService implements IUserService {

	UserDAO dao;

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean Insertuser(User u) throws NametooShortException {
		if (u.getFirstName().length() < 4)
		{
			throw new NametooShortException("Short name exception " + u.getFirstName());
		}

		Boolean result = dao.saveUserdb(u);
		System.out.println(u + "Inserted");
		return result;
	}

	public Boolean UpdateUser(User u) {
		// TODO Auto-generated method stub
		System.out.println(u + "updated");
		Boolean result = dao.updateUserdb(u);

		return result;
	}

	public Boolean DeleteUser(User u) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Boolean result = dao.deleteUserdb(u);


		System.out.println(u + "Deleted");

		return result;
	}


}