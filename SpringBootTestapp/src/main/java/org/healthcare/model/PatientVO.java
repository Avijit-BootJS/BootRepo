package org.healthcare.model;

import java.util.List;

public class PatientVO {

	private Integer pat_id;
	private String pat_name;
	private String pat_dob;
	private String pat_gender;
	private List<ExaminationVO> examinationVO;
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
	public List<ExaminationVO> getExaminationVO() {
		return examinationVO;
	}
	public void setExaminationVO(List<ExaminationVO> examinationVO) {
		this.examinationVO = examinationVO;
	}
	
}
