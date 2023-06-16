package com.example.U4ProgettoD29.proxy;

public class FireProbeImpl implements FireProbe {
	private double latitude;
	private double longitude;
	private double smokeLevel;

	public FireProbeImpl(double latitude, double longitude, double smokeLevel) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
	}

	@Override
	public double getLatitude() {
		return latitude;
	}

	@Override
	public double getLongitude() {
		return longitude;
	}

	@Override
	public double getSmokeLevel() {
		return smokeLevel;
	}

}
