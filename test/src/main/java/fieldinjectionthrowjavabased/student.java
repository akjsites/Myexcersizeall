package fieldinjectionthrowjavabased;

public class student {

	String id="0001";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "student [id=" + id + "]";
	}
	
	
}
