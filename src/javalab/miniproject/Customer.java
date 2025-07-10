package javalab.miniproject;

public class Customer {
	private static int customerCount = 0;
	private int customerNumber;
	private String customerId;
	private String customerPassword;
	private String customerName;
	private String customerPhoneNumber;
	private String customerEmail;
	private boolean customerEmailVerified;
	private String customerAddress;
	
	private Customer(Builder builder) {
		this.customerNumber = ++customerCount;
		this.customerId = builder.customerId;
		this.customerPassword = builder.customerPassword;
	}
	
	public static class Builder {
		private String customerId;
		private String customerPassword;
		
		public Builder() {
            
        }
		
		public Builder id(String customerId) {
			this.customerId = customerId;
            return this;
        }
		
		public Builder password(String customerPassword) {
			this.customerPassword = customerPassword;
			return this;
		}
		
		public Customer build() {
            return new Customer(this);
        }
	}
		
}
