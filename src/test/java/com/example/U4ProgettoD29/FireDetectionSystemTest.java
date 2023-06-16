package com.example.U4ProgettoD29;

import org.junit.jupiter.api.Test;

import com.example.U4ProgettoD29.factory.FireProbeFactoryImpl;
import com.example.U4ProgettoD29.observer.ControlCenter;
import com.example.U4ProgettoD29.proxy.FireProbe;

public class FireDetectionSystemTest {
	@Test
	void testFireAlarmNotification() {
		// Create control center
		ControlCenter controlCenter = new ControlCenter();

		// Create fire probe using factory
		FireProbeFactoryImpl fireProbeFactory = new FireProbeFactoryImpl();
		FireProbe fireProbe = fireProbeFactory.createFireProbe(41.8781, -87.6298, 7.2);

		// Simulate fire alarm
		controlCenter.onFireAlarm(fireProbe, fireProbe.getSmokeLevel());

		// Assert expected values
		// assertEquals(41.8781, fireProbe.getLatitude());
		// assertEquals(-87.6298, fireProbe.getLongitude());
		// assertEquals(7.2, fireProbe.getSmokeLevel());
	}
}