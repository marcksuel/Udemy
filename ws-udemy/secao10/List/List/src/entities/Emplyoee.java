package entities;

public class Emplyoee {

		private Integer id;
		private String name;
		private Double salary;
		
		public Emplyoee(Integer id, String name, Double salary) {
			setId(id);
			setName(name);
			setSalary(salary);
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}
		
		public void increase(Double porcentage) {
			setSalary(getSalary()*(1+porcentage));
		}
		
		@Override
		public String toString() {
			return "\nId: " + getId() 
					+ "\nName: " + getName() 
					+ "\nSalary: " + getSalary()
					+ "\n";
		}
		
		
		
		
}
