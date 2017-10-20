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
This POJO Java class is automatically generated from the ActuationBehaviorUncertainty stereotype
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

public class ActuationBehaviorUncertainty {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute cause.
	*/
	@SerializedName("cause")
	private List<String> _cause = new ArrayList<String>();
	

		
	/*
	Variable for the attribute cause_type.
	*/
	@SerializedName("cause_type")
	private List<String> _cause_type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute effect.
	*/
	@SerializedName("effect")
	private List<String> _effect = new ArrayList<String>();
	

		
	/*
	Variable for the attribute effect_propagation_type.
	*/
	@SerializedName("effect_propagation_type")
	private List<String> _effect_propagation_type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute field.
	*/
	@SerializedName("field")
	private List<String> _field = new ArrayList<String>();
	

		
	/*
	Variable for the attribute from.
	*/
	@SerializedName("from")
	private List<String> _from = new ArrayList<String>();
	

		
	/*
	Variable for the attribute functional_dimensionality_type.
	*/
	@SerializedName("functional_dimensionality_type")
	private List<String> _functional_dimensionality_type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute indeterminacySource.
	*/
	@SerializedName("indeterminacySource")
	private List<String> _indeterminacySource = new ArrayList<String>();
	

		
	/*
	Variable for the attribute kind.
	*/
	@SerializedName("kind")
	private List<String> _kind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute lifeTime.
	*/
	@SerializedName("lifeTime")
	private List<String> _lifeTime = new ArrayList<String>();
	

		
	/*
	Variable for the attribute locality.
	*/
	@SerializedName("locality")
	private List<String> _locality = new ArrayList<String>();
	

		
	/*
	Variable for the attribute locality_type.
	*/
	@SerializedName("locality_type")
	private List<String> _locality_type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute non_functional_dimensionality_type.
	*/
	@SerializedName("non_functional_dimensionality_type")
	private List<String> _non_functional_dimensionality_type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute observation_time_type.
	*/
	@SerializedName("observation_time_type")
	private List<String> _observation_time_type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute pattern.
	*/
	@SerializedName("pattern")
	private List<String> _pattern = new ArrayList<String>();
	

		
	/*
	Variable for the attribute referredCause.
	*/
	@SerializedName("referredCause")
	private List<String> _referredCause = new ArrayList<String>();
	

		
	/*
	Variable for the attribute referredEffect.
	*/
	@SerializedName("referredEffect")
	private List<String> _referredEffect = new ArrayList<String>();
	

		
	/*
	Variable for the attribute referredIndeterminacySource.
	*/
	@SerializedName("referredIndeterminacySource")
	private List<String> _referredIndeterminacySource = new ArrayList<String>();
	

		
	/*
	Variable for the attribute referredLifeTime.
	*/
	@SerializedName("referredLifeTime")
	private List<String> _referredLifeTime = new ArrayList<String>();
	

		
	/*
	Variable for the attribute referredPattern.
	*/
	@SerializedName("referredPattern")
	private List<String> _referredPattern = new ArrayList<String>();
	

		
	/*
	Variable for the attribute risk.
	*/
	@SerializedName("risk")
	private List<String> _risk = new ArrayList<String>();
	

		
	/*
	Variable for the attribute riskInDT.
	*/
	@SerializedName("riskInDT")
	private List<String> _riskInDT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute riskInDTViaClass.
	*/
	@SerializedName("riskInDTViaClass")
	private List<String> _riskInDTViaClass = new ArrayList<String>();
	

		
	/*
	Variable for the attribute riskLevel.
	*/
	@SerializedName("riskLevel")
	private List<String> _riskLevel = new ArrayList<String>();
	

		
	/*
	Variable for the attribute temporal_manifestation_type.
	*/
	@SerializedName("temporal_manifestation_type")
	private List<String> _temporal_manifestation_type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute uncertaintyMeasurement.
	*/
	@SerializedName("uncertaintyMeasurement")
	private List<String> _uncertaintyMeasurement = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("ActuationBehaviorUncertainty");

