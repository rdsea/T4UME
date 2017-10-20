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
This POJO Java class is automatically generated from the Measurement stereotype
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

public class Measurement {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute evidence.
	*/
	@SerializedName("evidence")
	private List<String> _evidence = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measure.
	*/
	@SerializedName("measure")
	private List<String> _measure = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measureInDT.
	*/
	@SerializedName("measureInDT")
	private List<String> _measureInDT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measureInDTViaClass.
	*/
	@SerializedName("measureInDTViaClass")
	private List<String> _measureInDTViaClass = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measurement.
	*/
	@SerializedName("measurement")
	private List<String> _measurement = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measurementInVS.
	*/
	@SerializedName("measurementInVS")
	private List<String> _measurementInVS = new ArrayList<String>();
	

		
	/*
	Variable for the attribute referredEvidence.
	*/
	@SerializedName("referredEvidence")
	private List<String> _referredEvidence = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("Measurement");

	public Measurement() {
		/*
		Variable for the attribute evidence.
		*/
		this._evidence = new ArrayList<String>();
		/*
		Variable for the attribute measure.
		*/
		this._measure = new ArrayList<String>();
		/*
		Variable for the attribute measureInDT.
		*/
		this._measureInDT = new ArrayList<String>();
		/*
		Variable for the attribute measureInDTViaClass.
		*/
		this._measureInDTViaClass = new ArrayList<String>();
		/*
		Variable for the attribute measurement.
		*/
		this._measurement = new ArrayList<String>();
		/*
		Variable for the attribute measurementInVS.
		*/
		this._measurementInVS = new ArrayList<String>();
		/*
		Variable for the attribute referredEvidence.
		*/
		this._referredEvidence = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the Measurement POJO class
		
		Measurement _stereo = new Measurement();
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
	 * @return the evidence
	 */
	public List<String> getEvidence() {
		return this._evidence;
	}
	/**
	 * @param evidence the evidence to add
	 */
	public void addEvidence(String _evidence) {
		this._evidence.add(_evidence.toString());
	}
	/**
	 * @return the measure
	 */
	public List<String> getMeasure() {
		return this._measure;
	}
	/**
	 * @param measure the measure to add
	 */
	public void addMeasure(String _measure) {
		this._measure.add(_measure.toString());
	}
	/**
	 * @return the measureInDT
	 */
	public List<String> getMeasureInDT() {
		return this._measureInDT;
	}
	/**
	 * @param measureInDT the measureInDT to add
	 */
	public void addMeasureInDT(String _measureInDT) {
		this._measureInDT.add(_measureInDT.toString());
	}
	/**
	 * @return the measureInDTViaClass
	 */
	public List<String> getMeasureInDTViaClass() {
		return this._measureInDTViaClass;
	}
	/**
	 * @param measureInDTViaClass the measureInDTViaClass to add
	 */
	public void addMeasureInDTViaClass(String _measureInDTViaClass) {
		this._measureInDTViaClass.add(_measureInDTViaClass.toString());
	}
	/**
	 * @return the measurement
	 */
	public List<String> getMeasurement() {
		return this._measurement;
	}
	/**
	 * @param measurement the measurement to add
	 */
	public void addMeasurement(String _measurement) {
		this._measurement.add(_measurement.toString());
	}
	/**
	 * @return the measurementInVS
	 */
	public List<String> getMeasurementInVS() {
		return this._measurementInVS;
	}
	/**
	 * @param measurementInVS the measurementInVS to add
	 */
	public void addMeasurementInVS(String _measurementInVS) {
		this._measurementInVS.add(_measurementInVS.toString());
	}
	/**
	 * @return the referredEvidence
	 */
	public List<String> getReferredEvidence() {
		return this._referredEvidence;
	}
	/**
	 * @param referredEvidence the referredEvidence to add
	 */
	public void addReferredEvidence(String _referredEvidence) {
		this._referredEvidence.add(_referredEvidence.toString());
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