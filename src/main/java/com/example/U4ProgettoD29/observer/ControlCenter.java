package com.example.U4ProgettoD29.observer;

import com.example.U4ProgettoD29.proxy.FireProbe;

public class ControlCenter implements Observer {
	private String updateLast;
	private int updateCount;

	public String getUpdateLast() {
		return updateLast;
	}

	@Override
	public void update(FireAlarm fa) {
		String url = "http://host/alarm?=fireAlarmId=" + fa.getFireAlarmId() + "&lat=" + fa.getLatitude() + "&lon=" + fa.getLongitude() + "&smokelevel=" + fa.getSmokeLevel();
		
		if(fa.getSmokeLevel() > 5) {
			if(url.contains("lat=74.941065&lon=32.147059")) {
				System.out.println();
				System.out.println("Allarme incendio!!!");
			}else {
				System.out.println();
				System.out.println("Allarme incendio avviato: " + url);
			}else {
				System.out.println();
				System.out.println("Incendio scampato!");
			}
		}
	}
}
