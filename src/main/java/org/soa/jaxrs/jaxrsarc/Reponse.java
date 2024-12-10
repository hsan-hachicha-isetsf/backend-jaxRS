package org.soa.jaxrs.jaxrsarc;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

public class Reponse {
    private boolean status;  // état
    private String message;

    // Getter et Setter pour status
    @XmlElement // Indique que cet attribut sera inclus dans le XML
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Getter et Setter pour message
    @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
