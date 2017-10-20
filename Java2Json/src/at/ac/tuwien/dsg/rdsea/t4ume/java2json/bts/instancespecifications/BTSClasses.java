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

package at.ac.tuwien.dsg.rdsea.t4ume.java2json.bts.instancespecifications;

import at.ac.tuwien.dsg.rdsea.t4ume.java2json.uml.profiles.infrastructurecpsprofile.stereotypes.pojos.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;





public class  BTSClasses{

	//*************************************************
	// Global variables
	//*************************************************
	private boolean showEmpty = true;
	private List<Object> all_pojos = new ArrayList<Object>();
	private List<Object> all_virtual_sensors = new ArrayList<Object>();
	private List<Object> all_virtual_gateways = new ArrayList<Object>();
	private List<Object> all_virtual_actuators = new ArrayList<Object>();
	private List<Object> all_sensors = new ArrayList<Object>();
	private List<Object> all_actuators = new ArrayList<Object>();
	private List<Object> all_communications = new ArrayList<Object>();
	private List<Object> all_communication_configurations = new ArrayList<Object>();
	private List<Object> all_computing_configurations = new ArrayList<Object>();
	private List<Object> all_storage_configurations = new ArrayList<Object>();
	private List<Object> all_cloud_services = new ArrayList<Object>();

	private List<Object> all_pojos_je = new ArrayList<Object>();
	private List<Object> all_virtual_sensors_je = new ArrayList<Object>();
	private List<Object> all_virtual_gateways_je = new ArrayList<Object>();
	private List<Object> all_virtual_actuators_je = new ArrayList<Object>();
	private List<Object> all_sensors_je = new ArrayList<Object>();
	private List<Object> all_actuators_je = new ArrayList<Object>();
	private List<Object> all_communications_je = new ArrayList<Object>();
	private List<Object> all_communication_configurations_je = new ArrayList<Object>();
	private List<Object> all_computing_configurations_je = new ArrayList<Object>();
	private List<Object> all_storage_configurations_je = new ArrayList<Object>();
	private List<Object> all_cloud_services_je = new ArrayList<Object>();

	private List<Object> all_pojos_jo = new ArrayList<Object>();
	private List<Object> all_virtual_sensors_jo = new ArrayList<Object>();
	private List<Object> all_virtual_gateways_jo = new ArrayList<Object>();
	private List<Object> all_virtual_actuators_jo = new ArrayList<Object>();
	private List<Object> all_sensors_jo = new ArrayList<Object>();
	private List<Object> all_actuators_jo = new ArrayList<Object>();
	private List<Object> all_communications_jo = new ArrayList<Object>();
	private List<Object> all_communication_configurations_jo = new ArrayList<Object>();
	private List<Object> all_computing_configurations_jo = new ArrayList<Object>();
	private List<Object> all_storage_configurations_jo = new ArrayList<Object>();
	private List<Object> all_cloud_services_jo = new ArrayList<Object>();

	private List<Object> all_pojos_string = new ArrayList<Object>();
	private List<Object> all_virtual_sensors_string = new ArrayList<Object>();
	private List<Object> all_virtual_gateways_string = new ArrayList<Object>();
	private List<Object> all_virtual_actuators_string = new ArrayList<Object>();
	private List<Object> all_sensors_string = new ArrayList<Object>();
	private List<Object> all_actuators_string = new ArrayList<Object>();
	private List<Object> all_communications_string = new ArrayList<Object>();
	private List<Object> all_communication_configurations_string = new ArrayList<Object>();
	private List<Object> all_computing_configurations_string = new ArrayList<Object>();
	private List<Object> all_storage_configurations_string = new ArrayList<Object>();
	private List<Object> all_cloud_services_string = new ArrayList<Object>();
	
