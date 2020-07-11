package com.monitor.parcel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monitor.parcel.dto.AddParcelRequest;
import com.monitor.parcel.exception.ParcelNotFoundException;
import com.monitor.parcel.model.ParcelInfo;
import com.monitor.parcel.repository.ParcelInfoRepository;
import com.monitor.parcel.repository.UserRepository;

@Service
public class AddParcelService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private ParcelInfoRepository parcelInfoRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void addParcel(AddParcelRequest addParcelRequest) {
		ParcelInfo parcelInfo = new ParcelInfo();
		parcelInfo.setDestinationAddress(addParcelRequest.getDestinationAddress());
		parcelInfo.setExpectedDelivery(addParcelRequest.getExpectedDelivery());
		parcelInfo.setItemType(addParcelRequest.getItemType());
		parcelInfo.setPickupDate(addParcelRequest.getPickupDate());
		parcelInfo.setPrice(addParcelRequest.getPrice());
		parcelInfo.setSourceAddress(addParcelRequest.getSourceAddress());
		parcelInfo.setWeight(addParcelRequest.getWeight());
		authService.getCurrentUser()
				.orElseThrow(() -> new IllegalArgumentException("Employee Not Found"));
		
		parcelInfoRepository.save(parcelInfo);
	}
	
	
    @Transactional
    public ParcelInfo readSingleParcel(Long id) {
    	ParcelInfo parcelInfo = parcelInfoRepository.findById(id).orElseThrow(() -> new ParcelNotFoundException("For id " + id));
        return parcelInfo;
    }
    
}
