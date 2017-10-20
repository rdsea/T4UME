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
This POJO Java class is automatically generated from the TestConfiguration stereotype
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

public class TestConfiguration {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute configurations.
	*/
	@SerializedName("configurations")
	private List<String> _configurations = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute metrics.
	*/
	@SerializedName("metrics")
	private List<String> _metrics = new ArrayList<String>();
	

		
	/*
	Variable for the attribute testExecutors.
	*/
	@SerializedName("testExecutors")
	private List<String> _testExecutors = new ArrayList<String>();
	

		
	/*
	Variable for the attribute timeout.
	*/
	@SerializedName("timeout")
	private List<String> _timeout = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("TestConfiguration");

	public TestConfiguration() {
		/*
		Variable for the attribute configurations.
		*/
		this._configurations = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute metrics.
		*/
		this._metrics = new ArrayList<String>();
		/*
		Variable for the attribute testExecutors.
		*/
		this._testExecutors = new ArrayList<String>();
		/*
		Variable for the attribute timeout.
		*/
		this._timeout = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the TestConfiguration POJO class
		
		TestConfiguration _stereo = new TestConfiguration();
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
	 * @return the configurations
	 */
	public List<String> getConfigurations() {
		return this._configurations;
	}
	/**
	 * @param configurations the configurations to add
	 */
	public void addConfigurations(String _configurations) {
		this._configurations.add(_configurations.toString());
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
	 * @return the testExecutors
	 */
	public List<String> getTestExecutors() {
		return this._testExecutors;
	}
	/**
	 * @param testExecutors the testExecutors to add
	 */
	public void addTestExecutors(String _testExecutors) {
		this._testExecutors.add(_testExecutors.toString());
	}
	/**
	 * @return the timeout
	 */
	public List<String> getTimeout() {
		return this._timeout;
	}
	/**
	 * @param timeout the timeout to add
	 */
	public void addTimeout(String _timeout) {
		this._timeout.add(_timeout.toString());
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