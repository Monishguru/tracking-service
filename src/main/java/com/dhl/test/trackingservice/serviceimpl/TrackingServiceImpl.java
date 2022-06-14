package com.dhl.test.trackingservice.serviceimpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dhl.test.trackingservice.model.Tracking;
import com.dhl.test.trackingservice.service.TrackingService;

import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;

@Service
@Slf4j
public class TrackingServiceImpl implements TrackingService {

	@Override
	public Tracking getTrackingId(UUID shipmentId) {

		Tracking trackingInfo = new Tracking();
		String trackingId = RandomString.make();
		trackingInfo.setShipmentId(shipmentId);
		trackingInfo.setTrackingId(trackingId);
		log.info("Generated tracking id {}",trackingId);
		return trackingInfo;
	}

}
