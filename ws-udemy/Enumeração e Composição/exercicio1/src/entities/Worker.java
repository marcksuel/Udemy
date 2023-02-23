package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departament department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartment() {
		return department;
	}

	public void setDepartment(Departament department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	
	public void addContract (HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		contracts.remove(contract);
	}
	public double income(int year ,int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract x: contracts) {
			cal.setTime(x.getDate());
			int x_year= cal.get(Calendar.YEAR);
			int x_month = 1 + cal.get(Calendar.MONTH);
			if(year == x_year && month == x_month) {
				sum += x.totalValue();
			}
		}
		return sum;
	}
}
