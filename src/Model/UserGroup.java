package Model;

public class UserGroup {

	int id;
	String name;

	public UserGroup(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public UserGroup() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Model.UserGroup{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
