package mukesh.api.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

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

	private static final int ORDER_ID = 123;
	@Mock
	UserService userservice;
	UserDAO userDAO;

	private UserManager manager;
	private UserService service;
	private User user;

	@Before
	public void setup() throws NametooShortException {
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void Add_user_to_manager_should_add_user() {

		when(service.Insertuser(user)).thenReturn(true);
		boolean result = ser
				assertTrue(result);



	}




}
