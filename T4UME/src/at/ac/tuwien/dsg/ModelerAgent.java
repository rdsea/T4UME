package at.ac.tuwien.dsg;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.apache.log4j.Level;
import org.apache.log4j.Logger; 
import org.apache.log4j.PropertyConfigurator;




public class ModelerAgent {
	
	static final Logger logger2 = Logger.getLogger(ModelerAgent.class);
	static final Logger logger = Logger.getRootLogger();
	
	public static boolean DEBUG = true;	
	//public static String UML_LIBRARY_PATH="jar:file:/Users/Luca/Desktop/Eclipses/eclipse-modeling-mars-2-win32-x86_64/eclipse/plugins/org.eclipse.uml2.uml.resources_5.1.0.v20160201-0816.jar!/";
	//C:\Users\Luca\Desktop\Eclipses\eclipse-modeling-mars-2-win32-x86_64\eclipse\plugins\org.eclipse.uml2.uml.resources_5.1.0.v20160201-0816.jar
	private static ResourceSet RESOURCE_SET;
    static {
        // Create a resource-set to contain the resource(s) that we load and
        // save
        RESOURCE_SET = new ResourceSetImpl();
/*        
        String current_dir= System.getProperty("user.dir");
		URI infrastructureCPSProfile_uri = URI.createFileURI(current_dir + "/resources/profiles/InfrastructureCPSProfile.profile.uml");
	    URI infrastructureUncertaintyProfile_uri = URI.createFileURI(current_dir + "/resources/profiles/InfrastructureUncertaintyProfile.profile.uml");

	    Profile infrastructureCPSProfile = (Profile) load(infrastructureCPSProfile_uri);
	    Profile infrastructureUncertaintyProfile = (Profile) load(infrastructureUncertaintyProfile_uri);
	    RESOURCE_SET.createResource(infrastructureCPSProfile_uri);
	    RESOURCE_SET.createResource(infrastructureUncertaintyProfile_uri);
	    
*/
        // Initialize registrations of resource factories, library models,
        // profiles, Ecore metadata, and other dependencies required for
        // serializing and working with UML resources. This is only necessary in
        // applications that are not hosted in the Eclipse platform run-time, in
        // which case these registrations are discovered automatically from
        // Eclipse extension points.
        UMLResourcesUtil.init(RESOURCE_SET);
    }
    
	private static void main(String[] args) {
	}

	public static Package createGoogleCloudServiceLibrary(Package owner_pkg){
		
	    ArrayList<org.eclipse.uml2.uml.Class> google_services_class = new ArrayList<org.eclipse.uml2.uml.Class>();   
	    ArrayList<org.eclipse.uml2.uml.InstanceSpecification> google_services_instancespecification = new ArrayList<org.eclipse.uml2.uml.InstanceSpecification>();   
	    
	    ArrayList<String> google_services = new ArrayList<String>();   
	    google_services.add("Google App Engine");
	    google_services.add("Google BigQuery Service");
	    google_services.add("Google Cloud Bigtable");
	    google_services.add("Google Cloud CDN");
	    google_services.add("Google Cloud Dataflow");
	    google_services.add("Google Cloud Datalab");
	    google_services.add("Google Cloud Dataproc");
	    google_services.add("Google Cloud Datastore");
	    google_services.add("Google Cloud Endpoints");
	    google_services.add("Google Cloud Functions");
	    google_services.add("Google Cloud Functions for Firebase");
	    google_services.add("Google Cloud Key Management Service");
	    google_services.add("Cloud Machine Learning Engine");
	    google_services.add("Google Cloud Pub/Sub");
	    google_services.add("Cloud Spanner");
	    google_services.add("Google Cloud SQL");
	    google_services.add("Google Cloud Storage");
	    google_services.add("Google Cloud Storage for Firebase");
	    google_services.add("Google Cloud Test Lab");
	    google_services.add("Google Compute Engine");
	    google_services.add("Google Container Engine");
	    google_services.add("Google Container Registry");
	    google_services.add("Google Data Loss Prevention API");
	    google_services.add("Google Stackdriver");
	    google_services.add("Google Cloud Translation API");
	    google_services.add("Google Cloud Platform Machine Learning Services Group"); //abstract with subservices
	    google_services.add("Google Genomics");
	    google_services.add("Google Cloud Console App");
	    google_services.add("Google Cloud Deployment Manager");
	    google_services.add("Google Cloud Identity-Aware Proxy");
	    google_services.add("Google Cloud Resource Manager API");
	    google_services.add("Google Cloud Security Scanner");
	    google_services.add("Google Cloud DNS");
	    google_services.add("VPN");
	    google_services.add("Cloud Storage Transfer Service");
	    google_services.add("Transfer Appliance");
	    google_services.add("Firebase Authentication");
	    google_services.add("Firebase Test Lab for Android");

	    Class machine_learning_services_group = null;
	    ArrayList<String> google_machine_learning_services = new ArrayList<String>();   
	    google_machine_learning_services.add("Google Cloud Vision API");
	    google_machine_learning_services.add("Google Cloud Natural Language API");
	    google_machine_learning_services.add("Google Cloud Speech API");
	    google_machine_learning_services.add("Google Prediction API");
	    google_machine_learning_services.add("Google Cloud Video Intelligence API");

	    
	    for (Iterator iterator = google_services.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			org.eclipse.uml2.uml.Class google_service = createClass(owner_pkg, name.replaceAll("\\s+",""), false);
			org.eclipse.uml2.uml.InstanceSpecification google_service_instance = createInstanceSpecification(owner_pkg, google_service, name.replaceAll("\\s+","_").toLowerCase());
			google_services_class.add(google_service);
			google_services_instancespecification.add(google_service_instance);
			
			if (name == "Google Cloud Platform Machine Learning Services Group") machine_learning_services_group = google_service;
			createMinimalStateMachine(google_service);
		}
	    
	    for (Iterator iterator = google_machine_learning_services.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			org.eclipse.uml2.uml.Class google_service = createClass(owner_pkg, name.replaceAll("\\s+",""), false);
			org.eclipse.uml2.uml.InstanceSpecification google_service_instance = createInstanceSpecification(owner_pkg, google_service, name.replaceAll("\\s+","_").toLowerCase());
			google_services_class.add(google_service);
			google_services_instancespecification.add(google_service_instance);

			if(machine_learning_services_group != null) createGeneralization(google_service, machine_learning_services_group);
			createMinimalStateMachine(google_service);
		}

	    
	    return owner_pkg;
		
	}
		
