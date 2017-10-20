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
This POJO Java class is automatically generated from the Infrastructure stereotype
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

public class Infrastructure {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute SensorDataMngmtMechanism.
	*/
	@SerializedName("SensorDataMngmtMechanism")
	private List<String> _SensorDataMngmtMechanism = new ArrayList<String>();
	

		
	/*
	Variable for the attribute applicationElements.
	*/
	@SerializedName("applicationElements")
	private List<String> _applicationElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute cloudServices.
	*/
	@SerializedName("cloudServices")
	private List<String> _cloudServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute configs.
	*/
	@SerializedName("configs")
	private List<String> _configs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute containers.
	*/
	@SerializedName("containers")
	private List<String> _containers = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute hasSensorDataManagementMechanism.
	*/
	@SerializedName("hasSensorDataManagementMechanism")
	private List<String> _hasSensorDataManagementMechanism = new ArrayList<String>();
	

		
	/*
	Variable for the attribute id.
	*/
	@SerializedName("id")
	private List<String> _id = new ArrayList<String>();
	

		
	/*
	Variable for the attribute infrastructureElements.
	*/
	@SerializedName("infrastructureElements")
	private List<String> _infrastructureElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute integrationElements.
	*/
	@SerializedName("integrationElements")
	private List<String> _integrationElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute metrics.
	*/
	@SerializedName("metrics")
	private List<String> _metrics = new ArrayList<String>();
	

		
	/*
	Variable for the attribute targetPackage.
	*/
	@SerializedName("targetPackage")
	private List<String> _targetPackage = new ArrayList<String>();
	

		
	/*
	Variable for the attribute testConfigs.
	*/
	@SerializedName("testConfigs")
	private List<String> _testConfigs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute units.
	*/
	@SerializedName("units")
	private List<String> _units = new ArrayList<String>();
	

		
	/*
	Variable for the attribute virtualUnits.
	*/
	@SerializedName("virtualUnits")
	private List<String> _virtualUnits = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("Infrastructure");

