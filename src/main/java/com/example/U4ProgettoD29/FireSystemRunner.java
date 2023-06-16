
package com.example.U4ProgettoD29;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.U4ProgettoD29.observer.ControlCenter;
import com.example.U4ProgettoD29.proxy.FireProbe;
import com.example.U4ProgettoD29.proxy.FireProbeFactory;

@Component
public class FireSystemRunner implements CommandLineRunner {
	@Autowired
	ControlCenter controlCenter;

	@Autowired
	FireProbeFactory fireProbeFactory;

	public FireSystemRunner(ControlCenter controlCenter, FireProbeFactory fireProbeFactory) {
		this.controlCenter = controlCenter;
		this.fireProbeFactory = fireProbeFactory;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Creazione e configurazione delle sonde
		FireProbe fireProbe1 = fireProbeFactory.createFireProbe(41.8781, -87.6298, 7.2);
		FireProbe fireProbe2 = fireProbeFactory.createFireProbe(42.3601, -71.0589, 4.5);

		// Aggiunta del centro di controllo come listener per le sonde
		// fireProbe1.addListener(controlCenter);
		// fireProbe2.addListener(controlCenter);

		// Simulazione di un allarme incendio
		fireProbe1.triggerFireAlarm();
	}

}