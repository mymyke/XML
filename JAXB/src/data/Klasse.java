package data;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Klasse {
	private ArrayList<Schueler> schuelerliste;
	private String raum;
	private String name;
	private String kv;
	
	@XmlElementWrapper(name = "autoliste")
	@XmlElement(name = "auto")
	public ArrayList<Schueler> getSchuelerliste() {
		return schuelerliste;
	}
	public void setSchuelerliste(ArrayList<Schueler> schuelerliste) {
		this.schuelerliste = schuelerliste;
	}
	@XmlAttribute(name = "raum")
	public String getRaum() {
		return raum;
	}
	public void setRaum(String raum) {
		this.raum = raum;
	}
	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute(name = "kv")
	public String getKv() {
		return kv;
	}
	public void setKv(String kv) {
		this.kv = kv;
	}	
}
