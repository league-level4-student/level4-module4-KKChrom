package _04_hospital;

import java.util.ArrayList;


public class Doctor {
	ArrayList<Patient> p = new ArrayList<Patient>();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException{
		// TODO Auto-generated method stub
		
		p.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return p;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i =0; i < p.size(); i ++)
		{
			p.get(i).feelsCaredFor();
		}
}
}
