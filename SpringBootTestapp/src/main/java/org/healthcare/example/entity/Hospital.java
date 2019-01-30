package org.healthcare.example.entity;

import java.util.Collection;

import javax.persistence.*;



@Entity
@Table(name="hchospital")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer hosp_id;
	
	@Column(name="hosp_name")
	private String hosp_name;

	@Column(name="hosp_desc")
	private String hosp_desc;
	
	@OneToMany(mappedBy="hospital",cascade=CascadeType.ALL)
	private Collection<Patient> patient;

	public Hospital() {
	}

	public Hospital(Integer hosp_id, String hosp_name, String hosp_desc, Collection<Patient> patient) {
		super();
		this.hosp_id = hosp_id;
		this.hosp_name = hosp_name;
		this.hosp_desc = hosp_desc;
		this.patient = patient;
	}

	public Integer getHosp_id() {
		return hosp_id;
	}

	public void setHosp_id(Integer hosp_id) {
		this.hosp_id = hosp_id;
	}

	public String getHosp_name() {
		return hosp_name;
	}

	public void setHosp_name(String hosp_name) {
		this.hosp_name = hosp_name;
	}

	public String getHosp_desc() {
		return hosp_desc;
	}

	public void setHosp_desc(String hosp_desc) {
		this.hosp_desc = hosp_desc;
	}

	public Collection<Patient> getPatient() {
		return patient;
	}

	public void setPatient(Collection<Patient> patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Hospital [hosp_id=" + hosp_id + ", hosp_name=" + hosp_name + ", hosp_desc=" + hosp_desc + ", patient="
				+ patient + "]";
	}

	
}