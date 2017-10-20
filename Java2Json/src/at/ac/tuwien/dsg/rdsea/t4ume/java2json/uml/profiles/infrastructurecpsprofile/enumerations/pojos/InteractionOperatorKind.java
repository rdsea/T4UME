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

package at.ac.tuwien.dsg.rdsea.t4ume.java2json.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the InteractionOperatorKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@609ae51a (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class InteractionOperatorKind {

	/*
	Static Variable for the literal seq.
	*/ 
	public String _seq = new String("seq");
	
	/*
	Static Variable for the literal alt.
	*/ 
	public String _alt = new String("alt");
	
	/*
	Static Variable for the literal opt.
	*/ 
	public String _opt = new String("opt");
	
	/*
	Static Variable for the literal break.
	*/ 
	public String _break = new String("break");
	
	/*
	Static Variable for the literal par.
	*/ 
	public String _par = new String("par");
	
	/*
	Static Variable for the literal strict.
	*/ 
	public String _strict = new String("strict");
	
	/*
	Static Variable for the literal loop.
	*/ 
	public String _loop = new String("loop");
	
	/*
	Static Variable for the literal critical.
	*/ 
	public String _critical = new String("critical");
	
	/*
	Static Variable for the literal neg.
	*/ 
	public String _neg = new String("neg");
	
	/*
	Static Variable for the literal assert.
	*/ 
	public String _assert = new String("assert");
	
	/*
	Static Variable for the literal ignore.
	*/ 
	public String _ignore = new String("ignore");
	
	/*
	Static Variable for the literal consider.
	*/ 
	public String _consider = new String("consider");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("InteractionOperatorKind");

	public InteractionOperatorKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the InteractionOperatorKind POJO class
		
		InteractionOperatorKind enumeration = new InteractionOperatorKind();
		enumeration.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String elem = gson.toJson(this);
        
        System.out.println("elem = " + elem);    
        
        return elem;   
	}

	/**
	 * @return the _seq
	 */
	public String getSeq() {
		return _seq;
	}
	/**
	 * @return the _alt
	 */
	public String getAlt() {
		return _alt;
	}
	/**
	 * @return the _opt
	 */
	public String getOpt() {
		return _opt;
	}
	/**
	 * @return the _break
	 */
	public String getBreak() {
		return _break;
	}
	/**
	 * @return the _par
	 */
	public String getPar() {
		return _par;
	}
	/**
	 * @return the _strict
	 */
	public String getStrict() {
		return _strict;
	}
	/**
	 * @return the _loop
	 */
	public String getLoop() {
		return _loop;
	}
	/**
	 * @return the _critical
	 */
	public String getCritical() {
		return _critical;
	}
	/**
	 * @return the _neg
	 */
	public String getNeg() {
		return _neg;
	}
	/**
	 * @return the _assert
	 */
	public String getAssert() {
		return _assert;
	}
	/**
	 * @return the _ignore
	 */
	public String getIgnore() {
		return _ignore;
	}
	/**
	 * @return the _consider
	 */
	public String getConsider() {
		return _consider;
	}
}