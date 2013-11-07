package data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "schueler")
public class Schueler {
	private String vorname;
	private String nachname;
	private String gebdatum;
	private String k_nummer;
	
	@XmlAttribute(name = "vorname")
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	@XmlAttribute(name = "nachname")
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	@XmlAttribute(name = "gebdatum")
	public String getGebdatum() {
		return gebdatum;
	}
	public void setGebdatum(String gebdatum) {
		this.gebdatum = gebdatum;
	}
	@XmlAttribute(name = "k_nummer")
	public String getK_nummer() {
		return k_nummer;
	}
	public void setK_nummer(String k_nummer) {
		this.k_nummer = k_nummer;
	}
}
