# T4UME
## Introduction
IoT Cloud CPS are CPS implemented on top of two technological pillars, i.e., Internet of Things and Cloud computing.

By uncertainty we mean here the lack of certainty (i.e., knowledge) about the timing and nature of inputs, 
the state of a system, a future outcome, as well as other relevant factors.

Uncertainty Modeling and Evaluation (UME) is a domain-independent, model-driven methodology that aims at detecting uncertainty caused by missing information on system models. UME aims at contributing to the Uncertainty Modeling (UM) standardization activity (http://www.omgwiki.org/uncertainty/doku.php?id=Home) supported by the Object Management Group (OMG) focussing on models created with the Unified Modeling Language (UML) standard (http://www.omg.org/spec/UML/About-UML/).

Tool for UME (T4UME) is the companion supporting tool implemented on top of state of the art MDE technologies (Eclipse EMF, Eclipse EPSILON). 

## UME/T4UME for U-Test H2020 Project

UME/T4UME can be tailored to detect and evaluate uncertainties UML Model tailored to different domains via UML Profiles.
UME/T4UME have been conceived and implemented in the context of the H2020 project U-Test (http://www.u-test.eu/), that aims at supporting Model-Based Testing under Uncertainty of cyber-physical systems (CPS) implemented on top of two technological pillars like Internet of Things (IoT) and Cloud computing.

Therefore, a specific version of UME/T4UME is currently under development for the following goal:
Model-Based Testing under Uncertainty of IoT and Cloud infrastructure of CPSs.

For this purpose, as part of the H2020 U-Test project, we devised the following profiles to represent the domain of interest:
- Infrastructure Uncertainty UML Profile
- Infrastructure CPS Profile

Initial description of these profiles and suggested modeling guidelines can be found on the U-Test Public Deliverables (https://www.simula.no/file/d12pdf/download).


In U-Test, UME aims at detecting uncertainty at design-time, caused by "missing information" in terms of missing values for properties of applied stereotypes as defined in the Infrastructure CPS Profile.

Figure 1 gives a bird-eye view of UME/T4UME as customized for U-Test: 

![N|Solid](https://github.com/rdsea/T4UME/blob/master/documents/images/UME.png)
Figure 1: the UME methodology.

UME for U-Test consists of the following activities, which are suitably implemented in T4UME:
-	U-Detection: Validation of UML Model representing an IoT Cloud CPS. The Infrastructure CPS profile is applied to model IoT and Cloud elements. Uncertainty Detection Rules (UDR) detect potential uncertainties caused by missing information (i.e., undefined property values) on stereotype applications.
-	U-Refactoring: Refactoring of UML Model performed by UDRs, based on a detected uncertainty. In U-Test, refactoring actions are domain-specific and implemented ad hoc to evolve the UML Model and make it ready for uncertainty-wise test case generation. 
-	UML2JSON: model to text transformation that serialize part of the UML model (.uml) in JSON (.json) to reuse the model content for further engineering activities (e.g., IoT and cloud infrastructure provisioning and deployment).

The most important activity is:
-	T4UME Adaptation: Higher-order transformation that automatically adapts UME/T4UME to different domains. It generates UDRs based for any applied UML Profile, which determine the domain of interest.


Further information can be found in the following presentations links:
-	https://www.researchgate.net/project/Testing-uncertainties-for-CPS-IoT
-	https://www.slideshare.net/berardinelli/uncertaintywise-engineering-of-iot-cloud-systems
-	https://www.slideshare.net/berardinelli/combining-modeldriven-engineering-and-elastic-execution-for-testing-uncertainty-in-cps


# Additional Technical Information.

The following sections provide a detailed explanation of the model-driven design rationales of T4UME.
Further details are available in READMEs stored in the folders of this git repository.

T4UME is implemented in Eclipse EPSILON (https://www.eclipse.org/epsilon/). It can be integrated with UML editors that are built on top of Eclipse Modeling Framework (EMF, https://www.eclipse.org/modeling/emf/) like Papyrus (https://www.eclipse.org/papyrus/) and Rational Software Architect (RSA, http://www-03.ibm.com/software/products/it/ratsadesigner).

T4UME is a tool for model-driven engineering built following model-driven engineering principles.
In particular, Figure 2 shows a recurrent design pattern for model-driven engineering tasks.
U-Detection, U-Refactoring, and T4UME Adaptation are implemented by instantiating this design pattern on top of EPSILON.


<img src="https://github.com/rdsea/T4UME/blob/master/documents/images/pattern.png" style="width: 800px;"/>
</br>
Figure 2: Generic pattern for model-driven engineering task.
</br>


## U-Detection and U-Refactoring
U-Detection detects potential uncertainties within the UML model representing the IoT Cloud CPS under study.
U-Refactoring modifies the UML model representing the IoT Cloud CPS under study depending on the detected uncertainties.
This step is meant to be customized for different model-driven engineering processes. 
For example, we customized the U-Refactoring to be used in U-Test. Therefore, the refactoring actions create new UML StateMachines from which test cases can be generated by ad-hoc model to text transformations.

Figure 3 shows a Papyrus screenshot where potential uncertainties are represented by missing information in the properties of applied stereotypes. Figure 4 shows a Papyrus screenshot of the generated model elements after the execution of the refactoring action.

<img src="https://github.com/rdsea/T4UME/blob/master/documents/images/udetection.png" style="width: 800px;"/>
</br>
Figure 3: U-Detection example.
</br>

<img src="https://github.com/rdsea/T4UME/blob/master/documents/images/urefactoring.png" style="width: 800px;"/>
</br>
Figure 4: U-Refactoring example.
</br>

Figure 5 shows the detailed design of the U-Detection and U-Refactoring steps combined as instantiation of the generic design pattern in Figure 2.

<img src="https://github.com/rdsea/T4UME/blob/master/documents/images/pattern_udetection_urefactoring.png" style="width: 800px;"/>
</br>
Figure 5: Design of U-Detection and U-Refactoring steps.
</br>

## T4UME Adaptation
It is an higher-order transformation that automatically adapts T4UME to new domains, i.e., to detect new sources of potential uncertainties caused by changes in applied UML profiles. New executable detection and refactoring routines are generated as UDRs in case of updates in the definition of the applied UML profiles.

Figure 6 shows the detailed design of the T4UME Adaptation step as instantiation of the generic design pattern in Figure 2.

<img src="https://github.com/rdsea/T4UME/blob/master/documents/images/pattern_adaptation.png" style="width: 800px;"/>
</br>
Figure 6: Design of T4UME Adapdation step.
</br>

## UML2JSON 
T4UME includes a two-step UML2JSON - JSON2Java transformation engine.
UML2JSON is designed to work with UML and to adapt to different domains brought by UML Profiles applied to the source UML Model.

The design rationales of the UML2JSON Step are 
- full control on UML2JSON transformation rules.
- generation of POJO Java classes to instantiate runtime objects with a simple structure to obtain an easy-to-read serialization in JSON.

Figure 7 shows the detailed design of the UML2JSON step as instantiation of the generic design pattern in Figure 2.

<img src="https://github.com/rdsea/T4UME/blob/master/documents/images/pattern_uml2json.png" style="width: 800px;"/>
</br>
Figure 7: Design of UML2JSON.
</br>

UML2JSON generates a JAVA source code and APIs (UML2Java step) that make use of the Google GSON library. 
The resulting Java program can be executed and generates a JSON representation of the input UML Model in the IDE console.

In particular, UML2JSON transforms UML Classes and InstanceSpecifications into JSON Object. Properties of stereotypes applied on Classes and InstanceSpecifications(i.e., the domain specific information) are transformed in properties of the corresponding JSON Object.


Indeed, UML2JSON is capable to read stereotypes applied to Classes and InstanceSpecifications model elements so that domain-specific information introduced via applied UML Profiles are also extracted. 

This work is partially funded by the H2020 Project U-Test http://www.u-test.eu/.
U-Test aims at enabling Model-Based Testing (MBT) of IoT Cloud Cyber-Physical Systems under uncertainty.

We are currently developing and adopting T4UME to satisfy the needs of U-Test. 

Further details:

**Intended Purpose of T4UME in UTest**
Generate JSON representation of an input UML Model that representa an IoT Cloud Cyber-Physical System.

*Input (manual)*
-	UML Model serialized in Eclipse UML (.uml)
-	UML Profile(s). Currently, we are testing T4UME with the following profiles: UML IoT Cloud Profile, Infrastructure Uncertainty Profile Cloud/IoT. See http://www.u-test.eu/ for further details.

*Intermediate Output (generated)*
-	Java Program 
-	Profile-Driven Java API to access UML representation of IoT Cloud resources (i.e., annotated UML Classes and UML InstanceSpecification model elements).
-	Google GSON, a Java serialization/deserialization library to convert Java Objects into JSON and back.
-	Java Main Program that instantiates Java Objects corresponding to UML Classes and UML InstanceSpecifications, invokes GSON, and generate JSON output

*Output (generated)*
-	JSON representation of IoT Cloud resource types (from UML Classes) and instances (from UML InstanceSpecification). Thanks to **Google GSON Library**, the runtime objects are correctly serialized in JSON.

Alternative existing solution is EMF2JSON (https://github.com/emfjson/emfjson-jackson), which serializes any kind of EMF-based Java Objects. However, it generates a more complex JSON structure without explicit customization capabilities.

## Contact
 The work is supported by H2020 U-test Project. License of the work is described in the license file. Contact Hong-Linh Truong hong-linh.truong@tuwien.ac.at for further information about U-Test in TU Wien and for further inquiry for using the code in commercial and education purpose. 

For technical work, contact:

Luca Berardinelli 
luca.berardinelli@tuwien.ac.at
https://www.linkedin.com/in/lucaberardinelli/
http://www.infosys.tuwien.ac.at/staff/lberardinelli


Hong-Linh Truong
linh.truong@aalto.fi
https://users.aalto.fi/~truongh4/
