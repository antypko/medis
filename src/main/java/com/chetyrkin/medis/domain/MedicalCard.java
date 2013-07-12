package com.chetyrkin.medis.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="event")
public class MedicalCard {

	@Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
	
	@OneToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@Column(name="date")
	private Timestamp date;
	
	@Column(name="clinic_name")
	private String clinicName;
	
	@Column(name="hours_after_accident")
	private Integer hoursAfterAccident;

	@Column(name="hospitalized_in_planned_order")
	private Boolean hospitalizedInPlannedOrder;
	
	@Column(name="hospitalization_diagnosis")
	private String hospitalizationDiagnosis;
	
	@Column(name="facility_diagnosis")
	private String facilityDiagnosis;
	
	@Column(name="clinical_diagnosis")
	private String clinicalDiagnosis;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getClinicName() {
		return clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	public Integer getHoursAfterAccident() {
		return hoursAfterAccident;
	}

	public void setHoursAfterAccident(Integer hoursAfterAccident) {
		this.hoursAfterAccident = hoursAfterAccident;
	}

	public Boolean getHospitalizedInPlannedOrder() {
		return hospitalizedInPlannedOrder;
	}

	public void setHospitalizedInPlannedOrder(Boolean hospitalizedInPlannedOrder) {
		this.hospitalizedInPlannedOrder = hospitalizedInPlannedOrder;
	}

	public String getHospitalizationDiagnosis() {
		return hospitalizationDiagnosis;
	}

	public void setHospitalizationDiagnosis(String hospitalizationDiagnosis) {
		this.hospitalizationDiagnosis = hospitalizationDiagnosis;
	}

	public String getFacilityDiagnosis() {
		return facilityDiagnosis;
	}

	public void setFacilityDiagnosis(String facilityDiagnosis) {
		this.facilityDiagnosis = facilityDiagnosis;
	}

	public String getClinicalDiagnosis() {
		return clinicalDiagnosis;
	}

	public void setClinicalDiagnosis(String clinicalDiagnosis) {
		this.clinicalDiagnosis = clinicalDiagnosis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((clinicName == null) ? 0 : clinicName.hashCode());
		result = prime
				* result
				+ ((clinicalDiagnosis == null) ? 0 : clinicalDiagnosis
						.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime
				* result
				+ ((facilityDiagnosis == null) ? 0 : facilityDiagnosis
						.hashCode());
		result = prime
				* result
				+ ((hospitalizationDiagnosis == null) ? 0
						: hospitalizationDiagnosis.hashCode());
		result = prime
				* result
				+ ((hospitalizedInPlannedOrder == null) ? 0
						: hospitalizedInPlannedOrder.hashCode());
		result = prime
				* result
				+ ((hoursAfterAccident == null) ? 0 : hoursAfterAccident
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
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
		MedicalCard other = (MedicalCard) obj;
		if (clinicName == null) {
			if (other.clinicName != null)
				return false;
		} else if (!clinicName.equals(other.clinicName))
			return false;
		if (clinicalDiagnosis == null) {
			if (other.clinicalDiagnosis != null)
				return false;
		} else if (!clinicalDiagnosis.equals(other.clinicalDiagnosis))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (facilityDiagnosis == null) {
			if (other.facilityDiagnosis != null)
				return false;
		} else if (!facilityDiagnosis.equals(other.facilityDiagnosis))
			return false;
		if (hospitalizationDiagnosis == null) {
			if (other.hospitalizationDiagnosis != null)
				return false;
		} else if (!hospitalizationDiagnosis
				.equals(other.hospitalizationDiagnosis))
			return false;
		if (hospitalizedInPlannedOrder == null) {
			if (other.hospitalizedInPlannedOrder != null)
				return false;
		} else if (!hospitalizedInPlannedOrder
				.equals(other.hospitalizedInPlannedOrder))
			return false;
		if (hoursAfterAccident == null) {
			if (other.hoursAfterAccident != null)
				return false;
		} else if (!hoursAfterAccident.equals(other.hoursAfterAccident))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", patient=" + patient + ", date=" + date
				+ ", clinicName=" + clinicName + ", hoursAfterAccident="
				+ hoursAfterAccident + ", hospitalizedInPlannedOrder="
				+ hospitalizedInPlannedOrder + ", hospitalizationDiagnosis="
				+ hospitalizationDiagnosis + ", facilityDiagnosis="
				+ facilityDiagnosis + ", clinicalDiagnosis="
				+ clinicalDiagnosis + "]";
	}

		
}
