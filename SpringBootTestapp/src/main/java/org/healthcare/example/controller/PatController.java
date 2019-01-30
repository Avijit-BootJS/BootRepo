//package org.healthcare.example.controller;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.util.List;
//
//import javax.persistence.EntityExistsException;
//import javax.persistence.EntityNotFoundException;
//
//import org.healthcare.example.model.Patient;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
//@RestController
//@RequestMapping("/api")
//public class PatController {
//
//	private PatientService patientService;
//
//	public PatientResource(PatientService patientService) {
//		this.patientService = patientService;
//	}
//
//	@RequestMapping(value = "patient", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Patient> getAllEmployees() {
//		return patientService.findAll();
//	}
//
//	@RequestMapping(value = "Patient", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Patient> createEmployee(@RequestBody Patient patient) throws URISyntaxException {
//		try {
//			Patient result = patientService.save(patient);
//			return ResponseEntity.created(new URI("/api/Patient/" + result.getId())).body(result);
//		} catch (EntityExistsException e) {
//			return new ResponseEntity<Patient>(HttpStatus.CONFLICT);
//		}
//	}
//
//	@RequestMapping(value = "Patient", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) throws URISyntaxException {
//		if (patient.getId() == null) {
//			return new ResponseEntity<Patient>(HttpStatus.NOT_FOUND);
//		}
//
//		try {
//			Patient result = patientService.update(patient);
//
//			return ResponseEntity.created(new URI("/api/patient/" + result.getId())).body(result);
//		} catch (EntityNotFoundException e) {
//			return new ResponseEntity<Patient>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@RequestMapping(value = "/patient/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Void> deletePatient(@PathVariable Integer id) {
//		patientService.delete(id);
//
//		return ResponseEntity.ok().build();
//	}
//}