	public static void main(String[] args) {

	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    JsonParser jp = new JsonParser();
	    
		BTSClasses bTSClasses = new BTSClasses();

//*************************************************
//Cloud Services
//*************************************************
    



//*************************************************
//Virtual Sensors
//*************************************************




//*************************************************
//Virtual Sensor SwAirCSensor1
//*************************************************
		VirtualSensor virtual_sensor_SwAirCSensor1_1 = new VirtualSensor();
		bTSClasses.all_pojos.add(virtual_sensor_SwAirCSensor1_1);
		bTSClasses.all_virtual_sensors.add(virtual_sensor_SwAirCSensor1_1);


		virtual_sensor_SwAirCSensor1_1.addId("_uxRb0JiHEee1TIWgg3Q4Sw");
		virtual_sensor_SwAirCSensor1_1.setName("AirConditioningSensor");	
		virtual_sensor_SwAirCSensor1_1.addOwnedUnits("HwAirCSensor1");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement virtual_sensor_SwAirCSensor1_1_je = gson.toJsonTree(virtual_sensor_SwAirCSensor1_1);
	    bTSClasses.all_virtual_sensors_je.add(virtual_sensor_SwAirCSensor1_1_je);
	    
	    JsonObject virtual_sensor_SwAirCSensor1_1_jo = new JsonObject();
	    bTSClasses.all_virtual_sensors_jo.add(virtual_sensor_SwAirCSensor1_1_jo);
	    
	    virtual_sensor_SwAirCSensor1_1_jo.add("SwAirCSensor1", virtual_sensor_SwAirCSensor1_1_je);


//*************************************************
//Virtual Sensor SwElectrSensor1
//*************************************************
		VirtualSensor virtual_sensor_SwElectrSensor1_2 = new VirtualSensor();
		bTSClasses.all_pojos.add(virtual_sensor_SwElectrSensor1_2);
		bTSClasses.all_virtual_sensors.add(virtual_sensor_SwElectrSensor1_2);


		virtual_sensor_SwElectrSensor1_2.addId("_1bbmsJiHEee1TIWgg3Q4Sw");
		virtual_sensor_SwElectrSensor1_2.setName("ElectricitySensor");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement virtual_sensor_SwElectrSensor1_2_je = gson.toJsonTree(virtual_sensor_SwElectrSensor1_2);
	    bTSClasses.all_virtual_sensors_je.add(virtual_sensor_SwElectrSensor1_2_je);
	    
	    JsonObject virtual_sensor_SwElectrSensor1_2_jo = new JsonObject();
	    bTSClasses.all_virtual_sensors_jo.add(virtual_sensor_SwElectrSensor1_2_jo);
	    
	    virtual_sensor_SwElectrSensor1_2_jo.add("SwElectrSensor1", virtual_sensor_SwElectrSensor1_2_je);


//*************************************************
//Virtual Sensor SwTempSensor1
//*************************************************
		VirtualSensor virtual_sensor_SwTempSensor1_3 = new VirtualSensor();
		bTSClasses.all_pojos.add(virtual_sensor_SwTempSensor1_3);
		bTSClasses.all_virtual_sensors.add(virtual_sensor_SwTempSensor1_3);


		virtual_sensor_SwTempSensor1_3.addId("_3BQ8EJiHEee1TIWgg3Q4Sw");
		virtual_sensor_SwTempSensor1_3.setName("TemperatureSensor");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement virtual_sensor_SwTempSensor1_3_je = gson.toJsonTree(virtual_sensor_SwTempSensor1_3);
	    bTSClasses.all_virtual_sensors_je.add(virtual_sensor_SwTempSensor1_3_je);
	    
	    JsonObject virtual_sensor_SwTempSensor1_3_jo = new JsonObject();
	    bTSClasses.all_virtual_sensors_jo.add(virtual_sensor_SwTempSensor1_3_jo);
	    
	    virtual_sensor_SwTempSensor1_3_jo.add("SwTempSensor1", virtual_sensor_SwTempSensor1_3_je);



//*************************************************
//Virtual Gateways
//*************************************************




//*************************************************
//Virtual Gateway IoTGateway1
//*************************************************
		VirtualGateway virtual_gateway_IoTGateway1_1 = new VirtualGateway();
		bTSClasses.all_pojos.add(virtual_gateway_IoTGateway1_1);
		bTSClasses.all_virtual_gateways.add(virtual_gateway_IoTGateway1_1);


		virtual_gateway_IoTGateway1_1.addId("_KaBV8JiHEee1TIWgg3Q4Sw");
		virtual_gateway_IoTGateway1_1.setName("IoTGateway");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement virtual_gateway_IoTGateway1_1_je = gson.toJsonTree(virtual_gateway_IoTGateway1_1);
	    bTSClasses.all_virtual_gateways_je.add(virtual_gateway_IoTGateway1_1_je);
	    
	    JsonObject virtual_gateway_IoTGateway1_1_jo = new JsonObject();
	    bTSClasses.all_virtual_gateways_jo.add(virtual_gateway_IoTGateway1_1_jo);
	    
	    virtual_gateway_IoTGateway1_1_jo.add("IoTGateway1", virtual_gateway_IoTGateway1_1_je);



//*************************************************
//Sensor HwAirCSensor1
//*************************************************
		Sensor sensor_HwAirCSensor1_1 = new Sensor();
		bTSClasses.all_pojos.add(sensor_HwAirCSensor1_1);
		bTSClasses.all_sensors.add(sensor_HwAirCSensor1_1);

		sensor_HwAirCSensor1_1.addId("_JBx7MJiIEee1TIWgg3Q4Sw");
		sensor_HwAirCSensor1_1.setName("HwAirConditioningSensor");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement sensor_HwAirCSensor1_1_je = gson.toJsonTree(sensor_HwAirCSensor1_1);
	    bTSClasses.all_sensors_je.add(sensor_HwAirCSensor1_1_je);
	    
	    JsonObject sensor_HwAirCSensor1_1_jo = new JsonObject();
	    bTSClasses.all_sensors_jo.add(sensor_HwAirCSensor1_1_jo);
	    
	    sensor_HwAirCSensor1_1_jo.add("HwAirCSensor1", sensor_HwAirCSensor1_1_je);


//*************************************************
//Sensor HwElectrSensor1
//*************************************************
		Sensor sensor_HwElectrSensor1_2 = new Sensor();
		bTSClasses.all_pojos.add(sensor_HwElectrSensor1_2);
		bTSClasses.all_sensors.add(sensor_HwElectrSensor1_2);

		sensor_HwElectrSensor1_2.addId("_K4ch4JiIEee1TIWgg3Q4Sw");
		sensor_HwElectrSensor1_2.setName("HwElectricitySensor");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement sensor_HwElectrSensor1_2_je = gson.toJsonTree(sensor_HwElectrSensor1_2);
	    bTSClasses.all_sensors_je.add(sensor_HwElectrSensor1_2_je);
	    
	    JsonObject sensor_HwElectrSensor1_2_jo = new JsonObject();
	    bTSClasses.all_sensors_jo.add(sensor_HwElectrSensor1_2_jo);
	    
	    sensor_HwElectrSensor1_2_jo.add("HwElectrSensor1", sensor_HwElectrSensor1_2_je);


//*************************************************
//Sensor HwTempSensor1
//*************************************************
		Sensor sensor_HwTempSensor1_3 = new Sensor();
		bTSClasses.all_pojos.add(sensor_HwTempSensor1_3);
		bTSClasses.all_sensors.add(sensor_HwTempSensor1_3);

		sensor_HwTempSensor1_3.addId("_L4zysJiIEee1TIWgg3Q4Sw");
		sensor_HwTempSensor1_3.setName("HwTemperatureSensor");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement sensor_HwTempSensor1_3_je = gson.toJsonTree(sensor_HwTempSensor1_3);
	    bTSClasses.all_sensors_je.add(sensor_HwTempSensor1_3_je);
	    
	    JsonObject sensor_HwTempSensor1_3_jo = new JsonObject();
	    bTSClasses.all_sensors_jo.add(sensor_HwTempSensor1_3_jo);
	    
	    sensor_HwTempSensor1_3_jo.add("HwTempSensor1", sensor_HwTempSensor1_3_je);

    

//*************************************************
//Virtual Actuators
//*************************************************




//*************************************************
//Communications
//*************************************************




//*************************************************
//Communication BTSBrokerToIngestionClient1
//*************************************************
		Communication communication_BTSBrokerToIngestionClient1_1 = new Communication();
		bTSClasses.all_pojos.add(communication_BTSBrokerToIngestionClient1_1);
		bTSClasses.all_communications.add(communication_BTSBrokerToIngestionClient1_1);

		communication_BTSBrokerToIngestionClient1_1.addId("_3P7Q4JiMEee1TIWgg3Q4Sw");
		communication_BTSBrokerToIngestionClient1_1.setName("BTSBroker2IngestionClientComm");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_BTSBrokerToIngestionClient1_1_je = gson.toJsonTree(communication_BTSBrokerToIngestionClient1_1);
	    bTSClasses.all_communications_je.add(communication_BTSBrokerToIngestionClient1_1_je);
	    
	    JsonObject communication_BTSBrokerToIngestionClient1_1_jo = new JsonObject();
	    bTSClasses.all_communications_jo.add(communication_BTSBrokerToIngestionClient1_1_jo);
	    
	    communication_BTSBrokerToIngestionClient1_1_jo.add("BTSBrokerToIngestionClient1", communication_BTSBrokerToIngestionClient1_1_je);


//*************************************************
//Communication BTSBrokerToIngestionClient2
//*************************************************
		Communication communication_BTSBrokerToIngestionClient2_2 = new Communication();
		bTSClasses.all_pojos.add(communication_BTSBrokerToIngestionClient2_2);
		bTSClasses.all_communications.add(communication_BTSBrokerToIngestionClient2_2);

		communication_BTSBrokerToIngestionClient2_2.addId("_7pQBkJiMEee1TIWgg3Q4Sw");
		communication_BTSBrokerToIngestionClient2_2.setName("BTSBroker2IngestionClientComm");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_BTSBrokerToIngestionClient2_2_je = gson.toJsonTree(communication_BTSBrokerToIngestionClient2_2);
	    bTSClasses.all_communications_je.add(communication_BTSBrokerToIngestionClient2_2_je);
	    
	    JsonObject communication_BTSBrokerToIngestionClient2_2_jo = new JsonObject();
	    bTSClasses.all_communications_jo.add(communication_BTSBrokerToIngestionClient2_2_jo);
	    
	    communication_BTSBrokerToIngestionClient2_2_jo.add("BTSBrokerToIngestionClient2", communication_BTSBrokerToIngestionClient2_2_je);


//*************************************************
//Communication BTSIngestionClientToMonitoringDataServiceComm1
//*************************************************
		Communication communication_BTSIngestionClientToMonitoringDataServiceComm1_3 = new Communication();
		bTSClasses.all_pojos.add(communication_BTSIngestionClientToMonitoringDataServiceComm1_3);
		bTSClasses.all_communications.add(communication_BTSIngestionClientToMonitoringDataServiceComm1_3);

		communication_BTSIngestionClientToMonitoringDataServiceComm1_3.addId("_AcabUJidEee1TIWgg3Q4Sw");
		communication_BTSIngestionClientToMonitoringDataServiceComm1_3.setName("IngestionClient2BTSMonitoringDataServiceComm");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_BTSIngestionClientToMonitoringDataServiceComm1_3_je = gson.toJsonTree(communication_BTSIngestionClientToMonitoringDataServiceComm1_3);
	    bTSClasses.all_communications_je.add(communication_BTSIngestionClientToMonitoringDataServiceComm1_3_je);
	    
	    JsonObject communication_BTSIngestionClientToMonitoringDataServiceComm1_3_jo = new JsonObject();
	    bTSClasses.all_communications_jo.add(communication_BTSIngestionClientToMonitoringDataServiceComm1_3_jo);
	    
	    communication_BTSIngestionClientToMonitoringDataServiceComm1_3_jo.add("BTSIngestionClientToMonitoringDataServiceComm1", communication_BTSIngestionClientToMonitoringDataServiceComm1_3_je);


//*************************************************
//Communication CommIoTGateway1SwAirCSensor1
//*************************************************
		Communication communication_CommIoTGateway1SwAirCSensor1_4 = new Communication();
		bTSClasses.all_pojos.add(communication_CommIoTGateway1SwAirCSensor1_4);
		bTSClasses.all_communications.add(communication_CommIoTGateway1SwAirCSensor1_4);

		communication_CommIoTGateway1SwAirCSensor1_4.addId("_W07-gJiHEee1TIWgg3Q4Sw");
		communication_CommIoTGateway1SwAirCSensor1_4.setName("IoTGateway2SensorComm");	
		communication_CommIoTGateway1SwAirCSensor1_4.addCommunicationConfigs("MQTTConfigClient2");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_CommIoTGateway1SwAirCSensor1_4_je = gson.toJsonTree(communication_CommIoTGateway1SwAirCSensor1_4);
	    bTSClasses.all_communications_je.add(communication_CommIoTGateway1SwAirCSensor1_4_je);
	    
	    JsonObject communication_CommIoTGateway1SwAirCSensor1_4_jo = new JsonObject();
	    bTSClasses.all_communications_jo.add(communication_CommIoTGateway1SwAirCSensor1_4_jo);
	    
	    communication_CommIoTGateway1SwAirCSensor1_4_jo.add("CommIoTGateway1SwAirCSensor1", communication_CommIoTGateway1SwAirCSensor1_4_je);


//*************************************************
//Communication CommIoTGateway1SwElectrSensor1
//*************************************************
		Communication communication_CommIoTGateway1SwElectrSensor1_5 = new Communication();
		bTSClasses.all_pojos.add(communication_CommIoTGateway1SwElectrSensor1_5);
		bTSClasses.all_communications.add(communication_CommIoTGateway1SwElectrSensor1_5);

		communication_CommIoTGateway1SwElectrSensor1_5.addId("_USRbMJiMEee1TIWgg3Q4Sw");
		communication_CommIoTGateway1SwElectrSensor1_5.setName("IoTGateway2SensorComm");	
		communication_CommIoTGateway1SwElectrSensor1_5.addCommunicationConfigs("MQTTConfigClient2");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_CommIoTGateway1SwElectrSensor1_5_je = gson.toJsonTree(communication_CommIoTGateway1SwElectrSensor1_5);
	    bTSClasses.all_communications_je.add(communication_CommIoTGateway1SwElectrSensor1_5_je);
	    
	    JsonObject communication_CommIoTGateway1SwElectrSensor1_5_jo = new JsonObject();
	    bTSClasses.all_communications_jo.add(communication_CommIoTGateway1SwElectrSensor1_5_jo);
	    
	    communication_CommIoTGateway1SwElectrSensor1_5_jo.add("CommIoTGateway1SwElectrSensor1", communication_CommIoTGateway1SwElectrSensor1_5_je);


//*************************************************
//Communication CommIoTGateway1SwTempSensor1
//*************************************************
		Communication communication_CommIoTGateway1SwTempSensor1_6 = new Communication();
		bTSClasses.all_pojos.add(communication_CommIoTGateway1SwTempSensor1_6);
		bTSClasses.all_communications.add(communication_CommIoTGateway1SwTempSensor1_6);

		communication_CommIoTGateway1SwTempSensor1_6.addId("_Q6ZgcJiMEee1TIWgg3Q4Sw");
		communication_CommIoTGateway1SwTempSensor1_6.setName("IoTGateway2SensorComm");	
		communication_CommIoTGateway1SwTempSensor1_6.addCommunicationConfigs("MQTTConfigClient2");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_CommIoTGateway1SwTempSensor1_6_je = gson.toJsonTree(communication_CommIoTGateway1SwTempSensor1_6);
	    bTSClasses.all_communications_je.add(communication_CommIoTGateway1SwTempSensor1_6_je);
	    
	    JsonObject communication_CommIoTGateway1SwTempSensor1_6_jo = new JsonObject();
	    bTSClasses.all_communications_jo.add(communication_CommIoTGateway1SwTempSensor1_6_jo);
	    
	    communication_CommIoTGateway1SwTempSensor1_6_jo.add("CommIoTGateway1SwTempSensor1", communication_CommIoTGateway1SwTempSensor1_6_je);


//*************************************************
//Communication IoTGateway2BTSBrokerComm1
//*************************************************
		Communication communication_IoTGateway2BTSBrokerComm1_7 = new Communication();
		bTSClasses.all_pojos.add(communication_IoTGateway2BTSBrokerComm1_7);
		bTSClasses.all_communications.add(communication_IoTGateway2BTSBrokerComm1_7);

		communication_IoTGateway2BTSBrokerComm1_7.addId("_jYw5MJiMEee1TIWgg3Q4Sw");
		communication_IoTGateway2BTSBrokerComm1_7.setName("IoTGateway2BTSBrokerComm");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_IoTGateway2BTSBrokerComm1_7_je = gson.toJsonTree(communication_IoTGateway2BTSBrokerComm1_7);
	    bTSClasses.all_communications_je.add(communication_IoTGateway2BTSBrokerComm1_7_je);
	    
	    JsonObject communication_IoTGateway2BTSBrokerComm1_7_jo = new JsonObject();
	    bTSClasses.all_communications_jo.add(communication_IoTGateway2BTSBrokerComm1_7_jo);
	    
	    communication_IoTGateway2BTSBrokerComm1_7_jo.add("IoTGateway2BTSBrokerComm1", communication_IoTGateway2BTSBrokerComm1_7_je);


//*************************************************
//Communication IoTGateway2BTSBrokerComm2
//*************************************************
		Communication communication_IoTGateway2BTSBrokerComm2_8 = new Communication();
		bTSClasses.all_pojos.add(communication_IoTGateway2BTSBrokerComm2_8);
		bTSClasses.all_communications.add(communication_IoTGateway2BTSBrokerComm2_8);

		communication_IoTGateway2BTSBrokerComm2_8.addId("_RwILYJiIEee1TIWgg3Q4Sw");
		communication_IoTGateway2BTSBrokerComm2_8.setName("IoTGateway2BTSBrokerComm");	
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_IoTGateway2BTSBrokerComm2_8_je = gson.toJsonTree(communication_IoTGateway2BTSBrokerComm2_8);
	    bTSClasses.all_communications_je.add(communication_IoTGateway2BTSBrokerComm2_8_je);
	    
	    JsonObject communication_IoTGateway2BTSBrokerComm2_8_jo = new JsonObject();
	    bTSClasses.all_communications_jo.add(communication_IoTGateway2BTSBrokerComm2_8_jo);
	    
	    communication_IoTGateway2BTSBrokerComm2_8_jo.add("IoTGateway2BTSBrokerComm2", communication_IoTGateway2BTSBrokerComm2_8_je);



//*************************************************
//communication_configurations
//*************************************************

//*************************************************
//Communication Configuration MQTTConfigClient2
//*************************************************
		CommunicationConfiguration communication_configuration_MQTTConfigClient2_1 = new CommunicationConfiguration();
		bTSClasses.all_pojos.add(communication_configuration_MQTTConfigClient2_1);
		bTSClasses.all_communication_configurations.add(communication_configuration_MQTTConfigClient2_1);

		communication_configuration_MQTTConfigClient2_1.addId("_Yr3i4JJQEeeeSL7FBGSdJA");
		communication_configuration_MQTTConfigClient2_1.setName("MQTTConfigClient");	
		communication_configuration_MQTTConfigClient2_1.addProtocolType("MQTT");
		communication_configuration_MQTTConfigClient2_1.addPortNumber("1883");
		communication_configuration_MQTTConfigClient2_1.addServerIP("35.189.187.208");
		communication_configuration_MQTTConfigClient2_1.addTopics("/gateway/electricity");
		communication_configuration_MQTTConfigClient2_1.addQosLevel("2");
		communication_configuration_MQTTConfigClient2_1.addKeepAlive("210");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_configuration_MQTTConfigClient2_1_je = gson.toJsonTree(communication_configuration_MQTTConfigClient2_1);
	    bTSClasses.all_communication_configurations_je.add(communication_configuration_MQTTConfigClient2_1_je);
	    
	    JsonObject communication_configuration_MQTTConfigClient2_1_jo = new JsonObject();
	    bTSClasses.all_communication_configurations_jo.add(communication_configuration_MQTTConfigClient2_1_jo);
	    
	    communication_configuration_MQTTConfigClient2_1_jo.add("MQTTConfigClient2", communication_configuration_MQTTConfigClient2_1_je);


//*************************************************
//Communication Configuration MQTTConfigServer1
//*************************************************
		CommunicationConfiguration communication_configuration_MQTTConfigServer1_2 = new CommunicationConfiguration();
		bTSClasses.all_pojos.add(communication_configuration_MQTTConfigServer1_2);
		bTSClasses.all_communication_configurations.add(communication_configuration_MQTTConfigServer1_2);

		communication_configuration_MQTTConfigServer1_2.addId("_ReZ2oJJQEeeeSL7FBGSdJA");
		communication_configuration_MQTTConfigServer1_2.setName("MQTTConfigServer");	
		communication_configuration_MQTTConfigServer1_2.addProtocolType("MQTT");
		communication_configuration_MQTTConfigServer1_2.addKeepAlive("210");
		//*************************************************
		//Json Conversion
		//*************************************************		
	    JsonElement communication_configuration_MQTTConfigServer1_2_je = gson.toJsonTree(communication_configuration_MQTTConfigServer1_2);
	    bTSClasses.all_communication_configurations_je.add(communication_configuration_MQTTConfigServer1_2_je);
	    
	    JsonObject communication_configuration_MQTTConfigServer1_2_jo = new JsonObject();
	    bTSClasses.all_communication_configurations_jo.add(communication_configuration_MQTTConfigServer1_2_jo);
	    
	    communication_configuration_MQTTConfigServer1_2_jo.add("MQTTConfigServer1", communication_configuration_MQTTConfigServer1_2_je);




//*************************************************
//computing_configurations
//*************************************************


//*************************************************
//storage_configurations
//*************************************************

		JsonElement je = null;
		String je_string = null;
		//*************************************************
		//Serialization of Cloud Services
		//*************************************************    

		for (Iterator iterator = bTSClasses.all_cloud_services_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			bTSClasses.all_cloud_services_je.add(je);
			je_string = gson.toJson(je);
			bTSClasses.all_cloud_services_string.add(je_string);
			System.out.println(je_string);			
		}

		//*************************************************
		//Serialization of Virtual Sensors
		//*************************************************    
		
		for (Iterator iterator = bTSClasses.all_virtual_sensors_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			bTSClasses.all_virtual_sensors_je.add(je);
			je_string = gson.toJson(je);
			bTSClasses.all_virtual_sensors_string.add(je_string);
			System.out.println(je_string);			
		}
		
		//*************************************************
		//Serialization of Sensors
		//*************************************************    
		
		for (Iterator iterator = bTSClasses.all_sensors_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			bTSClasses.all_sensors_je.add(je);
			je_string = gson.toJson(je);
			bTSClasses.all_sensors_string.add(je_string);
			System.out.println(je_string);			
		}

		//*************************************************
		//Serialization of Virtual Gateways
		//*************************************************    
		
		for (Iterator iterator = bTSClasses.all_virtual_gateways_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			bTSClasses.all_virtual_gateways_je.add(je);
			je_string = gson.toJson(je);
			bTSClasses.all_virtual_gateways_string.add(je_string);
			System.out.println(je_string);			
		}	
		
		//*************************************************
		//Serialization of Virtual Actuator
		//*************************************************    
		
		for (Iterator iterator = bTSClasses.all_virtual_actuators_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			bTSClasses.all_virtual_actuators_je.add(je);
			je_string = gson.toJson(je);
			bTSClasses.all_virtual_actuators_string.add(je_string);
			System.out.println(je_string);			
		}
		
		//*************************************************
		//Serialization of Actuator
		//*************************************************    
		
		for (Iterator iterator = bTSClasses.all_actuators_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			bTSClasses.all_actuators_je.add(je);
			je_string = gson.toJson(je);
			bTSClasses.all_actuators_string.add(je_string);
			System.out.println(je_string);			
		}
				
		//*************************************************
		//Serialization of Communication
		//*************************************************    
		
		for (Iterator iterator = bTSClasses.all_communications_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			bTSClasses.all_communications_je.add(je);
			je_string = gson.toJson(je);
			bTSClasses.all_communications_string.add(je_string);
			System.out.println(je_string);			
		}	

		//*************************************************
		//Serialization of Communication Configuration
		//*************************************************    
		
		for (Iterator iterator = bTSClasses.all_communication_configurations_jo.iterator(); iterator.hasNext();) {
			JsonObject elem = (JsonObject) iterator.next();
			je = jp.parse(elem.toString());
			bTSClasses.all_communication_configurations_je.add(je);
			je_string = gson.toJson(je);
			bTSClasses.all_communication_configurations_string.add(je_string);
			System.out.println(je_string);			
		}	

		
	}
	
	
}
