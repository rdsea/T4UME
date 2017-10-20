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
This POJO Java class is automatically generated from the EPackage stereotype
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

public class EPackage {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("instanceof") 
	private String _instanceof = new String("Undefined");
	
	

		
	/*
	Variable for the attribute annotations.
	*/
	@SerializedName("annotations")
	private List<String> _annotations = new ArrayList<String>();
	

		
	/*
	Variable for the attribute basePackage.
	*/
	@SerializedName("basePackage")
	private List<String> _basePackage = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nsPrefix.
	*/
	@SerializedName("nsPrefix")
	private List<String> _nsPrefix = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nsURI.
	*/
	@SerializedName("nsURI")
	private List<String> _nsURI = new ArrayList<String>();
	

		
	/*
	Variable for the attribute packageName.
	*/
	@SerializedName("packageName")
	private List<String> _packageName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute prefix.
	*/
	@SerializedName("prefix")
	private List<String> _prefix = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("EPackage");

	public EPackage() {
		/*
		Variable for the attribute annotations.
		*/
		this._annotations = new ArrayList<String>();
		/*
		Variable for the attribute basePackage.
		*/
		this._basePackage = new ArrayList<String>();
		/*
		Variable for the attribute nsPrefix.
		*/
		this._nsPrefix = new ArrayList<String>();
		/*
		Variable for the attribute nsURI.
		*/
		this._nsURI = new ArrayList<String>();
		/*
		Variable for the attribute packageName.
		*/
		this._packageName = new ArrayList<String>();
		/*
		Variable for the attribute prefix.
		*/
		this._prefix = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the EPackage POJO class
		
		EPackage _stereo = new EPackage();
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
	 * @return the annotations
	 */
	public List<String> getAnnotations() {
		return this._annotations;
	}
	/**
	 * @param annotations the annotations to add
	 */
	public void addAnnotations(String _annotations) {
		this._annotations.add(_annotations.toString());
	}
	/**
	 * @return the basePackage
	 */
	public List<String> getBasePackage() {
		return this._basePackage;
	}
	/**
	 * @param basePackage the basePackage to add
	 */
	public void addBasePackage(String _basePackage) {
		this._basePackage.add(_basePackage.toString());
	}
	/**
	 * @return the nsPrefix
	 */
	public List<String> getNsPrefix() {
		return this._nsPrefix;
	}
	/**
	 * @param nsPrefix the nsPrefix to add
	 */
	public void addNsPrefix(String _nsPrefix) {
		this._nsPrefix.add(_nsPrefix.toString());
	}
	/**
	 * @return the nsURI
	 */
	public List<String> getNsURI() {
		return this._nsURI;
	}
	/**
	 * @param nsURI the nsURI to add
	 */
	public void addNsURI(String _nsURI) {
		this._nsURI.add(_nsURI.toString());
	}
	/**
	 * @return the packageName
	 */
	public List<String> getPackageName() {
		return this._packageName;
	}
	/**
	 * @param packageName the packageName to add
	 */
	public void addPackageName(String _packageName) {
		this._packageName.add(_packageName.toString());
	}
	/**
	 * @return the prefix
	 */
	public List<String> getPrefix() {
		return this._prefix;
	}
	/**
	 * @param prefix the prefix to add
	 */
	public void addPrefix(String _prefix) {
		this._prefix.add(_prefix.toString());
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