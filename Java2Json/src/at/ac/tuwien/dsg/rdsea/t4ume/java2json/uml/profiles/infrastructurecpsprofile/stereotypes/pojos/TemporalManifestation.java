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
This POJO Java class is automatically generated from the TemporalManifestation stereotype
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

public class TemporalManifestation {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
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
	Variable for the attribute persistent_manifestation.
	*/
	@SerializedName("persistent_manifestation")
	private List<String> _persistent_manifestation = new ArrayList<String>();
	

		
	/*
	Variable for the attribute recurring_manifestation.
	*/
	@SerializedName("recurring_manifestation")
	private List<String> _recurring_manifestation = new ArrayList<String>();
	

		
	/*
	Variable for the attribute sporadic_manifestation.
	*/
	@SerializedName("sporadic_manifestation")
	private List<String> _sporadic_manifestation = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("TemporalManifestation");

	public TemporalManifestation() {
		/*
		Variable for the attribute configuration.
		*/
		this._configuration = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute persistent_manifestation.
		*/
		this._persistent_manifestation = new ArrayList<String>();
		/*
		Variable for the attribute recurring_manifestation.
		*/
		this._recurring_manifestation = new ArrayList<String>();
		/*
		Variable for the attribute sporadic_manifestation.
		*/
		this._sporadic_manifestation = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the TemporalManifestation POJO class
		
		TemporalManifestation _stereo = new TemporalManifestation();
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
	 * @return the persistent_manifestation
	 */
	public List<String> getPersistent_manifestation() {
		return this._persistent_manifestation;
	}
	/**
	 * @param persistent_manifestation the persistent_manifestation to add
	 */
	public void addPersistent_manifestation(String _persistent_manifestation) {
		this._persistent_manifestation.add(_persistent_manifestation.toString());
	}
	/**
	 * @return the recurring_manifestation
	 */
	public List<String> getRecurring_manifestation() {
		return this._recurring_manifestation;
	}
	/**
	 * @param recurring_manifestation the recurring_manifestation to add
	 */
	public void addRecurring_manifestation(String _recurring_manifestation) {
		this._recurring_manifestation.add(_recurring_manifestation.toString());
	}
	/**
	 * @return the sporadic_manifestation
	 */
	public List<String> getSporadic_manifestation() {
		return this._sporadic_manifestation;
	}
	/**
	 * @param sporadic_manifestation the sporadic_manifestation to add
	 */
	public void addSporadic_manifestation(String _sporadic_manifestation) {
		this._sporadic_manifestation.add(_sporadic_manifestation.toString());
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