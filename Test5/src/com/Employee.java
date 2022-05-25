package com;

public class Employee {
	
	private String name;
	private Integer id;
	private Integer sal;
	
	public Employee (String name, Integer id, Integer sal) {
		this.name = name;
		this.sal = sal;
		this.id  = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	
	

}
