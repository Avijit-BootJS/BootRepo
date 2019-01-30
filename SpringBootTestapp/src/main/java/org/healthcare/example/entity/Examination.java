package org.healthcare.example.entity;

import javax.persistence.*;


@Entity
@Table(name="hcexamination")

public class Examination {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer exam_id;

	@Column(name="exam_name")
	private String exam_name;
	
	@Column(name="description")
	private String description;
		
	@Column(name="exam_date")
	private String exam_date;
	
	@Column(name="weight")
	private String weight;
	
	@Column(name="height")
	
	private String height;
	
	public Examination() {
	}

	public Examination(Integer exam_id, String exam_name, String description, String exam_date, String weight,
			String height) {
		super();
		this.exam_id = exam_id;
		this.exam_name = exam_name;
		this.description = description;
		this.exam_date = exam_date;
		this.weight = weight;
		this.height = height;
	}

	public Integer getExam_id() {
		return exam_id;
	}

	public void setExam_id(Integer exam_id) {
		this.exam_id = exam_id;
	}

	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExam_date() {
		return exam_date;
	}

	public void setExam_date(String exam_date) {
		this.exam_date = exam_date;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Examination [exam_id=" + exam_id + ", exam_name=" + exam_name + ", description=" + description
				+ ", exam_date=" + exam_date + ", weight=" + weight + ", height=" + height + "]";
	}

	
		}
