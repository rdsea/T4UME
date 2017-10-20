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
This POJO Java class is automatically generated from the EDataType stereotype
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

public class EDataType {



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
	Variable for the attribute dataTypeName.
	*/
	@SerializedName("dataTypeName")
	private List<String> _dataTypeName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute instanceClassName.
	*/
	@SerializedName("instanceClassName")
	private List<String> _instanceClassName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlName.
	*/
	@SerializedName("xmlName")
	private List<String> _xmlName = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("EDataType");

	public EDataType() {
		/*
		Variable for the attribute annotations.
		*/
		this._annotations = new ArrayList<String>();
		/*
		Variable for the attribute dataTypeName.
		*/
		this._dataTypeName = new ArrayList<String>();
		/*
		Variable for the attribute instanceClassName.
		*/
		this._instanceClassName = new ArrayList<String>();
		/*
		Variable for the attribute xmlName.
		*/
		this._xmlName = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the EDataType POJO class
		
		EDataType _stereo = new EDataType();
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
	 * @return the dataTypeName
	 */
	public List<String> getDataTypeName() {
		return this._dataTypeName;
	}
	/**
	 * @param dataTypeName the dataTypeName to add
	 */
	public void addDataTypeName(String _dataTypeName) {
		this._dataTypeName.add(_dataTypeName.toString());
	}
	/**
	 * @return the instanceClassName
	 */
	public List<String> getInstanceClassName() {
		return this._instanceClassName;
	}
	/**
	 * @param instanceClassName the instanceClassName to add
	 */
	public void addInstanceClassName(String _instanceClassName) {
		this._instanceClassName.add(_instanceClassName.toString());
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