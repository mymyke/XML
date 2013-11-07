package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import data.*;

public class XMLTest {
	
	private static final String SERVER_XML ="./server-jaxb.xml";

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		// TODO Schueler-generated method stub
		ArrayList<Schueler> Schuelerliste1 = new ArrayList<Schueler>();
		
		Schueler Schueler1 = new Schueler();
		Schueler1.setVorname("Karl");
		Schueler1.setNachname("Einser");
		Schueler1.setGebdatum("10.10.1990");
		Schueler1.setK_nummer("1");
		
		Schueler Schueler2 = new Schueler();
		Schueler2.setVorname("Peter");
		Schueler2.setNachname("Zweier");
		Schueler2.setGebdatum("11.11.1991");
		Schueler2.setK_nummer("2");
		
		Schuelerliste1.add(Schueler1);
		Schuelerliste1.add(Schueler2);
		
		Klasse CHIF4 = new Klasse();
		CHIF4.setName("4CHIF");
		CHIF4.setRaum("C05");
		CHIF4.setKv("Griesmayer");
		CHIF4.setSchuelerliste(Schuelerliste1);
		
		JAXBContext context = JAXBContext.newInstance(Klasse.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		//Write to System.out
		System.out.println("XML-Version");
		System.out.println();
		m.marshal(CHIF4, System.out);
		
		//Write to File
		m.marshal(CHIF4, new File(SERVER_XML));
		
		//get variable from the xml file, created in the lines above
		System.out.println();
		System.out.println("Ergebnis (Daten) aus der XML-Version");
		Unmarshaller um = context.createUnmarshaller();
		Klasse Chif4 = (Klasse)um.unmarshal(new FileReader(SERVER_XML));
		ArrayList<Schueler> list = Chif4.getSchuelerliste();
		for(Schueler a:list){
			System.out.println();
			System.out.println("Katalognummer: "+a.getK_nummer()+" ,Vorname: "+a.getVorname()+" ,Nachname: "+Chif4.getName() +  " ,Gebdatum: " + a.getGebdatum()  + "\n\rgeht in die: "+CHIF4.getName());
		}
	}

}