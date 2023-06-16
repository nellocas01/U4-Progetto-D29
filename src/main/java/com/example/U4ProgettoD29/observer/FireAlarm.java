package com.example.U4ProgettoD29.observer;

import com.example.U4ProgettoD29.proxy.FireProbe;

interface FireAlarm {
	void onFireAlarm(FireProbe probe, double smokeLevel);
}
