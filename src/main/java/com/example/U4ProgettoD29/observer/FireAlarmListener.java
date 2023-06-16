package com.example.U4ProgettoD29.observer;

import com.example.U4ProgettoD29.proxy.FireProbe;

public interface FireAlarmListener {

	public void onFireAlarm(FireProbe probe, double smokeLevel);

}
