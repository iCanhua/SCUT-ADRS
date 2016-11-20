package com.scut.adrs.recommendation.service;

import java.util.Map;

import com.scut.adrs.domain.Doctor;
import com.scut.adrs.domain.Patient;

public interface DoctorMatch {
	public Map<Doctor,Float> doctorMatch(Patient patient);
}
