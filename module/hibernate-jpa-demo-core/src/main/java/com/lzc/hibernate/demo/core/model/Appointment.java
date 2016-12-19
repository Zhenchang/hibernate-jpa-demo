package com.lzc.hibernate.demo.core.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Zhenchang
 *
 */
@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appt_id")
	private int appointmentId;

	@Column(name = "description")
	private String description;

	@Column(name = "appt_date")
	private Timestamp date;

	@ManyToOne
	@JoinColumn(name = "pid", referencedColumnName = "pid")
	private People people;

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
}
