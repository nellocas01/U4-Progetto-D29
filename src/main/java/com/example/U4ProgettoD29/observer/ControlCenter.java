package com.example.U4ProgettoD29.observer;

import com.example.U4ProgettoD29.proxy.FireProbe;

public class ControlCenter {
	public void onFireAlarm(FireProbe probe, double smokeLevel) {
		double latitude = probe.getLatitude();
		double longitude = probe.getLongitude();
		System.out.println("Alert staff - Probe: " + probe + ", Smoke Level: " + smokeLevel + ", Latitude: " + latitude
				+ ", Longitude: " + longitude);
	}

}
