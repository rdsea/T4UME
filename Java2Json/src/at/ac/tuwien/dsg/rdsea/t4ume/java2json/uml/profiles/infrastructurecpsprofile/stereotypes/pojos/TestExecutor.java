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
This POJO Java class is automatically generated from the TestExecutor stereotype
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

public class TestExecutor {



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
	Variable for the attribute distinctFromTarget.
	*/
	@SerializedName("distinctFromTarget")
	private List<String> _distinctFromTarget = new ArrayList<String>();
	

		
	/*
	Variable for the attribute strategy.
	*/
	@SerializedName("strategy")
	private List<String> _strategy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute swCapabilities.
	*/
	@SerializedName("swCapabilities")
	private List<String> _swCapabilities = new ArrayList<String>();
	

		
	/*
	Variable for the attribute targets.
	*/
	@SerializedName("targets")
	private List<String> _targets = new ArrayList<String>();
	

		
	/*
	Variable for the attribute testTriggers.
	*/
	@SerializedName("testTriggers")
	private List<String> _testTriggers = new ArrayList<String>();
	

		
	/*
	Variable for the attribute testUtilities.
	*/
	@SerializedName("testUtilities")
	private List<String> _testUtilities = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("TestExecutor");

	public TestExecutor() {
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute distinctFromTarget.
		*/
		this._distinctFromTarget = new ArrayList<String>();
		/*
		Variable for the attribute strategy.
		*/
		this._strategy = new ArrayList<String>();
		/*
		Variable for the attribute swCapabilities.
		*/
		this._swCapabilities = new ArrayList<String>();
		/*
		Variable for the attribute targets.
		*/
		this._targets = new ArrayList<String>();
		/*
		Variable for the attribute testTriggers.
		*/
		this._testTriggers = new ArrayList<String>();
		/*
		Variable for the attribute testUtilities.
		*/
		this._testUtilities = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the TestExecutor POJO class
		
		TestExecutor _stereo = new TestExecutor();
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
	 * @return the distinctFromTarget
	 */
	public List<String> getDistinctFromTarget() {
		return this._distinctFromTarget;
	}
	/**
	 * @param distinctFromTarget the distinctFromTarget to add
	 */
	public void addDistinctFromTarget(String _distinctFromTarget) {
		this._distinctFromTarget.add(_distinctFromTarget.toString());
	}
	/**
	 * @return the strategy
	 */
	public List<String> getStrategy() {
		return this._strategy;
	}
	/**
	 * @param strategy the strategy to add
	 */
	public void addStrategy(String _strategy) {
		this._strategy.add(_strategy.toString());
	}
	/**
	 * @return the swCapabilities
	 */
	public List<String> getSwCapabilities() {
		return this._swCapabilities;
	}
	/**
	 * @param swCapabilities the swCapabilities to add
	 */
	public void addSwCapabilities(String _swCapabilities) {
		this._swCapabilities.add(_swCapabilities.toString());
	}
	/**
	 * @return the targets
	 */
	public List<String> getTargets() {
		return this._targets;
	}
	/**
	 * @param targets the targets to add
	 */
	public void addTargets(String _targets) {
		this._targets.add(_targets.toString());
	}
	/**
	 * @return the testTriggers
	 */
	public List<String> getTestTriggers() {
		return this._testTriggers;
	}
	/**
	 * @param testTriggers the testTriggers to add
	 */
	public void addTestTriggers(String _testTriggers) {
		this._testTriggers.add(_testTriggers.toString());
	}
	/**
	 * @return the testUtilities
	 */
	public List<String> getTestUtilities() {
		return this._testUtilities;
	}
	/**
	 * @param testUtilities the testUtilities to add
	 */
	public void addTestUtilities(String _testUtilities) {
		this._testUtilities.add(_testUtilities.toString());
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