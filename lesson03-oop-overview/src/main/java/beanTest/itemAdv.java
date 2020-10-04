package beanTest;

public class itemAdv {
	private String id;
	private String name;
	
	private itemAdv() {
	}

	private itemAdv(Builder builder) {
		this.name = builder.name;
		this.id = builder.id;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private String id;
		private String name;
		
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public itemAdv build() {
			return new itemAdv(this);
		}
		
	}
	
}
