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
This POJO Java class is automatically generated from the InfrastructureLevelEffect stereotype
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

public class InfrastructureLevelEffect {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute CopyOf_configuration_1.
	*/
	@SerializedName("CopyOf_configuration_1")
	private List<String> _CopyOf_configuration_1 = new ArrayList<String>();
	

		
	/*
	Variable for the attribute CopyOf_description_1.
	*/
	@SerializedName("CopyOf_description_1")
	private List<String> _CopyOf_description_1 = new ArrayList<String>();
	

		
	/*
	Variable for the attribute configuration.
	*/
	@SerializedName("configuration")
	private List<String> _configuration = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("InfrastructureLevelEffect");

	public InfrastructureLevelEffect() {
		/*
		Variable for the attribute CopyOf_configuration_1.
		*/
		this._CopyOf_configuration_1 = new ArrayList<String>();
		/*
		Variable for the attribute CopyOf_description_1.
		*/
		this._CopyOf_description_1 = new ArrayList<String>();
		/*
		Variable for the attribute configuration.
		*/
		this._configuration = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the InfrastructureLevelEffect POJO class
		
		InfrastructureLevelEffect _stereo = new InfrastructureLevelEffect();
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
	 * @return the CopyOf_configuration_1
	 */
	public List<String> getCopyOf_configuration_1() {
		return this._CopyOf_configuration_1;
	}
	/**
	 * @param CopyOf_configuration_1 the CopyOf_configuration_1 to add
	 */
	public void addCopyOf_configuration_1(String _CopyOf_configuration_1) {
		this._CopyOf_configuration_1.add(_CopyOf_configuration_1.toString());
	}
	/**
	 * @return the CopyOf_description_1
	 */
	public List<String> getCopyOf_description_1() {
		return this._CopyOf_description_1;
	}
	/**
	 * @param CopyOf_description_1 the CopyOf_description_1 to add
	 */
	public void addCopyOf_description_1(String _CopyOf_description_1) {
		this._CopyOf_description_1.add(_CopyOf_description_1.toString());
	}
	/**
	 * @return the configuration
	 */
	public List<String> getConfiguration() {
		return this._configuration;
	}
	/**
	 * @param configuration the configuration to add
	 */
	public void addConfiguration(String _configuration) {
		this._configuration.add(_configuration.toString());
	}
	/**
	 * @return the description
	 */
	public List<String> getDescription() {
		return this._description;
	}
	/**
	 * @param description the description to add
	 */
	public void addDescription(String _description) {
		this._description.add(_description.toString());
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