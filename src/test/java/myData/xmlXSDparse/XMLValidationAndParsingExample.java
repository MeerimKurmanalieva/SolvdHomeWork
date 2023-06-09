package myData.xmlXSDparse;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import java.io.File;
import java.io.IOException;

public class XMLValidationAndParsingExample {
    public static void main(String[] args) {
        try {
            // Validate XML against XSD
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(true);
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.setErrorHandler(new org.xml.sax.ErrorHandler() {
                // Ignore fatal errors to continue parsing
                public void fatalError(SAXParseException exception) throws SAXException {
                    System.err.println("Fatal Error: " + exception.getMessage());
                }

                // Handle non-fatal errors and warnings
                public void error(SAXParseException e) throws SAXParseException {
                    System.err.println("Error: " + e.getMessage());
                    throw e;
                }

                public void warning(SAXParseException err) throws SAXParseException {
                    System.err.println("Warning: " + err.getMessage());
                    throw err;
                }
            });

            // Parse XML file
            Document document = builder.parse(new File("mydb.xml"));
            Element root = document.getDocumentElement();


            Element patientsElement = (Element) root.getElementsByTagName("Patients").item(0);
            String patientId = patientsElement.getElementsByTagName("patient_id").item(0).getTextContent();
            String name = patientsElement.getElementsByTagName("name").item(0).getTextContent();
            String dateOfBirth = patientsElement.getElementsByTagName("date_of_birth").item(0).getTextContent();
            String address = patientsElement.getElementsByTagName("address").item(0).getTextContent();
            String phoneNumber = patientsElement.getElementsByTagName("phone_number").item(0).getTextContent();

            System.out.println("Patient Information:");
            System.out.println("Patient ID: " + patientId);
            System.out.println("Name: " + name);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber);



        } catch (SAXParseException e) {
            // XML validation failed
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

