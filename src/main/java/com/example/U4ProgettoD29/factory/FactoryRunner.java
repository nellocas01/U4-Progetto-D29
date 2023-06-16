package com.example.U4ProgettoD29.factory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FactoryRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		FireProbeFactory factory;

		factory = new FireProbeFactoryImpl();

		factory.createFireProbe(41.8781, -87.6298, 7.2);

	}

}
