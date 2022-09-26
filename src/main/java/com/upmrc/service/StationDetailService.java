package com.upmrc.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upmrc.domain.StationDetail;
import com.upmrc.repository.StationRepository;


@Service
public class StationDetailService {
	@Autowired
	StationRepository stdrepo;

	public StationDetail stdAdd(StationDetail sd) {
		return stdrepo.save(sd);

	}

	public List<StationDetail> stdAddAll(List<StationDetail> std1) {
		return stdrepo.saveAll(std1);
	}
	public List<StationDetail> fetchAllStations(){
		return stdrepo.findAll();
	}

	public StationDetail findStationbyId(int stationid) {
	   
		Optional<StationDetail> stDetails = stdrepo.findById(stationid);
		if(stDetails.isPresent())
		  return stDetails.get();
		throw new RuntimeException("Station Not Found");
	}
	
}
