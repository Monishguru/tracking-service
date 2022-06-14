package com.dhl.test.trackingservice.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dhl.test.trackingservice.model.Tracking;
import com.dhl.test.trackingservice.serviceimpl.TrackingServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/tracking")
public class TrackingController {

	@Autowired
	TrackingServiceImpl trackingServiceImpl;

	@GetMapping(value = "/generateTrackingId")
	public Tracking getTrackingId(@RequestParam(value = "shipmentId") UUID shipmentid) {
		log.info("Generating the tracking information");
		return trackingServiceImpl.getTrackingId(shipmentid);
	}

}