	public Infrastructure() {
		/*
		Variable for the attribute SensorDataMngmtMechanism.
		*/
		this._SensorDataMngmtMechanism = new ArrayList<String>();
		/*
		Variable for the attribute applicationElements.
		*/
		this._applicationElements = new ArrayList<String>();
		/*
		Variable for the attribute cloudServices.
		*/
		this._cloudServices = new ArrayList<String>();
		/*
		Variable for the attribute configs.
		*/
		this._configs = new ArrayList<String>();
		/*
		Variable for the attribute containers.
		*/
		this._containers = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute hasSensorDataManagementMechanism.
		*/
		this._hasSensorDataManagementMechanism = new ArrayList<String>();
		/*
		Variable for the attribute id.
		*/
		this._id = new ArrayList<String>();
		/*
		Variable for the attribute infrastructureElements.
		*/
		this._infrastructureElements = new ArrayList<String>();
		/*
		Variable for the attribute integrationElements.
		*/
		this._integrationElements = new ArrayList<String>();
		/*
		Variable for the attribute metrics.
		*/
		this._metrics = new ArrayList<String>();
		/*
		Variable for the attribute targetPackage.
		*/
		this._targetPackage = new ArrayList<String>();
		/*
		Variable for the attribute testConfigs.
		*/
		this._testConfigs = new ArrayList<String>();
		/*
		Variable for the attribute units.
		*/
		this._units = new ArrayList<String>();
		/*
		Variable for the attribute virtualUnits.
		*/
		this._virtualUnits = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the Infrastructure POJO class
		
		Infrastructure _stereo = new Infrastructure();
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
	 * @return the SensorDataMngmtMechanism
	 */
	public List<String> getSensorDataMngmtMechanism() {
		return this._SensorDataMngmtMechanism;
	}
	/**
	 * @param SensorDataMngmtMechanism the SensorDataMngmtMechanism to add
	 */
	public void addSensorDataMngmtMechanism(String _SensorDataMngmtMechanism) {
		this._SensorDataMngmtMechanism.add(_SensorDataMngmtMechanism.toString());
	}
	/**
	 * @return the applicationElements
	 */
	public List<String> getApplicationElements() {
		return this._applicationElements;
	}
	/**
	 * @param applicationElements the applicationElements to add
	 */
	public void addApplicationElements(String _applicationElements) {
		this._applicationElements.add(_applicationElements.toString());
	}
	/**
	 * @return the cloudServices
	 */
	public List<String> getCloudServices() {
		return this._cloudServices;
	}
	/**
	 * @param cloudServices the cloudServices to add
	 */
	public void addCloudServices(String _cloudServices) {
		this._cloudServices.add(_cloudServices.toString());
	}
	/**
	 * @return the configs
	 */
	public List<String> getConfigs() {
		return this._configs;
	}
	/**
	 * @param configs the configs to add
	 */
	public void addConfigs(String _configs) {
		this._configs.add(_configs.toString());
	}
	/**
	 * @return the containers
	 */
	public List<String> getContainers() {
		return this._containers;
	}
	/**
	 * @param containers the containers to add
	 */
	public void addContainers(String _containers) {
		this._containers.add(_containers.toString());
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
	 * @return the hasSensorDataManagementMechanism
	 */
	public List<String> getHasSensorDataManagementMechanism() {
		return this._hasSensorDataManagementMechanism;
	}
	/**
	 * @param hasSensorDataManagementMechanism the hasSensorDataManagementMechanism to add
	 */
	public void addHasSensorDataManagementMechanism(String _hasSensorDataManagementMechanism) {
		this._hasSensorDataManagementMechanism.add(_hasSensorDataManagementMechanism.toString());
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
	 * @return the infrastructureElements
	 */
	public List<String> getInfrastructureElements() {
		return this._infrastructureElements;
	}
	/**
	 * @param infrastructureElements the infrastructureElements to add
	 */
	public void addInfrastructureElements(String _infrastructureElements) {
		this._infrastructureElements.add(_infrastructureElements.toString());
	}
	/**
	 * @return the integrationElements
	 */
	public List<String> getIntegrationElements() {
		return this._integrationElements;
	}
	/**
	 * @param integrationElements the integrationElements to add
	 */
	public void addIntegrationElements(String _integrationElements) {
		this._integrationElements.add(_integrationElements.toString());
	}
	/**
	 * @return the metrics
	 */
	public List<String> getMetrics() {
		return this._metrics;
	}
	/**
	 * @param metrics the metrics to add
	 */
	public void addMetrics(String _metrics) {
		this._metrics.add(_metrics.toString());
	}
	/**
	 * @return the targetPackage
	 */
	public List<String> getTargetPackage() {
		return this._targetPackage;
	}
	/**
	 * @param targetPackage the targetPackage to add
	 */
	public void addTargetPackage(String _targetPackage) {
		this._targetPackage.add(_targetPackage.toString());
	}
	/**
	 * @return the testConfigs
	 */
	public List<String> getTestConfigs() {
		return this._testConfigs;
	}
	/**
	 * @param testConfigs the testConfigs to add
	 */
	public void addTestConfigs(String _testConfigs) {
		this._testConfigs.add(_testConfigs.toString());
	}
	/**
	 * @return the units
	 */
	public List<String> getUnits() {
		return this._units;
	}
	/**
	 * @param units the units to add
	 */
	public void addUnits(String _units) {
		this._units.add(_units.toString());
	}
	/**
	 * @return the virtualUnits
	 */
	public List<String> getVirtualUnits() {
		return this._virtualUnits;
	}
	/**
	 * @param virtualUnits the virtualUnits to add
	 */
	public void addVirtualUnits(String _virtualUnits) {
		this._virtualUnits.add(_virtualUnits.toString());
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