	public static StateMachine createMinimalStateMachine(org.eclipse.uml2.uml.Class behavioredClassifier){
	    org.eclipse.uml2.uml.StateMachine statemachine = createStateMachine(behavioredClassifier, behavioredClassifier.getName().concat("_statemachine"));
	    org.eclipse.uml2.uml.Region region = createRegion(statemachine, statemachine.getName().concat("_region"));
	    Pseudostate init = createInitialState(statemachine, "Init");
	    FinalState end = createFinalState(statemachine, "End");
	    State sm = createState(region, "Ready");
	    Transition init_sm = createTransition(statemachine, init, sm, init.getName().concat("_").concat(sm.getName()));
	    Transition sm_end = createTransition(statemachine, sm, end, sm.getName().concat("_").concat(end.getName()));

	    return statemachine;
	}
	
	public static StateMachine createStateMachine(org.eclipse.uml2.uml.Class behavioredClassifier){
	    org.eclipse.uml2.uml.StateMachine statemachine = createStateMachine(behavioredClassifier, behavioredClassifier.getName().concat("_statemachine"));
        
	    out("StateMachine '%s' created.", statemachine.getQualifiedName());
	    return statemachine;
	}	
	public static void applyUTestProfiles(org.eclipse.uml2.uml.Package pkg){
	    
		String current_dir= System.getProperty("user.dir");
	       
		URI infrastructureCPSProfile_uri = URI.createFileURI(current_dir + "/resources/profiles/InfrastructureCPSProfile.profile.uml");
	    URI infrastructureUncertaintyProfile_uri = URI.createFileURI(current_dir + "/resources/profiles/InfrastructureUncertaintyProfile.profile.uml");	    

	    Profile infrastructureCPSProfile = (Profile) load(infrastructureCPSProfile_uri);
	    Profile infrastructureUncertaintyProfile = (Profile) load(infrastructureUncertaintyProfile_uri);
	    applyProfile(pkg, infrastructureCPSProfile);
	    applyProfile(pkg, infrastructureUncertaintyProfile);
	}

	public static void out(String format, Object... args) {
        if (DEBUG) {
        	String formattedString = String.format(format, args);
        	logger.debug(formattedString);
            if (!format.endsWith("%n")) {
            }
        }    
    }

    public static void err(String format, Object... args) {
        //System.err.printf(format, args);
    	String formattedString = String.format(format, args);
    	logger.error(formattedString);
        if (!format.endsWith("%n")) {
        }
    }
    
    public static Model createModel(String name) {
        Model model = UMLFactory.eINSTANCE.createModel();
        model.setName(name);

        out("Model '%s' created.", model.getQualifiedName());

        return model;
    }      
    
    public static Package createPackage(Package nestingPackage, String name) {
        org.eclipse.uml2.uml.Package package_ = nestingPackage.createNestedPackage(name);

        out("Package '%s' created.", package_.getQualifiedName());

        return package_;
    }
    
    public static PrimitiveType createPrimitiveType(org.eclipse.uml2.uml.Package package_, String name) {
        PrimitiveType primitiveType = package_.createOwnedPrimitiveType(name);

        out("Primitive type '%s' created.", primitiveType.getQualifiedName());

        return primitiveType;
    }
    
