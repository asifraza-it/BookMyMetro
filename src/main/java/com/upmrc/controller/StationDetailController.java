package com.upmrc.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.upmrc.domain.StationDetail;
import com.upmrc.service.StationDetailService;

@RestController

public class StationDetailController {
	@Autowired
	StationDetailService stdservice;
	
	@PostMapping("/addStation")
	public StationDetail addStation(@RequestBody StationDetail std) {
		return stdservice.stdAdd(std);	
	}
	
	@PostMapping("/addAllStation")
	public List<StationDetail> addAllStation(@RequestBody List<StationDetail> std1) {
		return stdservice.stdAddAll(std1);
	}

	@GetMapping("/allStation")
	public List<String> allStation() {
		List<StationDetail> stationList = stdservice.fetchAllStations();
		List<String> station=stationList.stream().map(p->p.getStationName()).collect(Collectors.toList());
		return station;
	}
	
	@PostMapping("/findByid")
	public StationDetail findByid(@RequestBody int stationid) {
		return stdservice.findStationbyId(stationid);
	}
}
