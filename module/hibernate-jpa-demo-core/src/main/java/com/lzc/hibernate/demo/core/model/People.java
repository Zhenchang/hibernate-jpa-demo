package com.lzc.hibernate.demo.core.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Zhenchang
 *
 */
@Entity
@Table(name = "people")
public class People {

	@Id
	@Column(name = "pid")
	private String pid;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "people")
	private Collection<Appointment> appointments;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Collection<Appointment> appointments) {
		this.appointments = appointments;
	}

}