    public static Enumeration createEnumeration(org.eclipse.uml2.uml.Package package_, String name) {
        Enumeration enumeration = package_.createOwnedEnumeration(name);

        out("Enumeration '%s' created.", enumeration.getQualifiedName());

        return enumeration;
    }
    
    public static EnumerationLiteral createEnumerationLiteral(Enumeration enumeration, String name) {
        EnumerationLiteral enumerationLiteral = enumeration.createOwnedLiteral(name);

        out("Enumeration literal '%s' created.", enumerationLiteral.getQualifiedName());

        return enumerationLiteral;
    }
    
    public static org.eclipse.uml2.uml.Class createClass(org.eclipse.uml2.uml.Package package_, String name, boolean isAbstract) {
        org.eclipse.uml2.uml.Class class_ = package_.createOwnedClass(name, isAbstract);

        out("Class '%s' created.", class_.getQualifiedName());

        return class_;
    }
    
    public static Generalization createGeneralization(Classifier specificClassifier, Classifier generalClassifier) {
        Generalization generalization = specificClassifier.createGeneralization(generalClassifier);

        out("Generalization %s --|> %s created.", specificClassifier.getQualifiedName(), generalClassifier.getQualifiedName());

        return generalization;
    }
    
    public static org.eclipse.uml2.uml.StateMachine createStateMachine(org.eclipse.uml2.uml.BehavioredClassifier behavioredClassifier, String name) {
        org.eclipse.uml2.uml.StateMachine stateMachine = UMLFactory.eINSTANCE.createStateMachine();
        stateMachine.setName(name);
        behavioredClassifier.getOwnedBehaviors().add(stateMachine);
        out("StateMachine '%s' created.", stateMachine.getQualifiedName());

        return stateMachine;
    }

    public static org.eclipse.uml2.uml.Region createRegion(org.eclipse.uml2.uml.StateMachine stateMachine, String name) {
        org.eclipse.uml2.uml.Region region = stateMachine.createRegion(name);
        out("Region '%s' created.", region.getQualifiedName());

        return region;
    }
    
    public static org.eclipse.uml2.uml.State createState(org.eclipse.uml2.uml.StateMachine sm, String name) {
        org.eclipse.uml2.uml.State state = UMLFactory.eINSTANCE.createState();
        state.setName(name);
        sm.getRegions().get(0).getSubvertices().add(state);
        
        out("State '%s' created.", state.getQualifiedName());

        return state;
    } 

	public static State createState(Region region, String name) {
        org.eclipse.uml2.uml.State state = UMLFactory.eINSTANCE.createState();
        state.setName(name);
        region.getSubvertices().add(state);

        out("State '%s' created.", state.getQualifiedName());

        return state;
	}    
    
	public static void addStateInvariant(org.eclipse.uml2.uml.State state, String invariant) {
		
		LiteralString inv_string=UMLFactory.eINSTANCE.createLiteralString();
		inv_string.setValue(invariant);
		Constraint inv_constraint=UMLFactory.eINSTANCE.createConstraint();
		inv_constraint.setSpecification(inv_string);
		state.setStateInvariant(inv_constraint);
        out("State '%s' has now invariant '$s'", state.getQualifiedName(), state.getStateInvariant().getSpecification());
	}    

    public static org.eclipse.uml2.uml.Pseudostate createInitialState(org.eclipse.uml2.uml.StateMachine sm, String name) {
        org.eclipse.uml2.uml.Pseudostate state = UMLFactory.eINSTANCE.createPseudostate();
        state.setName(name);
        state.setKind(PseudostateKind.INITIAL_LITERAL);
        sm.getRegions().get(0).getSubvertices().add(state);
        out("PseudoState kind: INITIAL '$s' created.", state.getQualifiedName());
        return state;
    }  

    public static FinalState createFinalState(StateMachine sm, String name) {
        org.eclipse.uml2.uml.FinalState state = UMLFactory.eINSTANCE.createFinalState();
        state.setName(name);
        sm.getRegions().get(0).getSubvertices().add(state);
        out("PseudoState kind: INITIAL '$s' created.", state.getQualifiedName());
        return state;
		
	}

    
    
    public static org.eclipse.uml2.uml.Transition createTransition(org.eclipse.uml2.uml.StateMachine sm, org.eclipse.uml2.uml.Vertex source, org.eclipse.uml2.uml.Vertex target, String name) {
        org.eclipse.uml2.uml.Transition transition = UMLFactory.eINSTANCE.createTransition();
        transition.setName(name);
        transition.setSource(source);
        transition.setTarget(target);
        sm.getRegions().get(0).getTransitions().add(transition);
        out("Transition '$s' from '$s' to '$s' created.", transition.getQualifiedName(), source.getQualifiedName(), target.getQualifiedName());

        return transition;
    }    
    public static Property createAttribute(org.eclipse.uml2.uml.Class class_, String name, Type type, int lowerBound, int upperBound) {
        Property attribute = class_.createOwnedAttribute(name, type, lowerBound, upperBound);

        out("Attribute '%s' : %s [%s..%s] created.", //
            attribute.getQualifiedName(), // attribute name
            type.getQualifiedName(), // type name
            lowerBound, // no special case for multiplicity lower bound
            (upperBound == LiteralUnlimitedNatural.UNLIMITED)
                ? "*" // special case for unlimited bound
                : upperBound);

        return attribute;
    }

