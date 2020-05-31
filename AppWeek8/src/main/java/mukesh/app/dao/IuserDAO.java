package mukesh.app.dao;

import java.util.List;

import mukesh.app.model.User;

public interface IuserDAO {

	int saveUser(User u);

	void updateUser(User u);

	void deleteUser(User u);

	public List<User> getAllUsers();

}
