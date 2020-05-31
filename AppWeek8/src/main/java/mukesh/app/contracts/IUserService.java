package mukesh.app.contracts;

import java.util.List;

import mukesh.app.exception.NametooShortException;
import mukesh.app.model.User;

public interface IUserService {


	public List<User> getAllUsers();

	public User Insertuser(User u) throws NametooShortException;

	public User UpdateUser(User u);

	public User DeleteUser(User u);

}