	public ActuationBehaviorUncertainty() {
		/*
		Variable for the attribute cause.
		*/
		this._cause = new ArrayList<String>();
		/*
		Variable for the attribute cause_type.
		*/
		this._cause_type = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute effect.
		*/
		this._effect = new ArrayList<String>();
		/*
		Variable for the attribute effect_propagation_type.
		*/
		this._effect_propagation_type = new ArrayList<String>();
		/*
		Variable for the attribute field.
		*/
		this._field = new ArrayList<String>();
		/*
		Variable for the attribute from.
		*/
		this._from = new ArrayList<String>();
		/*
		Variable for the attribute functional_dimensionality_type.
		*/
		this._functional_dimensionality_type = new ArrayList<String>();
		/*
		Variable for the attribute indeterminacySource.
		*/
		this._indeterminacySource = new ArrayList<String>();
		/*
		Variable for the attribute kind.
		*/
		this._kind = new ArrayList<String>();
		/*
		Variable for the attribute lifeTime.
		*/
		this._lifeTime = new ArrayList<String>();
		/*
		Variable for the attribute locality.
		*/
		this._locality = new ArrayList<String>();
		/*
		Variable for the attribute locality_type.
		*/
		this._locality_type = new ArrayList<String>();
		/*
		Variable for the attribute non_functional_dimensionality_type.
		*/
		this._non_functional_dimensionality_type = new ArrayList<String>();
		/*
		Variable for the attribute observation_time_type.
		*/
		this._observation_time_type = new ArrayList<String>();
		/*
		Variable for the attribute pattern.
		*/
		this._pattern = new ArrayList<String>();
		/*
		Variable for the attribute referredCause.
		*/
		this._referredCause = new ArrayList<String>();
		/*
		Variable for the attribute referredEffect.
		*/
		this._referredEffect = new ArrayList<String>();
		/*
		Variable for the attribute referredIndeterminacySource.
		*/
		this._referredIndeterminacySource = new ArrayList<String>();
		/*
		Variable for the attribute referredLifeTime.
		*/
		this._referredLifeTime = new ArrayList<String>();
		/*
		Variable for the attribute referredPattern.
		*/
		this._referredPattern = new ArrayList<String>();
		/*
		Variable for the attribute risk.
		*/
		this._risk = new ArrayList<String>();
		/*
		Variable for the attribute riskInDT.
		*/
		this._riskInDT = new ArrayList<String>();
		/*
		Variable for the attribute riskInDTViaClass.
		*/
		this._riskInDTViaClass = new ArrayList<String>();
		/*
		Variable for the attribute riskLevel.
		*/
		this._riskLevel = new ArrayList<String>();
		/*
		Variable for the attribute temporal_manifestation_type.
		*/
		this._temporal_manifestation_type = new ArrayList<String>();
		/*
		Variable for the attribute uncertaintyMeasurement.
		*/
		this._uncertaintyMeasurement = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the ActuationBehaviorUncertainty POJO class
		
		ActuationBehaviorUncertainty _stereo = new ActuationBehaviorUncertainty();
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
	 * @return the cause
	 */
	public List<String> getCause() {
		return this._cause;
	}
	/**
	 * @param cause the cause to add
	 */
	public void addCause(String _cause) {
		this._cause.add(_cause.toString());
	}
	/**
	 * @return the cause_type
	 */
	public List<String> getCause_type() {
		return this._cause_type;
	}
	/**
	 * @param cause_type the cause_type to add
	 */
	public void addCause_type(String _cause_type) {
		this._cause_type.add(_cause_type.toString());
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
	 * @return the effect
	 */
	public List<String> getEffect() {
		return this._effect;
	}
	/**
	 * @param effect the effect to add
	 */
	public void addEffect(String _effect) {
		this._effect.add(_effect.toString());
	}
	/**
	 * @return the effect_propagation_type
	 */
	public List<String> getEffect_propagation_type() {
		return this._effect_propagation_type;
	}
	/**
	 * @param effect_propagation_type the effect_propagation_type to add
	 */
	public void addEffect_propagation_type(String _effect_propagation_type) {
		this._effect_propagation_type.add(_effect_propagation_type.toString());
	}
	/**
	 * @return the field
	 */
	public List<String> getField() {
		return this._field;
	}
	/**
	 * @param field the field to add
	 */
	public void addField(String _field) {
		this._field.add(_field.toString());
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
	 * @return the functional_dimensionality_type
	 */
	public List<String> getFunctional_dimensionality_type() {
		return this._functional_dimensionality_type;
	}
	/**
	 * @param functional_dimensionality_type the functional_dimensionality_type to add
	 */
	public void addFunctional_dimensionality_type(String _functional_dimensionality_type) {
		this._functional_dimensionality_type.add(_functional_dimensionality_type.toString());
	}
	/**
	 * @return the indeterminacySource
	 */
	public List<String> getIndeterminacySource() {
		return this._indeterminacySource;
	}
	/**
	 * @param indeterminacySource the indeterminacySource to add
	 */
	public void addIndeterminacySource(String _indeterminacySource) {
		this._indeterminacySource.add(_indeterminacySource.toString());
	}
	/**
	 * @return the kind
	 */
	public List<String> getKind() {
		return this._kind;
	}
	/**
	 * @param kind the kind to add
	 */
	public void addKind(String _kind) {
		this._kind.add(_kind.toString());
	}
	/**
	 * @return the lifeTime
	 */
	public List<String> getLifeTime() {
		return this._lifeTime;
	}
	/**
	 * @param lifeTime the lifeTime to add
	 */
	public void addLifeTime(String _lifeTime) {
		this._lifeTime.add(_lifeTime.toString());
	}
	/**
	 * @return the locality
	 */
	public List<String> getLocality() {
		return this._locality;
	}
	/**
	 * @param locality the locality to add
	 */
	public void addLocality(String _locality) {
		this._locality.add(_locality.toString());
	}
	/**
	 * @return the locality_type
	 */
	public List<String> getLocality_type() {
		return this._locality_type;
	}
	/**
	 * @param locality_type the locality_type to add
	 */
	public void addLocality_type(String _locality_type) {
		this._locality_type.add(_locality_type.toString());
	}
	/**
	 * @return the non_functional_dimensionality_type
	 */
	public List<String> getNon_functional_dimensionality_type() {
		return this._non_functional_dimensionality_type;
	}
	/**
	 * @param non_functional_dimensionality_type the non_functional_dimensionality_type to add
	 */
	public void addNon_functional_dimensionality_type(String _non_functional_dimensionality_type) {
		this._non_functional_dimensionality_type.add(_non_functional_dimensionality_type.toString());
	}
	/**
	 * @return the observation_time_type
	 */
	public List<String> getObservation_time_type() {
		return this._observation_time_type;
	}
	/**
	 * @param observation_time_type the observation_time_type to add
	 */
	public void addObservation_time_type(String _observation_time_type) {
		this._observation_time_type.add(_observation_time_type.toString());
	}
	/**
	 * @return the pattern
	 */
	public List<String> getPattern() {
		return this._pattern;
	}
	/**
	 * @param pattern the pattern to add
	 */
	public void addPattern(String _pattern) {
		this._pattern.add(_pattern.toString());
	}
	/**
	 * @return the referredCause
	 */
	public List<String> getReferredCause() {
		return this._referredCause;
	}
	/**
	 * @param referredCause the referredCause to add
	 */
	public void addReferredCause(String _referredCause) {
		this._referredCause.add(_referredCause.toString());
	}
	/**
	 * @return the referredEffect
	 */
	public List<String> getReferredEffect() {
		return this._referredEffect;
	}
	/**
	 * @param referredEffect the referredEffect to add
	 */
	public void addReferredEffect(String _referredEffect) {
		this._referredEffect.add(_referredEffect.toString());
	}
	/**
	 * @return the referredIndeterminacySource
	 */
	public List<String> getReferredIndeterminacySource() {
		return this._referredIndeterminacySource;
	}
	/**
	 * @param referredIndeterminacySource the referredIndeterminacySource to add
	 */
	public void addReferredIndeterminacySource(String _referredIndeterminacySource) {
		this._referredIndeterminacySource.add(_referredIndeterminacySource.toString());
	}
	/**
	 * @return the referredLifeTime
	 */
	public List<String> getReferredLifeTime() {
		return this._referredLifeTime;
	}
	/**
	 * @param referredLifeTime the referredLifeTime to add
	 */
	public void addReferredLifeTime(String _referredLifeTime) {
		this._referredLifeTime.add(_referredLifeTime.toString());
	}
	/**
	 * @return the referredPattern
	 */
	public List<String> getReferredPattern() {
		return this._referredPattern;
	}
	/**
	 * @param referredPattern the referredPattern to add
	 */
	public void addReferredPattern(String _referredPattern) {
		this._referredPattern.add(_referredPattern.toString());
	}
	/**
	 * @return the risk
	 */
	public List<String> getRisk() {
		return this._risk;
	}
	/**
	 * @param risk the risk to add
	 */
	public void addRisk(String _risk) {
		this._risk.add(_risk.toString());
	}
	/**
	 * @return the riskInDT
	 */
	public List<String> getRiskInDT() {
		return this._riskInDT;
	}
	/**
	 * @param riskInDT the riskInDT to add
	 */
	public void addRiskInDT(String _riskInDT) {
		this._riskInDT.add(_riskInDT.toString());
	}
	/**
	 * @return the riskInDTViaClass
	 */
	public List<String> getRiskInDTViaClass() {
		return this._riskInDTViaClass;
	}
	/**
	 * @param riskInDTViaClass the riskInDTViaClass to add
	 */
	public void addRiskInDTViaClass(String _riskInDTViaClass) {
		this._riskInDTViaClass.add(_riskInDTViaClass.toString());
	}
	/**
	 * @return the riskLevel
	 */
	public List<String> getRiskLevel() {
		return this._riskLevel;
	}
	/**
	 * @param riskLevel the riskLevel to add
	 */
	public void addRiskLevel(String _riskLevel) {
		this._riskLevel.add(_riskLevel.toString());
	}
	/**
	 * @return the temporal_manifestation_type
	 */
	public List<String> getTemporal_manifestation_type() {
		return this._temporal_manifestation_type;
	}
	/**
	 * @param temporal_manifestation_type the temporal_manifestation_type to add
	 */
	public void addTemporal_manifestation_type(String _temporal_manifestation_type) {
		this._temporal_manifestation_type.add(_temporal_manifestation_type.toString());
	}
	/**
	 * @return the uncertaintyMeasurement
	 */
	public List<String> getUncertaintyMeasurement() {
		return this._uncertaintyMeasurement;
	}
	/**
	 * @param uncertaintyMeasurement the uncertaintyMeasurement to add
	 */
	public void addUncertaintyMeasurement(String _uncertaintyMeasurement) {
		this._uncertaintyMeasurement.add(_uncertaintyMeasurement.toString());
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