    public static Property createAttribute(org.eclipse.uml2.uml.Class class_, String name, Type type, int lowerBound, int upperBound, Object defaultValue) {
        Property attribute = class_.createOwnedAttribute(name, type, lowerBound, upperBound);

        if (defaultValue instanceof Boolean) {
            LiteralBoolean literal = (LiteralBoolean) attribute.createDefaultValue(null, null, UMLPackage.Literals.LITERAL_BOOLEAN);
            literal.setValue(((Boolean) defaultValue).booleanValue());
        } else if (defaultValue instanceof String) {
            if (type instanceof Enumeration) {
                InstanceValue value = (InstanceValue) attribute.createDefaultValue(null, null, UMLPackage.Literals.INSTANCE_VALUE);
                value.setInstance(((Enumeration) type).getOwnedLiteral((String) defaultValue));
            } else {
                LiteralString literal = (LiteralString) attribute.createDefaultValue(null, null, UMLPackage.Literals.LITERAL_STRING);
                literal.setValue((String) defaultValue);
            }
        }

        out("Attribute '%s' : %s [%s..%s]%s created.", //
            attribute.getQualifiedName(), // attribute name
            type.getQualifiedName(), // type name
            lowerBound, // no special case for multiplicity lower bound
            (upperBound == LiteralUnlimitedNatural.UNLIMITED)
                ? "*" // special case for unlimited bound
                : upperBound, // finite upper bound
            (defaultValue == null)
                ? "" // no default value (use type's intrinsic default)
                : String.format(" = %s", defaultValue));

        return attribute;
    }    
    public static Association createAssociation(Type type1, boolean end1IsNavigable, AggregationKind end1Aggregation, String end1Name, int end1LowerBound, int end1UpperBound,
            Type type2, boolean end2IsNavigable, AggregationKind end2Aggregation, String end2Name, int end2LowerBound, int end2UpperBound) {

        Association association = type1.createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1LowerBound, end1UpperBound,
            type2, end2IsNavigable, end2Aggregation, end2Name, end2LowerBound, end2UpperBound);

        out("Association %s [%s..%s] %s-%s %s [%s..%s] created.", //
            UML2Util.isEmpty(end1Name)
                // compute a placeholder for the name
                ? String.format("{%s}", type1.getQualifiedName()) //
                // user-specified name
                : String.format("'%s::%s'", type1.getQualifiedName(), end1Name), //
            end1LowerBound, // no special case for this
            (end1UpperBound == LiteralUnlimitedNatural.UNLIMITED)
                ? "*" // special case for unlimited upper bound
                : end1UpperBound, // finite upper bound
            end2IsNavigable
                ? "<" // indicate navigability
                : "-", // not navigable
            end1IsNavigable
                ? ">" // indicate navigability
                : "-", // not navigable
            UML2Util.isEmpty(end2Name)
                // compute a placeholder for the name
                ? String.format("{%s}", type2.getQualifiedName()) //
                // user-specified name
                : String.format("'%s::%s'", type2.getQualifiedName(), end2Name), //
            end2LowerBound, // no special case for this
            (end2UpperBound == LiteralUnlimitedNatural.UNLIMITED)
                ? "*" // special case for unlimited upper bound
                : end2UpperBound);

        return association;
    }    
    
    public static void save(org.eclipse.uml2.uml.Package package_, URI uri) {
        // Create a resource-set to contain the resource(s) that we are saving
    	RESOURCE_SET = new ResourceSetImpl();

        // Initialize registrations of resource factories, library models,
        // profiles, Ecore metadata, and other dependencies required for
        // serializing and working with UML resources. This is only necessary in
        // applications that are not hosted in the Eclipse platform run-time, in
        // which case these registrations are discovered automatically from
        // Eclipse extension points.
        UMLResourcesUtil.init(RESOURCE_SET);

        // Create the output resource and add our model package to it.
        Resource resource = RESOURCE_SET.createResource(uri);
        resource.getContents().add(package_);

        // And save
        try {
            resource.save(null); // no save options needed
            out("Done.");
        } catch (IOException ioe) {
            err(ioe.getMessage());
        }
    }
    
