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
This POJO Java class is automatically generated from the BeliefStatement stereotype
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

public class BeliefStatement {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute agent.
	*/
	@SerializedName("agent")
	private List<String> _agent = new ArrayList<String>();
	

		
	/*
	Variable for the attribute beliefAgent.
	*/
	@SerializedName("beliefAgent")
	private List<String> _beliefAgent = new ArrayList<String>();
	

		
	/*
	Variable for the attribute beliefDegree.
	*/
	@SerializedName("beliefDegree")
	private List<String> _beliefDegree = new ArrayList<String>();
	

		
	/*
	Variable for the attribute duration.
	*/
	@SerializedName("duration")
	private List<String> _duration = new ArrayList<String>();
	

		
	/*
	Variable for the attribute from.
	*/
	@SerializedName("from")
	private List<String> _from = new ArrayList<String>();
	

		
	/*
	Variable for the attribute prerequisites.
	*/
	@SerializedName("prerequisites")
	private List<String> _prerequisites = new ArrayList<String>();
	

		
	/*
	Variable for the attribute substatements.
	*/
	@SerializedName("substatements")
	private List<String> _substatements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute uncertainties.
	*/
	@SerializedName("uncertainties")
	private List<String> _uncertainties = new ArrayList<String>();
	

		
	/*
	Variable for the attribute uncertainty.
	*/
	@SerializedName("uncertainty")
	private List<String> _uncertainty = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("BeliefStatement");

	public BeliefStatement() {
		/*
		Variable for the attribute agent.
		*/
		this._agent = new ArrayList<String>();
		/*
		Variable for the attribute beliefAgent.
		*/
		this._beliefAgent = new ArrayList<String>();
		/*
		Variable for the attribute beliefDegree.
		*/
		this._beliefDegree = new ArrayList<String>();
		/*
		Variable for the attribute duration.
		*/
		this._duration = new ArrayList<String>();
		/*
		Variable for the attribute from.
		*/
		this._from = new ArrayList<String>();
		/*
		Variable for the attribute prerequisites.
		*/
		this._prerequisites = new ArrayList<String>();
		/*
		Variable for the attribute substatements.
		*/
		this._substatements = new ArrayList<String>();
		/*
		Variable for the attribute uncertainties.
		*/
		this._uncertainties = new ArrayList<String>();
		/*
		Variable for the attribute uncertainty.
		*/
		this._uncertainty = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the BeliefStatement POJO class
		
		BeliefStatement _stereo = new BeliefStatement();
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
	 * @return the agent
	 */
	public List<String> getAgent() {
		return this._agent;
	}
	/**
	 * @param agent the agent to add
	 */
	public void addAgent(String _agent) {
		this._agent.add(_agent.toString());
	}
	/**
	 * @return the beliefAgent
	 */
	public List<String> getBeliefAgent() {
		return this._beliefAgent;
	}
	/**
	 * @param beliefAgent the beliefAgent to add
	 */
	public void addBeliefAgent(String _beliefAgent) {
		this._beliefAgent.add(_beliefAgent.toString());
	}
	/**
	 * @return the beliefDegree
	 */
	public List<String> getBeliefDegree() {
		return this._beliefDegree;
	}
	/**
	 * @param beliefDegree the beliefDegree to add
	 */
	public void addBeliefDegree(String _beliefDegree) {
		this._beliefDegree.add(_beliefDegree.toString());
	}
	/**
	 * @return the duration
	 */
	public List<String> getDuration() {
		return this._duration;
	}
	/**
	 * @param duration the duration to add
	 */
	public void addDuration(String _duration) {
		this._duration.add(_duration.toString());
	}
	/**
	 * @return the from
	 */
	public List<String> getFrom() {
		return this._from;
	}
	/**
	 * @param from the from to add
	 */
	public void addFrom(String _from) {
		this._from.add(_from.toString());
	}
	/**
	 * @return the prerequisites
	 */
	public List<String> getPrerequisites() {
		return this._prerequisites;
	}
	/**
	 * @param prerequisites the prerequisites to add
	 */
	public void addPrerequisites(String _prerequisites) {
		this._prerequisites.add(_prerequisites.toString());
	}
	/**
	 * @return the substatements
	 */
	public List<String> getSubstatements() {
		return this._substatements;
	}
	/**
	 * @param substatements the substatements to add
	 */
	public void addSubstatements(String _substatements) {
		this._substatements.add(_substatements.toString());
	}
	/**
	 * @return the uncertainties
	 */
	public List<String> getUncertainties() {
		return this._uncertainties;
	}
	/**
	 * @param uncertainties the uncertainties to add
	 */
	public void addUncertainties(String _uncertainties) {
		this._uncertainties.add(_uncertainties.toString());
	}
	/**
	 * @return the uncertainty
	 */
	public List<String> getUncertainty() {
		return this._uncertainty;
	}
	/**
	 * @param uncertainty the uncertainty to add
	 */
	public void addUncertainty(String _uncertainty) {
		this._uncertainty.add(_uncertainty.toString());
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