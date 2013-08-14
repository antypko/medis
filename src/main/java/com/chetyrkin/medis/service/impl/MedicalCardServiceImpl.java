package com.chetyrkin.medis.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chetyrkin.medis.dao.MedicalCardDAO;
import com.chetyrkin.medis.domain.MedicalCard;
import com.chetyrkin.medis.dto.MedicalCardDTO;
import com.chetyrkin.medis.service.MedicalCardService;
import com.chetyrkin.medis.transformer.MedicalCardTransformer;

@Service("medicalCardService")
@Transactional(readOnly = true)
public class MedicalCardServiceImpl implements MedicalCardService {

	private MedicalCardDAO medicalCardDAO;

	@Autowired
	private MedicalCardTransformer medicalCardTransformer;

	@Autowired
	public MedicalCardServiceImpl(MedicalCardDAO medicalCardDAO) {
		this.medicalCardDAO = medicalCardDAO;
	}

	@Override
	public Set<MedicalCardDTO> getAll() {
		return medicalCardTransformer.toDTO(medicalCardDAO.getAll());
	}

	@Override
	@Transactional(readOnly = false)
	public MedicalCardDTO saveOrUpdate(MedicalCardDTO medicalCardDTO) {
		MedicalCard medicalCard = medicalCardTransformer.toDomain(medicalCardDTO);
		medicalCardDAO.saveOrUpdate(medicalCard);
		return medicalCardTransformer.toDto(medicalCard);
	}

	@Override
	public MedicalCardDTO findById(Long id) {
		MedicalCardDTO medicalCardDTO;
		MedicalCard medicalCard = medicalCardDAO.findById(id);
		if (medicalCard != null) {
			medicalCardDTO = medicalCardTransformer.toDto(medicalCard);
		} else {
			medicalCardDTO = new MedicalCardDTO();
		}
		return medicalCardDTO;
	}

}
