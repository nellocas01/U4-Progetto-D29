package com.example.U4ProgettoD29.observer;

import org.springframework.stereotype.Component;

import com.example.U4ProgettoD29.proxy.FireProbe;

@Component
public class ControlCenter implements FireAlarm {
	@Override
	public void onFireAlarm(FireProbe probe, double smokeLevel) {
		double latitude = probe.getLatitude();
		double longitude = probe.getLongitude();
		System.out.println("Attenzione incendio in corso, livello di fumo : " + smokeLevel + ", latitudine: " + latitude
				+ ", longitudine: " + longitude);
	}

}
