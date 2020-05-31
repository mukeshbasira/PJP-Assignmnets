package mukesh.app.contracts;

import java.util.List;

import mukesh.app.exception.NametooShortException;
import mukesh.app.model.User;

public interface IUserService {


	public List<User> getAllUsers();

	public Boolean Insertuser(User u) throws NametooShortException;

	public Boolean UpdateUser(User u);

	public Boolean DeleteUser(User u);

}
