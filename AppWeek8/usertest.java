

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import mukesh.app.controller.UserManager;
import mukesh.app.dao.UserDAO;
import mukesh.app.exception.NametooShortException;
import mukesh.app.model.User;
import mukesh.app.service.UserService;

public class usertest {

	@Mock
	UserService serviceManger;
	UserDAO userDAO;

	private UserManager manager;
	private UserService service;

	@Before
	public void setup() throws NametooShortException {
		MockitoAnnotations.initMocks(this);
		manager = new UserManager();
		manager.setserviceManger(serviceManger);

	}

	@Test
	public void Add_user_to_manager_should_add_user() throws NametooShortException {


		User user = new User();
		when(serviceManger.Insertuser(user)).thenReturn(true);
		boolean result = manager.UserAdd(user);

		assertTrue(result);
		verify(serviceManger, atLeast(1)).Insertuser(user);


	}




}
