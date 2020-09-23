package beans;

public class Student {
	private String name;
	private String id;
	private String phoneNumber;

	private Student() {

	}

	private Student(Builder builder) {
		this.name = builder.name;
		this.id = builder.id;
		this.phoneNumber = builder.phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "name: " + this.name + "; id: " + this.id + "; phoneNUmber: " + this.phoneNumber;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String name;
		private String id;
		private String phoneNumber;

		private Builder() {

		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

}
