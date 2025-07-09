package javalab.miniproject;

public class Customer {
	private static int customerCount = 0;
	private int customerNumber;
	private String id;
	private String password;
	
	private Customer(Builder builder) {
		this.customerNumber = ++customerCount;
		this.id = builder.id;
		this.password = builder.password;
	}
	
	public static class Builder {
		private String id;
		private String password;
		
		public Builder() {
            
        }
		
		public Builder id(String id) {
			this.id = id;
            return this;
        }
		
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Customer build() {
            return new Customer(this);
        }
	}
		
}
