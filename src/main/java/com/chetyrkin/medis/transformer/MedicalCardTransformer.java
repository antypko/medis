package com.chetyrkin.medis.transformer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.chetyrkin.medis.domain.MedicalCard;
import com.chetyrkin.medis.dto.MedicalCardDTO;

@Component("medicalCardTransformer")
public class MedicalCardTransformer {

	public MedicalCardDTO toDto(final MedicalCard medicalCard) {
		if (medicalCard == null) {
			return new MedicalCardDTO();
		}
		MedicalCardDTO medicalCardDTO = new MedicalCardDTO();
		medicalCardDTO.setId(medicalCard.getId());
		medicalCardDTO.setPatient(medicalCard.getPatient());
		medicalCardDTO.setDate(medicalCard.getDate());
		medicalCardDTO.setClinicName(medicalCard.getClinicName());
		medicalCardDTO.setHoursAfterAccident(medicalCard.getHoursAfterAccident());
		medicalCardDTO.setHospitalizedInPlannedOrder(medicalCard.getHospitalizedInPlannedOrder());
		medicalCardDTO.setHospitalizationDiagnosis(medicalCard.getHospitalizationDiagnosis());
		medicalCardDTO.setFacilityDiagnosis(medicalCard.getFacilityDiagnosis());
		medicalCardDTO.setClinicalDiagnosis(medicalCard.getClinicalDiagnosis());
		return medicalCardDTO;
	}
	
	public MedicalCard toDomain(final MedicalCardDTO medicalCardDTO) {
		MedicalCard medicalCard = new MedicalCard();
		medicalCard.setId(medicalCardDTO.getId());
		medicalCard.setPatient(medicalCardDTO.getPatient());
		medicalCard.setDate(medicalCardDTO.getDate());
		medicalCard.setClinicName(medicalCardDTO.getClinicName());
		medicalCard.setHoursAfterAccident(medicalCardDTO.getHoursAfterAccident());
		medicalCard.setHospitalizedInPlannedOrder(medicalCardDTO.getHospitalizedInPlannedOrder());
		medicalCard.setHospitalizationDiagnosis(medicalCardDTO.getHospitalizationDiagnosis());
		medicalCard.setFacilityDiagnosis(medicalCardDTO.getFacilityDiagnosis());
		medicalCard.setClinicalDiagnosis(medicalCardDTO.getClinicalDiagnosis());
		return medicalCard;
	}
	
	public Set<MedicalCardDTO> toDTO(final Collection<MedicalCard> medicalCards) {
		Set<MedicalCardDTO> medicalCardsDTO = new HashSet<>();
		for(MedicalCard medicalCard : medicalCards) {
			medicalCardsDTO.add(this.toDto(medicalCard));
		}
		return medicalCardsDTO;
	}
}
