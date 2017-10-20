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
This POJO Java class is automatically generated from the CloudService stereotype
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

public class CloudService {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute cloudProvider.
	*/
	@SerializedName("cloudProvider")
	private List<String> _cloudProvider = new ArrayList<String>();
	

		
	/*
	Variable for the attribute communicationConfigs.
	*/
	@SerializedName("communicationConfigs")
	private List<String> _communicationConfigs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute computingConfigs.
	*/
	@SerializedName("computingConfigs")
	private List<String> _computingConfigs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute dataProvider.
	*/
	@SerializedName("dataProvider")
	private List<String> _dataProvider = new ArrayList<String>();
	

		
	/*
	Variable for the attribute id.
	*/
	@SerializedName("id")
	private List<String> _id = new ArrayList<String>();
	

		
	/*
	Variable for the attribute serviceType.
	*/
	@SerializedName("serviceType")
	private List<String> _serviceType = new ArrayList<String>();
	

		
	/*
	Variable for the attribute storageConfigs.
	*/
	@SerializedName("storageConfigs")
	private List<String> _storageConfigs = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("CloudService");

	public CloudService() {
		/*
		Variable for the attribute cloudProvider.
		*/
		this._cloudProvider = new ArrayList<String>();
		/*
		Variable for the attribute communicationConfigs.
		*/
		this._communicationConfigs = new ArrayList<String>();
		/*
		Variable for the attribute computingConfigs.
		*/
		this._computingConfigs = new ArrayList<String>();
		/*
		Variable for the attribute dataProvider.
		*/
		this._dataProvider = new ArrayList<String>();
		/*
		Variable for the attribute id.
		*/
		this._id = new ArrayList<String>();
		/*
		Variable for the attribute serviceType.
		*/
		this._serviceType = new ArrayList<String>();
		/*
		Variable for the attribute storageConfigs.
		*/
		this._storageConfigs = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the CloudService POJO class
		
		CloudService _stereo = new CloudService();
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
	 * @return the cloudProvider
	 */
	public List<String> getCloudProvider() {
		return this._cloudProvider;
	}
	/**
	 * @param cloudProvider the cloudProvider to add
	 */
	public void addCloudProvider(String _cloudProvider) {
		this._cloudProvider.add(_cloudProvider.toString());
	}
	/**
	 * @return the communicationConfigs
	 */
	public List<String> getCommunicationConfigs() {
		return this._communicationConfigs;
	}
	/**
	 * @param communicationConfigs the communicationConfigs to add
	 */
	public void addCommunicationConfigs(String _communicationConfigs) {
		this._communicationConfigs.add(_communicationConfigs.toString());
	}
	/**
	 * @return the computingConfigs
	 */
	public List<String> getComputingConfigs() {
		return this._computingConfigs;
	}
	/**
	 * @param computingConfigs the computingConfigs to add
	 */
	public void addComputingConfigs(String _computingConfigs) {
		this._computingConfigs.add(_computingConfigs.toString());
	}
	/**
	 * @return the dataProvider
	 */
	public List<String> getDataProvider() {
		return this._dataProvider;
	}
	/**
	 * @param dataProvider the dataProvider to add
	 */
	public void addDataProvider(String _dataProvider) {
		this._dataProvider.add(_dataProvider.toString());
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
	 * @return the serviceType
	 */
	public List<String> getServiceType() {
		return this._serviceType;
	}
	/**
	 * @param serviceType the serviceType to add
	 */
	public void addServiceType(String _serviceType) {
		this._serviceType.add(_serviceType.toString());
	}
	/**
	 * @return the storageConfigs
	 */
	public List<String> getStorageConfigs() {
		return this._storageConfigs;
	}
	/**
	 * @param storageConfigs the storageConfigs to add
	 */
	public void addStorageConfigs(String _storageConfigs) {
		this._storageConfigs.add(_storageConfigs.toString());
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