//*****************************************************
    
	
    public static org.eclipse.uml2.uml.InstanceSpecification createInstanceSpecification(org.eclipse.uml2.uml.Package package_, org.eclipse.uml2.uml.Class class_, String name) {
        
    	org.eclipse.uml2.uml.InstanceSpecification instanceSpecification = UMLFactory.eINSTANCE.createInstanceSpecification();
    	
    	instanceSpecification.getClassifiers().add(class_);
    	package_.getPackagedElements().add(instanceSpecification);
    	instanceSpecification.setName(name);
    	
        return instanceSpecification;
    }	
    
    public static org.eclipse.uml2.uml.InstanceSpecification createInstanceSpecificationLink(String name, org.eclipse.uml2.uml.Package package_, org.eclipse.uml2.uml.Association association, String memberEnd1, org.eclipse.uml2.uml.InstanceSpecification obj1, String memberEnd2, org.eclipse.uml2.uml.InstanceSpecification obj2) {
        
    	org.eclipse.uml2.uml.InstanceSpecification link = UMLFactory.eINSTANCE.createInstanceSpecification();
    	
    	link.getClassifiers().add(association);
    	package_.getPackagedElements().add(link);
    	link.setName(name);
    	
    	EAnnotation end1=link.createEAnnotation("memberEnd_"+memberEnd1);
    	end1.getReferences().add(obj1);
    	EAnnotation end2=link.createEAnnotation("memberEnd_"+memberEnd2);
    	end2.getReferences().add(obj2);

        return link;
    }
	
    public static org.eclipse.uml2.uml.Interaction createInteraction(org.eclipse.uml2.uml.Package package_, String name) {
        
    	org.eclipse.uml2.uml.Interaction interaction = UMLFactory.eINSTANCE.createInteraction();
    	
    	package_.getPackagedElements().add(interaction);
    	interaction.setName(name);


        return interaction;
    }	
    
    public static org.eclipse.uml2.uml.Activity createActivity(org.eclipse.uml2.uml.Package package_, String name) {
        
    	org.eclipse.uml2.uml.Activity activity = UMLFactory.eINSTANCE.createActivity();
    	
    	package_.getPackagedElements().add(activity);
    	activity.setName(name);


        return activity;
    } 
    
    public static org.eclipse.uml2.uml.FinalNode createFinalNode(org.eclipse.uml2.uml.Activity activity, String name){
    	
    	org.eclipse.uml2.uml.FinalNode node=UMLFactory.eINSTANCE.createActivityFinalNode();
    	node.setName(name);
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	return node;    	
    }
    
    public static org.eclipse.uml2.uml.InitialNode createInitialNode(org.eclipse.uml2.uml.Activity activity, String name){
    	
    	org.eclipse.uml2.uml.InitialNode node=UMLFactory.eINSTANCE.createInitialNode();
    	node.setName(name);
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	return node;    	
    }    
    
    public static org.eclipse.uml2.uml.CallBehaviorAction createIODNode(org.eclipse.uml2.uml.Activity activity, org.eclipse.uml2.uml.Interaction sd){
    	 
    	org.eclipse.uml2.uml.CallBehaviorAction node=UMLFactory.eINSTANCE.createCallBehaviorAction();
    	node.setName("SD: " + sd.getName());
    	node.setActivity(activity);
    	activity.getNodes().add(node);
    	node.setBehavior(sd);
    	return node;
    }
    
    public static org.eclipse.uml2.uml.ControlFlow createControlFlow(org.eclipse.uml2.uml.Activity activity, org.eclipse.uml2.uml.ActivityNode n1, org.eclipse.uml2.uml.ActivityNode n2){
    	
    	org.eclipse.uml2.uml.ControlFlow c=UMLFactory.eINSTANCE.createControlFlow();
    	c.setActivity(activity);
    	activity.getEdges().add(c);
    	c.setSource(n1);
    	c.setTarget(n2);
    	return c;
    	
    }
    
    public static org.eclipse.uml2.uml.Message createMessage(org.eclipse.uml2.uml.Interaction interaction, org.eclipse.uml2.uml.Lifeline l1, org.eclipse.uml2.uml.Lifeline l2, org.eclipse.uml2.uml.Operation operation, String name){
    	
    	org.eclipse.uml2.uml.Message message=UMLFactory.eINSTANCE.createMessage();
    	
    	message.setSignature(operation);
    	message.setInteraction(interaction);
    	message.setName(name);
    	
    	org.eclipse.uml2.uml.MessageOccurrenceSpecification sendEvent=createMessageOccurrenceSpecification(l1,message);
    	org.eclipse.uml2.uml.MessageOccurrenceSpecification receiveEvent=createMessageOccurrenceSpecification(l2,message);
    	message.setSendEvent(sendEvent);
    	message.setReceiveEvent(receiveEvent);
    	
    	return message;
    }
    
    public static org.eclipse.uml2.uml.MessageOccurrenceSpecification createMessageOccurrenceSpecification(org.eclipse.uml2.uml.Lifeline lifeline, org.eclipse.uml2.uml.Message message) {
        
    	org.eclipse.uml2.uml.MessageOccurrenceSpecification moc = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
    	
    	moc.setMessage(message);
    	moc.getCovereds().add(lifeline);
    	moc.setEnclosingInteraction(lifeline.getInteraction());


        return moc;
    }	
	
    public static org.eclipse.uml2.uml.Operation createOperation(org.eclipse.uml2.uml.Class class_, String name) {
        org.eclipse.uml2.uml.Operation operation = class_.createOwnedOperation(name, null, null); 
        return operation;
    }	
    
    public static org.eclipse.uml2.uml.Operation createOperation(org.eclipse.uml2.uml.Class class_, String name, EList<String> parametersName, EList<Type> parametersType) {
        org.eclipse.uml2.uml.Operation operation = class_.createOwnedOperation(name, parametersName, parametersType); 
        return operation;
    }	
    
    public static org.eclipse.uml2.uml.PrimitiveType createPrimitiveType(Model m, String name){
		PrimitiveType mytype=UMLFactory.eINSTANCE.createPrimitiveType();
		mytype.setName(name);
		m.getPackagedElements().add(mytype);
		return mytype;
    }
    
    public static org.eclipse.uml2.uml.Property createAttribute(Class klass, String name, PrimitiveType type, boolean isStatic) {
		org.eclipse.uml2.uml.Property attribute=createAttribute(klass, name, type);
		attribute.setIsStatic(isStatic);
		return attribute;
	}		
    
	public static org.eclipse.uml2.uml.Property createAttribute(Class klass, String name, PrimitiveType type) {
		org.eclipse.uml2.uml.Property attribute = klass.createOwnedAttribute(name, type);
        return attribute;
	}			
	
   
    public static org.eclipse.uml2.uml.Signal createSignal(org.eclipse.uml2.uml.Package package_, String name) {
        org.eclipse.uml2.uml.Signal signal = UMLFactory.eINSTANCE.createSignal();
        package_.getPackagedElements().add(signal);
        signal.setName(name);
        return signal;
    }
    
    public static org.eclipse.uml2.uml.Constraint createConstraint(org.eclipse.uml2.uml.Package package_, String name, String expression) {
		LiteralString exp=UMLFactory.eINSTANCE.createLiteralString();
		exp.setValue(expression);
		Constraint property=UMLFactory.eINSTANCE.createConstraint();
		property.setSpecification(exp);
        package_.createOwnedRule(name);
        package_.getOwnedRule(name).setSpecification(exp);
        return property;
    }
    
    public static org.eclipse.uml2.uml.Slot createIntegerSlot(InstanceSpecification object, Property attribute, int value){
    	Slot slot=object.createSlot();
 		slot.setDefiningFeature(attribute);
		LiteralInteger proc_1_attr_active_value=(LiteralInteger) slot.createValue(attribute.getName(), attribute.getType(), UMLPackage.Literals.LITERAL_INTEGER);
		proc_1_attr_active_value.setValue(value);
		return slot;
    }
    
    public static org.eclipse.uml2.uml.Association createAssociation(String name, org.eclipse.uml2.uml.Type type1, boolean end1IsNavigable, AggregationKind end1Aggregation,
        String end1Name, int end1LowerBound, int end1UpperBound,
        org.eclipse.uml2.uml.Type type2, boolean end2IsNavigable, AggregationKind end2Aggregation,
        String end2Name, int end2LowerBound, int end2UpperBound) {

    	org.eclipse.uml2.uml.Association association = type1.createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1LowerBound, end1UpperBound,
                type2, end2IsNavigable, end2Aggregation, end2Name, end2LowerBound, end2UpperBound);//old

    	StringBuffer sb = new StringBuffer();

        sb.append("Association ");

        if (null == end1Name || 0 == end1Name.length()) {
            sb.append('{');
            sb.append(type1.getQualifiedName());
            sb.append('}');
        } else {
            sb.append("'");
            sb.append(type1.getQualifiedName());
            sb.append(NamedElement.SEPARATOR);
            sb.append(end1Name);
            sb.append("'");
        }

        sb.append(" [");
        sb.append(end1LowerBound);
        sb.append("..");
        sb.append(LiteralUnlimitedNatural.UNLIMITED == end1UpperBound ? "*" : String.valueOf(end1UpperBound));
        sb.append("] ");

        sb.append(end2IsNavigable ? '<' : '-');
        sb.append('-');
        sb.append(end1IsNavigable ? '>' : '-');
        sb.append(' ');

        if (null == end2Name || 0 == end2Name.length()) {
            sb.append('{');
            sb.append(type2.getQualifiedName());
            sb.append('}');
        } else {
            sb.append("'");
            sb.append(type2.getQualifiedName());
            sb.append(NamedElement.SEPARATOR);
            sb.append(end2Name);
            sb.append("'");
        }

        sb.append(" [");
        sb.append(end2LowerBound);
        sb.append("..");
        sb.append(LiteralUnlimitedNatural.UNLIMITED == end2UpperBound ? "*" : String.valueOf(end2UpperBound));
        sb.append("]");

        sb.append(" created.");
        
        association.setName(name);

        return association;
    }
    
    public static org.eclipse.uml2.uml.StateMachine createStateMachine(org.eclipse.uml2.uml.Class klass, String name) {
        org.eclipse.uml2.uml.StateMachine sm = UMLFactory.eINSTANCE.createStateMachine();
        sm.setName(name);
        klass.getOwnedBehaviors().add(sm);
        return sm;
    }    
    

  
    
    public static org.eclipse.uml2.uml.Region createRegion(org.eclipse.uml2.uml.StateMachine sm) {
        org.eclipse.uml2.uml.Region region = UMLFactory.eINSTANCE.createRegion();
        sm.getRegions().add(region);
        region.setName(sm.getQualifiedName() + "main region");
        return region;
    }    
      
	
	public static org.eclipse.uml2.uml.Comment createSDTimeConstraint(org.eclipse.uml2.uml.Profile madesProfile, org.eclipse.uml2.uml.Interaction sd, String expression){
		
		org.eclipse.uml2.uml.Comment comment = sd.createOwnedComment();
		comment.setBody(expression);
		
		org.eclipse.uml2.uml.Stereotype timeConstraintStereotype=getMADESTimeStereotype(madesProfile, "TimeConstraint");
		comment.applyStereotype(timeConstraintStereotype);
		
		return comment;
	}		



	public static Stereotype getMADESTimeStereotype(Profile madesProfile, String stereotypeName) {
		org.eclipse.uml2.uml.Stereotype timeStereotype=null;
		
		for(org.eclipse.uml2.uml.Element e: madesProfile.getOwnedElements()){
			if(e instanceof org.eclipse.uml2.uml.Package && ((org.eclipse.uml2.uml.Package)e).getName().equals("Time")){
				org.eclipse.uml2.uml.Package verificationTags= (org.eclipse.uml2.uml.Package)e;
				for(org.eclipse.uml2.uml.Stereotype s: verificationTags.getOwnedStereotypes()){
					
					if(s.getName().equals(stereotypeName)){
						timeStereotype= s;
					}
				}
			}
		}
		return timeStereotype;
	}

	public static Stereotype getInfrastructureLevelUncertaintyStereotype(Profile infrastructureUncertaintyProfile, String stereotypeName) {
		org.eclipse.uml2.uml.Stereotype timeStereotype=null;
		
		for(org.eclipse.uml2.uml.Element e: infrastructureUncertaintyProfile.getOwnedElements()){
			if(e instanceof org.eclipse.uml2.uml.Package && ((org.eclipse.uml2.uml.Package)e).getName().equals("InfrastructureLevelUncertainty")){
				org.eclipse.uml2.uml.Package verificationTags= (org.eclipse.uml2.uml.Package)e;
				for(org.eclipse.uml2.uml.Stereotype s: verificationTags.getOwnedStereotypes()){
					
					if(s.getName().equals(stereotypeName)){
						timeStereotype= s;
					}
				}
			}
		}
		return timeStereotype;
	}
	
	public static Stereotype getMADESVerificationTagsStereotype(Profile madesProfile, String stereotypeName){
		org.eclipse.uml2.uml.Stereotype systemStereotype=null;
		
		for(org.eclipse.uml2.uml.Element e: madesProfile.getOwnedElements()){
			if(e instanceof org.eclipse.uml2.uml.Package && ((org.eclipse.uml2.uml.Package)e).getName().equals("VerificationTags")){
				org.eclipse.uml2.uml.Package verificationTags= (org.eclipse.uml2.uml.Package)e;
				for(org.eclipse.uml2.uml.Stereotype s: verificationTags.getOwnedStereotypes()){
					
					if(s.getName().equals(stereotypeName)){
						systemStereotype= s;
					}
				}
			}
		}
		return systemStereotype;
	}
	
	public static Stereotype getMADESPropertiesStereotype(Profile madesProfile, String stereotypeName){
		org.eclipse.uml2.uml.Stereotype systemStereotype=null;
		
		for(org.eclipse.uml2.uml.Element e: madesProfile.getOwnedElements()){
			if(e instanceof org.eclipse.uml2.uml.Package && (((org.eclipse.uml2.uml.Package)e).getName().equals("Properties"))){
				org.eclipse.uml2.uml.Package verificationTags= (org.eclipse.uml2.uml.Package)e;
				for(org.eclipse.uml2.uml.Stereotype s: verificationTags.getOwnedStereotypes()){
					
					if(s.getName().equals(stereotypeName)){
						systemStereotype= s;
					}
				}
			}
		}
		return systemStereotype;
	}
	

    public static org.eclipse.uml2.uml.Package load(URI uri) {
        org.eclipse.uml2.uml.Package package_ = null;

        try {
            // Load the requested resource
            Resource resource = RESOURCE_SET.getResource(uri, true);

            // Get the first (should be only) package from it
            package_ = (org.eclipse.uml2.uml.Package) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE);
        } catch (WrappedException we) {
            err(we.getMessage());
            System.exit(1);
        }

        return package_;
    }	
	
	public static Profile loadProfile(URI uri){
		//A collection of related persistent documents.
		//ResourceSet set = new ResourceSetImpl();
		
		//Register the UML Package
		RESOURCE_SET.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		RESOURCE_SET.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		
		//libraries
		//Add the model file to the resource set
		RESOURCE_SET.createResource(uri);
		Resource r = RESOURCE_SET.getResource(uri, true);
		
		Profile m=(Profile)EcoreUtil.getObjectByType(r.getContents(), UMLPackage.eINSTANCE.getProfile());//Main
		return m;
	}	

	
    public static Profile createProfile(String name, String nsURI) {
        Profile profile = UMLFactory.eINSTANCE.createProfile();
        profile.setName(name);
        profile.setURI(nsURI);

        out("Profile '%s' created.", profile.getQualifiedName());

        return profile;
    }
    
    public static Stereotype createStereotype(Profile profile, String name, boolean isAbstract) {
        Stereotype stereotype = profile.createOwnedStereotype(name, isAbstract);

        out("Stereotype '%s' created.", stereotype.getQualifiedName());

        return stereotype;
    }
    
    public static PrimitiveType importPrimitiveType(org.eclipse.uml2.uml.Package package_, String name) {
        org.eclipse.uml2.uml.Package umlLibrary = (org.eclipse.uml2.uml.Package) load(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));

        PrimitiveType primitiveType = (PrimitiveType) umlLibrary.getOwnedType(name);

        package_.createElementImport(primitiveType);

        out("Primitive type '%s' imported.", primitiveType.getQualifiedName());

        return primitiveType;
    }
    
  
    public static org.eclipse.uml2.uml.Class referenceMetaclass(Profile profile, String name) {
        Model umlMetamodel = (Model) load(URI.createURI(UMLResource.UML_METAMODEL_URI));

        org.eclipse.uml2.uml.Class metaclass = (org.eclipse.uml2.uml.Class) umlMetamodel.getOwnedType(name);

        profile.createMetaclassReference(metaclass);

        out("Metaclass '%s' referenced.", metaclass.getQualifiedName());

        return metaclass;
    }

    public static Extension createExtension(org.eclipse.uml2.uml.Class metaclass, Stereotype stereotype, boolean required) {
        Extension extension = stereotype.createExtension(metaclass, required);

        out("%sxtension '%s' created.", //
            required
                ? "Required e" // it's a required extension
                : "E", // an optional extension
            extension.getQualifiedName());

        return extension;
    }
    
    public static void defineProfile(Profile profile) {
        profile.define();

        out("Profile '%s' defined.", profile.getQualifiedName());
    }
    
    public static void applyProfile(org.eclipse.uml2.uml.Package package_, Profile profile) {
        package_.applyProfile(profile);

        out("Profile '%s' applied to package '%s'.", profile.getQualifiedName(), package_.getQualifiedName());
    }
    
    public static void applyStereotype(NamedElement namedElement, Stereotype stereotype) {
        namedElement.applyStereotype(stereotype);

        out("Stereotype '%s' applied to element '%s'.", stereotype.getQualifiedName(), namedElement.getQualifiedName());
    }
    
    public static Object getStereotypePropertyValue(NamedElement namedElement, Stereotype stereotype, Property property) {
        Object value = namedElement.getValue(stereotype, property.getName());

        out("Value of stereotype property '%s' on element '%s' is %s.", property.getQualifiedName(), namedElement.getQualifiedName(), value);

        return value;
    }
    
    /*
     *     Values of primitive types are represented by the usual Java types: 
     *     String, Boolean, Integer, etc. For values of enumerations, 
     *     the UML2 API accepts and returns the EnumerationLiteral instances 
     *     from the profile model. 
     *     For convenience, this utility method allows enumeration values 
     *     to be set using simply the name of the literal.    
     */
    public static void setStereotypePropertyValue(NamedElement namedElement, Stereotype stereotype, Property property, Object value) {
        Object valueToSet = value;
        
        logger.debug(property.getType());
        if ((value instanceof String) && (property.getType() instanceof Enumeration)) {
            // Get the corresponding enumeration literal
            valueToSet = ((Enumeration) property.getType()).getOwnedLiteral((String) value);
            logger.debug("(value instanceof String) && (property.getType() instanceof Enumeration)");
            logger.debug(valueToSet.toString());
        }
        else{
        	logger.debug("NOT (value instanceof String) && (property.getType() instanceof Enumeration)");
        }
        
        
        namedElement.setValue(stereotype, property.getName(), valueToSet);

        out("Value of stereotype property '%s' on element '%s' set to %s.", property.getQualifiedName(),
                namedElement.getQualifiedName(), value);
    }
    
}
