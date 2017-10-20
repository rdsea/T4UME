/*
__author__ = "TU Wien, Distributed System's Group", http://dsg.tuwien.ac.at/
__copyright__ = "Copyright 2017, TU Wien, Distributed Systems Group"
__license__   = EULA currently in development. Current terms of usage below.
__license_body__ We grant the right to use this software and create derivative work based on it for all non-commercial non-profit education purposes. 
__license_body__ For any commercial-related or profit-related usage of this software please contact 
__license_body__ Hong-Linh Truong truong@dsg.tuwien.ac.at
__license_body__ 
__license_body__ Warranty:
__license_body__ The software is provided "AS IS", without warranty of any kind, express or implied,
__license_body__ including but not limited to the warranties of merchantability, fitness for a
__license_body__ particular purpose and noninfringement. in no event shall the authors or copyright
__license_body__ holders be liable for any claim, damages or other liability, whether in an action of
__license_body__ contract, tort or otherwise, arising from, out of or in connection with the software or
__license_body__ the use or other dealings in the software.
__maintainer__ = "Luca Berardinelli"
__email__ = "luca.berardinelli@tuwien.ac.at"
__social__ = "https://www.linkedin.com/in/lucaberardinelli/"
*/

package at.ac.tuwien.dsg.rdsea.t4ume.java2json.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the RiskLevel enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@609ae51a (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class RiskLevel {

	/*
	Static Variable for the literal Low.
	*/ 
	public String _Low = new String("Low");
	
	/*
	Static Variable for the literal Medium.
	*/ 
	public String _Medium = new String("Medium");
	
	/*
	Static Variable for the literal High.
	*/ 
	public String _High = new String("High");
	
	/*
	Static Variable for the literal Extreme.
	*/ 
	public String _Extreme = new String("Extreme");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("RiskLevel");

	public RiskLevel() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the RiskLevel POJO class
		
		RiskLevel enumeration = new RiskLevel();
		enumeration.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String elem = gson.toJson(this);
        
        System.out.println("elem = " + elem);    
        
        return elem;   
	}

	/**
	 * @return the _Low
	 */
	public String getLow() {
		return _Low;
	}
	/**
	 * @return the _Medium
	 */
	public String getMedium() {
		return _Medium;
	}
	/**
	 * @return the _High
	 */
	public String getHigh() {
		return _High;
	}
	/**
	 * @return the _Extreme
	 */
	public String getExtreme() {
		return _Extreme;
	}
}