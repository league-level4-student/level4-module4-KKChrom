package _04_hospital;

import java.util.List;
import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> dL = new ArrayList<Doctor>();
	ArrayList<Patient> pL = new ArrayList<Patient>();

	
	
	public void testAddDoctor (){
	}
	

	public void addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		dL.add(d);
	}


	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return dL;
	}


	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		pL.add(patient);
		
	}


	public ArrayList<Patient> getPatients() {
		return pL;
		// TODO Auto-generated method stub
		
	}


	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		ArrayList<Patient> plT = pL;
		System.out.println("plt size = "+plT.size());
	System.out.println("pL size = "+pL.size());
		for(int i =0;i<dL.size();i++)
		{
			for(int j =0;j<plT.size();j++)
			{
				try {
					boolean b = dL.get(i).assignPatient(plT.get(j));
					if(b)
					{
					plT.remove(j);
					j=-1;
					System.out.println("removing "+(j+1)+" plt size = "+plT.size());
					}
				} catch (DoctorFullException e) {
					System.out.println("break");
					break;
					
				}
				
			}
		}
	}

}
