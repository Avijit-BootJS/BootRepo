package org.healthcare.model;

import java.util.List;



public class HospitalVO {

	private Integer hosp_id;
	private String hosp_name;
	private String hosp_desc;
	private List<PatientVO> patientVO;
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
	public List<PatientVO> getPatientVO() {
		return patientVO;
	}
	public void setPatientVO(List<PatientVO> patientVO) {
		this.patientVO = patientVO;
	}
	
}
