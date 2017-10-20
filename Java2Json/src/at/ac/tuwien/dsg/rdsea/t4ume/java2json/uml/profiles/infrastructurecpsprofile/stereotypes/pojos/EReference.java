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
This POJO Java class is automatically generated from the EReference stereotype
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

public class EReference {



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
	Variable for the attribute isResolveProxies.
	*/
	@SerializedName("isResolveProxies")
	private List<String> _isResolveProxies = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isTransient.
	*/
	@SerializedName("isTransient")
	private List<String> _isTransient = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isUnsettable.
	*/
	@SerializedName("isUnsettable")
	private List<String> _isUnsettable = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isVolatile.
	*/
	@SerializedName("isVolatile")
	private List<String> _isVolatile = new ArrayList<String>();
	

		
	/*
	Variable for the attribute keys.
	*/
	@SerializedName("keys")
	private List<String> _keys = new ArrayList<String>();
	

		
	/*
	Variable for the attribute referenceName.
	*/
	@SerializedName("referenceName")
	private List<String> _referenceName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute visibility.
	*/
	@SerializedName("visibility")
	private List<String> _visibility = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlFeatureKind.
	*/
	@SerializedName("xmlFeatureKind")
	private List<String> _xmlFeatureKind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlName.
	*/
	@SerializedName("xmlName")
	private List<String> _xmlName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlNamespace.
	*/
	@SerializedName("xmlNamespace")
	private List<String> _xmlNamespace = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("EReference");

	public EReference() {
		/*
		Variable for the attribute annotations.
		*/
		this._annotations = new ArrayList<String>();
		/*
		Variable for the attribute isResolveProxies.
		*/
		this._isResolveProxies = new ArrayList<String>();
		/*
		Variable for the attribute isTransient.
		*/
		this._isTransient = new ArrayList<String>();
		/*
		Variable for the attribute isUnsettable.
		*/
		this._isUnsettable = new ArrayList<String>();
		/*
		Variable for the attribute isVolatile.
		*/
		this._isVolatile = new ArrayList<String>();
		/*
		Variable for the attribute keys.
		*/
		this._keys = new ArrayList<String>();
		/*
		Variable for the attribute referenceName.
		*/
		this._referenceName = new ArrayList<String>();
		/*
		Variable for the attribute visibility.
		*/
		this._visibility = new ArrayList<String>();
		/*
		Variable for the attribute xmlFeatureKind.
		*/
		this._xmlFeatureKind = new ArrayList<String>();
		/*
		Variable for the attribute xmlName.
		*/
		this._xmlName = new ArrayList<String>();
		/*
		Variable for the attribute xmlNamespace.
		*/
		this._xmlNamespace = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the EReference POJO class
		
		EReference _stereo = new EReference();
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
	 * @return the isResolveProxies
	 */
	public List<String> getIsResolveProxies() {
		return this._isResolveProxies;
	}
	/**
	 * @param isResolveProxies the isResolveProxies to add
	 */
	public void addIsResolveProxies(String _isResolveProxies) {
		this._isResolveProxies.add(_isResolveProxies.toString());
	}
	/**
	 * @return the isTransient
	 */
	public List<String> getIsTransient() {
		return this._isTransient;
	}
	/**
	 * @param isTransient the isTransient to add
	 */
	public void addIsTransient(String _isTransient) {
		this._isTransient.add(_isTransient.toString());
	}
	/**
	 * @return the isUnsettable
	 */
	public List<String> getIsUnsettable() {
		return this._isUnsettable;
	}
	/**
	 * @param isUnsettable the isUnsettable to add
	 */
	public void addIsUnsettable(String _isUnsettable) {
		this._isUnsettable.add(_isUnsettable.toString());
	}
	/**
	 * @return the isVolatile
	 */
	public List<String> getIsVolatile() {
		return this._isVolatile;
	}
	/**
	 * @param isVolatile the isVolatile to add
	 */
	public void addIsVolatile(String _isVolatile) {
		this._isVolatile.add(_isVolatile.toString());
	}
	/**
	 * @return the keys
	 */
	public List<String> getKeys() {
		return this._keys;
	}
	/**
	 * @param keys the keys to add
	 */
	public void addKeys(String _keys) {
		this._keys.add(_keys.toString());
	}
	/**
	 * @return the referenceName
	 */
	public List<String> getReferenceName() {
		return this._referenceName;
	}
	/**
	 * @param referenceName the referenceName to add
	 */
	public void addReferenceName(String _referenceName) {
		this._referenceName.add(_referenceName.toString());
	}
	/**
	 * @return the visibility
	 */
	public List<String> getVisibility() {
		return this._visibility;
	}
	/**
	 * @param visibility the visibility to add
	 */
	public void addVisibility(String _visibility) {
		this._visibility.add(_visibility.toString());
	}
	/**
	 * @return the xmlFeatureKind
	 */
	public List<String> getXmlFeatureKind() {
		return this._xmlFeatureKind;
	}
	/**
	 * @param xmlFeatureKind the xmlFeatureKind to add
	 */
	public void addXmlFeatureKind(String _xmlFeatureKind) {
		this._xmlFeatureKind.add(_xmlFeatureKind.toString());
	}
	/**
	 * @return the xmlName
	 */
	public List<String> getXmlName() {
		return this._xmlName;
	}
	/**
	 * @param xmlName the xmlName to add
	 */
	public void addXmlName(String _xmlName) {
		this._xmlName.add(_xmlName.toString());
	}
	/**
	 * @return the xmlNamespace
	 */
	public List<String> getXmlNamespace() {
		return this._xmlNamespace;
	}
	/**
	 * @param xmlNamespace the xmlNamespace to add
	 */
	public void addXmlNamespace(String _xmlNamespace) {
		this._xmlNamespace.add(_xmlNamespace.toString());
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