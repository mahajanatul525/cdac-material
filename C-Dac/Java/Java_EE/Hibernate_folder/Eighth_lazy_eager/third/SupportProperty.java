package mypack;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CollectionOfElements;
@Entity
@Table(name="sp")
public class SupportProperty implements java.io.Serializable {

	private int id;
	private Map<String, String> properties = new HashMap<String, String>(0);
	private String name;

	public SupportProperty() {
	}

	public SupportProperty(Map<String, String> properties, String name) {
		this.properties = properties;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@CollectionOfElements//(fetch=FetchType.EAGER)
	public Map<String, String> getProperties() {
		return this.properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Column(name="name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
