package mukesh.app.dao;

import java.util.List;

import mukesh.app.exception.UserNotFoundException;
import mukesh.app.model.User;

public interface IuserDAO {

	public Boolean saveUserdb(User u);

	public Boolean updateUserdb(User u);

	public Boolean deleteUserdb(User u) throws UserNotFoundException;

	public List<User> getAllUsersdb();

}
