package mukesh.api.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import mukesh.app.dao.UserDAO;
import mukesh.app.exception.NametooShortException;
import mukesh.app.model.User;
import mukesh.app.service.UserService;

public class Servicetest {

	@Mock
	UserDAO userDAO;

	private UserService servicemanager;

	@Before
	public void setup() throws NametooShortException {
		MockitoAnnotations.initMocks(this);
		servicemanager = new UserService();
		servicemanager.setDao(userDAO);

	}

	@Test
	public void serviceManger_update_user__should_update_user_toDB() throws NametooShortException {

		User user = new User();
		when(userDAO.updateUserdb(user)).thenReturn(true);
		boolean result = servicemanager.UpdateUser(user);
		assertTrue(result);
		verify(userDAO).updateUserdb(user);

	}

	@Test
	public void serviceManger_update_user__should_not_update_user_toDB() throws NametooShortException {

		User user = new User();
		when(userDAO.updateUserdb(user)).thenReturn(false);
		boolean result = servicemanager.UpdateUser(user);
		assertFalse(result);
		verify(userDAO).updateUserdb(user);

	}

	@Test
	public void serviceManger_add_user__should_add_user_toDB() throws NametooShortException {

		User user = new User();
		user.setFirstName("uuiwqoiw");
		when(userDAO.saveUserdb(user)).thenReturn(true);
		boolean result = servicemanager.Insertuser(user);
		assertTrue(result);
		verify(userDAO).saveUserdb(user);

	}

	@Test(expected = NametooShortException.class)
	public void placeOrder_Should_Throw_BOException() throws NametooShortException {
		User user = new User();
		user.setFirstName("ss");
		when(userDAO.saveUserdb(user)).thenReturn(true);
		boolean result = servicemanager.Insertuser(user);
		assertTrue(result);
		verify(userDAO).saveUserdb(user);

	}
}
