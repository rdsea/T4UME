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

package at.ac.tuwien.dsg.rdsea.t4ume.java2json.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SoftwareDefinedCapability stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@e14a3a7 (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class SoftwareDefinedCapability {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute endpoint.
	*/
	@SerializedName("endpoint")
	private List<String> _endpoint = new ArrayList<String>();
	

		
	/*
	Variable for the attribute enforcementProtocol.
	*/
	@SerializedName("enforcementProtocol")
	private List<String> _enforcementProtocol = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mechanism.
	*/
	@SerializedName("mechanism")
	private List<String> _mechanism = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("SoftwareDefinedCapability");

	public SoftwareDefinedCapability() {
		/*
		Variable for the attribute endpoint.
		*/
		this._endpoint = new ArrayList<String>();
		/*
		Variable for the attribute enforcementProtocol.
		*/
		this._enforcementProtocol = new ArrayList<String>();
		/*
		Variable for the attribute mechanism.
		*/
		this._mechanism = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the SoftwareDefinedCapability POJO class
		
		SoftwareDefinedCapability _stereo = new SoftwareDefinedCapability();
		_stereo.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String _element = gson.toJson(this);
        
        System.out.println("element = " + _element);    
        
        return _element;   
	}

	/**
	 * @return the endpoint
	 */
	public List<String> getEndpoint() {
		return this._endpoint;
	}
	/**
	 * @param endpoint the endpoint to add
	 */
	public void addEndpoint(String _endpoint) {
		this._endpoint.add(_endpoint.toString());
	}
	/**
	 * @return the enforcementProtocol
	 */
	public List<String> getEnforcementProtocol() {
		return this._enforcementProtocol;
	}
	/**
	 * @param enforcementProtocol the enforcementProtocol to add
	 */
	public void addEnforcementProtocol(String _enforcementProtocol) {
		this._enforcementProtocol.add(_enforcementProtocol.toString());
	}
	/**
	 * @return the mechanism
	 */
	public List<String> getMechanism() {
		return this._mechanism;
	}
	/**
	 * @param mechanism the mechanism to add
	 */
	public void addMechanism(String _mechanism) {
		this._mechanism.add(_mechanism.toString());
	}
	/**
	 * @return the _instanceof
	 */
	public String getName() {
		return this._instanceof;
	}
	/**
	 * @param end the Communication to add
	 */
	public void setName(String _instanceof) {
		this._instanceof = _instanceof;
	}
	
}