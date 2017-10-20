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
This POJO Java class is automatically generated from the PseudostateKind enumeration
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

public class PseudostateKind {

	/*
	Static Variable for the literal initial.
	*/ 
	public String _initial = new String("initial");
	
	/*
	Static Variable for the literal deepHistory.
	*/ 
	public String _deepHistory = new String("deepHistory");
	
	/*
	Static Variable for the literal shallowHistory.
	*/ 
	public String _shallowHistory = new String("shallowHistory");
	
	/*
	Static Variable for the literal join.
	*/ 
	public String _join = new String("join");
	
	/*
	Static Variable for the literal fork.
	*/ 
	public String _fork = new String("fork");
	
	/*
	Static Variable for the literal junction.
	*/ 
	public String _junction = new String("junction");
	
	/*
	Static Variable for the literal choice.
	*/ 
	public String _choice = new String("choice");
	
	/*
	Static Variable for the literal entryPoint.
	*/ 
	public String _entryPoint = new String("entryPoint");
	
	/*
	Static Variable for the literal exitPoint.
	*/ 
	public String _exitPoint = new String("exitPoint");
	
	/*
	Static Variable for the literal terminate.
	*/ 
	public String _terminate = new String("terminate");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("PseudostateKind");

	public PseudostateKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PseudostateKind POJO class
		
		PseudostateKind enumeration = new PseudostateKind();
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
	 * @return the _initial
	 */
	public String getInitial() {
		return _initial;
	}
	/**
	 * @return the _deepHistory
	 */
	public String getDeepHistory() {
		return _deepHistory;
	}
	/**
	 * @return the _shallowHistory
	 */
	public String getShallowHistory() {
		return _shallowHistory;
	}
	/**
	 * @return the _join
	 */
	public String getJoin() {
		return _join;
	}
	/**
	 * @return the _fork
	 */
	public String getFork() {
		return _fork;
	}
	/**
	 * @return the _junction
	 */
	public String getJunction() {
		return _junction;
	}
	/**
	 * @return the _choice
	 */
	public String getChoice() {
		return _choice;
	}
	/**
	 * @return the _entryPoint
	 */
	public String getEntryPoint() {
		return _entryPoint;
	}
	/**
	 * @return the _exitPoint
	 */
	public String getExitPoint() {
		return _exitPoint;
	}
	/**
	 * @return the _terminate
	 */
	public String getTerminate() {
		return _terminate;
	}
}