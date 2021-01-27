package com.psl.training.collection4;

import java.sql.Date;

public class Employee implements Comparable<Employee>{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enteredDate == null) ? 0 : enteredDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((joinedDate == null) ? 0 : joinedDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (enteredDate == null) {
			if (other.enteredDate != null)
				return false;
		} else if (!enteredDate.equals(other.enteredDate))
			return false;
		if (id != other.id)
			return false;
		if (joinedDate == null) {
			if (other.joinedDate != null)
				return false;
		} else if (!joinedDate.equals(other.joinedDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	private String name;
	private int id;
	private Date enteredDate,joinedDate;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getEnteredDate() {
		return enteredDate;
	}
	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public Employee(String name, int id, Date enteredDate, Date joinedDate) {
		super();
		this.name = name;
		this.id = id;
		this.enteredDate = enteredDate;
		this.joinedDate = joinedDate;
	}
	@Override
	public int compareTo(Employee o) {
		 return this.getJoinedDate().compareTo(o.getJoinedDate());
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", enteredDate=" + enteredDate + ", joinedDate=" + joinedDate
				+ "]";
	}
}
