package mukesh.app.exception;

import mukesh.app.model.User;

public class UserNotFoundException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(User user) {
		if (user.getFirstName().length() < 4) {

			this.getMessage();
		}

	}
}
