package it.arcade.hospital.offer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class OfferService {
	
	private final OfferRepository offerRepository;

	public OfferService(OfferRepository offerRepository) {
		this.offerRepository = offerRepository;
	}
	
	public List<Offer> getAllOffersForDepartment(Department department) {
		return offerRepository.findAllByDepartment(department);

	}
	
	public List<Offer> getAllOffersByName (String offerName) {
		return offerRepository.findAllByOfferName(offerName);

	}

}
