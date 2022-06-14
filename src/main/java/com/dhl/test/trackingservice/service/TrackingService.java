package com.dhl.test.trackingservice.service;

import java.util.UUID;

import com.dhl.test.trackingservice.model.Tracking;

public interface TrackingService {

	public Tracking getTrackingId(UUID shipmentid);

}
