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
This POJO Java class is automatically generated from the PhysicalMetric stereotype
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

public class PhysicalMetric {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute id.
	*/
	@SerializedName("id")
	private List<String> _id = new ArrayList<String>();
	

		
	/*
	Variable for the attribute infrastructure_level_uncertainty.
	*/
	@SerializedName("infrastructure_level_uncertainty")
	private List<String> _infrastructure_level_uncertainty = new ArrayList<String>();
	

		
	/*
	Variable for the attribute period.
	*/
	@SerializedName("period")
	private List<String> _period = new ArrayList<String>();
	

		
	/*
	Variable for the attribute quantity.
	*/
	@SerializedName("quantity")
	private List<String> _quantity = new ArrayList<String>();
	

		
	/*
	Variable for the attribute unit.
	*/
	@SerializedName("unit")
	private List<String> _unit = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("PhysicalMetric");

	public PhysicalMetric() {
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute id.
		*/
		this._id = new ArrayList<String>();
		/*
		Variable for the attribute infrastructure_level_uncertainty.
		*/
		this._infrastructure_level_uncertainty = new ArrayList<String>();
		/*
		Variable for the attribute period.
		*/
		this._period = new ArrayList<String>();
		/*
		Variable for the attribute quantity.
		*/
		this._quantity = new ArrayList<String>();
		/*
		Variable for the attribute unit.
		*/
		this._unit = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the PhysicalMetric POJO class
		
		PhysicalMetric _stereo = new PhysicalMetric();
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
	 * @return the id
	 */
	public List<String> getId() {
		return this._id;
	}
	/**
	 * @param id the id to add
	 */
	public void addId(String _id) {
		this._id.add(_id.toString());
	}
	/**
	 * @return the infrastructure_level_uncertainty
	 */
	public List<String> getInfrastructure_level_uncertainty() {
		return this._infrastructure_level_uncertainty;
	}
	/**
	 * @param infrastructure_level_uncertainty the infrastructure_level_uncertainty to add
	 */
	public void addInfrastructure_level_uncertainty(String _infrastructure_level_uncertainty) {
		this._infrastructure_level_uncertainty.add(_infrastructure_level_uncertainty.toString());
	}
	/**
	 * @return the period
	 */
	public List<String> getPeriod() {
		return this._period;
	}
	/**
	 * @param period the period to add
	 */
	public void addPeriod(String _period) {
		this._period.add(_period.toString());
	}
	/**
	 * @return the quantity
	 */
	public List<String> getQuantity() {
		return this._quantity;
	}
	/**
	 * @param quantity the quantity to add
	 */
	public void addQuantity(String _quantity) {
		this._quantity.add(_quantity.toString());
	}
	/**
	 * @return the unit
	 */
	public List<String> getUnit() {
		return this._unit;
	}
	/**
	 * @param unit the unit to add
	 */
	public void addUnit(String _unit) {
		this._unit.add(_unit.toString());
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