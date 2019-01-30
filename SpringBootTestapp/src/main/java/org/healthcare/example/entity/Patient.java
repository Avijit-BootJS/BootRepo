package org.healthcare.example.entity;

import javax.persistence.*;


@Entity
@Table(name="hcpatient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pat_id;

	@Column(name="pat_name")
	private String pat_name;

	@Column(name="pat_dob")
	private String pat_dob;

	@Column(name="pat_gender")
	private String pat_gender;
	
	@ManyToOne
	@JoinColumn(name="hosp_id",referencedColumnName="hosp_id")
	private Hospital hospital ;
	
	public Patient() {
	}

	public Patient(Integer pat_id, String pat_name, String pat_dob, String pat_gender, Hospital hospital) {
		super();
		this.pat_id = pat_id;
		this.pat_name = pat_name;
		this.pat_dob = pat_dob;
		this.pat_gender = pat_gender;
		this.hospital = hospital;
	}

	public Integer getPat_id() {
		return pat_id;
	}

	public void setPat_id(Integer pat_id) {
		this.pat_id = pat_id;
	}

	public String getPat_name() {
		return pat_name;
	}

	public void setPat_name(String pat_name) {
		this.pat_name = pat_name;
	}

	public String getPat_dob() {
		return pat_dob;
	}

	public void setPat_dob(String pat_dob) {
		this.pat_dob = pat_dob;
	}

	public String getPat_gender() {
		return pat_gender;
	}

	public void setPat_gender(String pat_gender) {
		this.pat_gender = pat_gender;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Patient [pat_id=" + pat_id + ", pat_name=" + pat_name + ", pat_dob=" + pat_dob + ", pat_gender="
				+ pat_gender + ", hospital=" + hospital + "]";
	}

		}
