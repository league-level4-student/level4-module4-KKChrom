package _04_hospital;

import java.util.ArrayList;


public class Doctor {
	boolean b = false;
	ArrayList<Patient> p = new ArrayList<Patient>();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean assignPatient(Patient patient) throws DoctorFullException{
		// TODO Auto-generated method stub
		DoctorFullException dfe = new DoctorFullException();
		if(p.size()<=2)
		{
			p.add(patient);
			return true;
		}
		else
		{
			throw dfe;
		}
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return p;
	}

	public  void doMedicine() {
		// TODO Auto-generated method stub
		for(int i =0; i < p.size();i++)
		{
			p.get(i).checkPulse();
		}
}
}
