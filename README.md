# T4UME
## Introduction
Tool for Uncertainty Modeling and Evaluation (T4UME) is a tool for modeling uncertainties of Iot Cloud Systems. 
It supports the Uncertainty Modeling and Evaluation (UME) methodology.
UME and T4UME are partially supported by the U-Test H2020 project http://www.u-test.eu/.

Further information can be found in the following presentations links:
-	https://www.researchgate.net/project/Testing-uncertainties-for-CPS-IoT
-	https://www.slideshare.net/berardinelli/uncertaintywise-engineering-of-iot-cloud-systems
-	https://www.slideshare.net/berardinelli/combining-modeldriven-engineering-and-elastic-execution-for-testing-uncertainty-in-cps

T4UME implements the following capabilities
-	U-Detection (coming soon).
-	U-Refactoring (coming soon).
-	T4UME Adaptation (coming soon).
-	UML2JSON.

## U-Detection 

## U-Refactoring

## T4UME Adaptation

## UML2JSON 
T4UME includes a two-step UML2JSON - JSON2Java transformation engine.
The design rationales of the UML2JSON Step are 
- full control on UML2JSON transformation rules
- generation of POJO Java classes to instantiate runtime objects with a simple structure to obtain an easy-to-read serialization in JSON.

UML2JSON generates a JAVA source code and APIs (UML2Java step) that import the Google GSON library. 
The resulting Java program can be executed and generates a JSON representation of the input UML Model in the IDE console.

In particular, UML2JSON transforms UML Classes and InstanceSpecifications into JSON. 
The tool ia designed to work with UML and to adapt to different domains brought by applied UML Profiles.
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
Luca Berardinelli 
luca.berardinelli@tuwien.ac.at
https://www.linkedin.com/in/lucaberardinelli/

Hong-Linh Truong
truong@tuwien.ac.at
