package myData.xmlXSDparse;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class XMLParserExample {public static void main(String[] args) {
    try {
        // Create a DocumentBuilder instance
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Parse the XML file
        Document document = builder.parse("mydb.xml");

        // Get the root element
        Element rootElement = document.getDocumentElement();

        // Process Patients
        NodeList patientNodes = rootElement.getElementsByTagName("Patients");
        for (int i = 0; i < patientNodes.getLength(); i++) {
            Element patientElement = (Element) patientNodes.item(i);
            // Process patient data
            // Extract the required information and perform further processing
        }

        // Process Doctor
        NodeList doctorNodes = rootElement.getElementsByTagName("Doctor");
        for (int i = 0; i < doctorNodes.getLength(); i++) {
            Element doctorElement = (Element) doctorNodes.item(i);
            // Process doctor data
            // Extract the required information and perform further processing
        }

        // Process Appointment
        NodeList appointmentNodes = rootElement.getElementsByTagName("Appointment");
        for (int i = 0; i < appointmentNodes.getLength(); i++) {
            Element appointmentElement = (Element) appointmentNodes.item(i);
            // Process appointment data
            // Extract the required information and perform further processing
        }

        // Process Prescription
        NodeList prescriptionNodes = rootElement.getElementsByTagName("Prescription");
        for (int i = 0; i < prescriptionNodes.getLength(); i++) {
            Element prescriptionElement = (Element) prescriptionNodes.item(i);
            // Process prescription data
            // Extract the required information and perform further processing
        }

        // Process Test
        NodeList testNodes = rootElement.getElementsByTagName("Test");
        for (int i = 0; i < testNodes.getLength(); i++) {
            Element testElement = (Element) testNodes.item(i);
            // Process test data
            // Extract the required information and perform further processing
        }

        // Continue processing other elements as needed

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
