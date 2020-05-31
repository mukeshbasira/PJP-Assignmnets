package mukesh.app.dao;

import java.util.List;

import mukesh.app.exception.UserNotFoundException;
import mukesh.app.model.User;

public interface IuserDAO {

	void saveUserdb(User u);

	void updateUserdb(User u);

	void deleteUserdb(User u) throws UserNotFoundException;

	public List<User> getAllUsersdb();

}
