package mukesh.app.model;

public class User {

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String firstName;
	private String lastName;

	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public boolean found() {
		return false;
	}

}