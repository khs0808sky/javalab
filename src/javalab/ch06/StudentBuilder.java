package javalab.ch06;

// Builder D.P. (setter로 구성되어 있다)
// 생성자가 아닌 builder를 이용하여 객체를 생성하는 방법
public class StudentBuilder {
	private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;
    
    private StudentBuilder(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.grade = builder.grade;
        this.major = builder.major;
        this.phoneNumber = builder.phoneNumber;
    }
    
    public static class Builder {
        private int id;
        private String name;
        private int grade;
        private String major;
        private String phoneNumber;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public Builder major(String major) {
            this.major = major;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder build() {
            return new StudentBuilder(this);
        }
    }
    
    @Override
	public String toString() {
		return "StudentBuilder [id=" + id + ", name=" + name + ", grade=" + grade + ", major=" + major
				+ ", phoneNumber=" + phoneNumber + "]";
	}

    public static void main(String[] args) {
    	StudentBuilder student = new StudentBuilder.Builder(1, "John Doe")
                .grade(12)
                .major("Computer Science")
                .phoneNumber("123-456-7890")
                .build();
    	System.out.println(student.toString());

    }

}
