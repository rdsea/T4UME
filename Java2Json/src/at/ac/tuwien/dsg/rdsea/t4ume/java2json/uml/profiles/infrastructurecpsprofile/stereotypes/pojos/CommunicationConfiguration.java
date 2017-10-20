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
This POJO Java class is automatically generated from the CommunicationConfiguration stereotype
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

public class CommunicationConfiguration {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute clientID.
	*/
	@SerializedName("clientID")
	private List<String> _clientID = new ArrayList<String>();
	

		
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
	Variable for the attribute keepAlive.
	*/
	@SerializedName("keepAlive")
	private List<String> _keepAlive = new ArrayList<String>();
	

		
	/*
	Variable for the attribute portNumber.
	*/
	@SerializedName("portNumber")
	private List<String> _portNumber = new ArrayList<String>();
	

		
	/*
	Variable for the attribute protocolType.
	*/
	@SerializedName("protocolType")
	private List<String> _protocolType = new ArrayList<String>();
	

		
	/*
	Variable for the attribute qosLevel.
	*/
	@SerializedName("qosLevel")
	private List<String> _qosLevel = new ArrayList<String>();
	

		
	/*
	Variable for the attribute serverIP.
	*/
	@SerializedName("serverIP")
	private List<String> _serverIP = new ArrayList<String>();
	

		
	/*
	Variable for the attribute topics.
	*/
	@SerializedName("topics")
	private List<String> _topics = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("CommunicationConfiguration");

	public CommunicationConfiguration() {
		/*
		Variable for the attribute clientID.
		*/
		this._clientID = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute id.
		*/
		this._id = new ArrayList<String>();
		/*
		Variable for the attribute keepAlive.
		*/
		this._keepAlive = new ArrayList<String>();
		/*
		Variable for the attribute portNumber.
		*/
		this._portNumber = new ArrayList<String>();
		/*
		Variable for the attribute protocolType.
		*/
		this._protocolType = new ArrayList<String>();
		/*
		Variable for the attribute qosLevel.
		*/
		this._qosLevel = new ArrayList<String>();
		/*
		Variable for the attribute serverIP.
		*/
		this._serverIP = new ArrayList<String>();
		/*
		Variable for the attribute topics.
		*/
		this._topics = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the CommunicationConfiguration POJO class
		
		CommunicationConfiguration _stereo = new CommunicationConfiguration();
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
	 * @return the clientID
	 */
	public List<String> getClientID() {
		return this._clientID;
	}
	/**
	 * @param clientID the clientID to add
	 */
	public void addClientID(String _clientID) {
		this._clientID.add(_clientID.toString());
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
	 * @return the keepAlive
	 */
	public List<String> getKeepAlive() {
		return this._keepAlive;
	}
	/**
	 * @param keepAlive the keepAlive to add
	 */
	public void addKeepAlive(String _keepAlive) {
		this._keepAlive.add(_keepAlive.toString());
	}
	/**
	 * @return the portNumber
	 */
	public List<String> getPortNumber() {
		return this._portNumber;
	}
	/**
	 * @param portNumber the portNumber to add
	 */
	public void addPortNumber(String _portNumber) {
		this._portNumber.add(_portNumber.toString());
	}
	/**
	 * @return the protocolType
	 */
	public List<String> getProtocolType() {
		return this._protocolType;
	}
	/**
	 * @param protocolType the protocolType to add
	 */
	public void addProtocolType(String _protocolType) {
		this._protocolType.add(_protocolType.toString());
	}
	/**
	 * @return the qosLevel
	 */
	public List<String> getQosLevel() {
		return this._qosLevel;
	}
	/**
	 * @param qosLevel the qosLevel to add
	 */
	public void addQosLevel(String _qosLevel) {
		this._qosLevel.add(_qosLevel.toString());
	}
	/**
	 * @return the serverIP
	 */
	public List<String> getServerIP() {
		return this._serverIP;
	}
	/**
	 * @param serverIP the serverIP to add
	 */
	public void addServerIP(String _serverIP) {
		this._serverIP.add(_serverIP.toString());
	}
	/**
	 * @return the topics
	 */
	public List<String> getTopics() {
		return this._topics;
	}
	/**
	 * @param topics the topics to add
	 */
	public void addTopics(String _topics) {
		this._topics.add(_topics.toString());
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