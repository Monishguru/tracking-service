package com.dhl.test.trackingservice.model;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Tracking {

	
	private String trackingId;
	
	private UUID shipmentId;
}
