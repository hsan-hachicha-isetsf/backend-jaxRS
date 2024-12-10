package org.soa.jaxrs.jaxrsarc;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jdk.jfr.Label;
import lombok.Data;

@Data
@XmlRootElement(name = "person")// Indique que cette classe peut être convertie en XML
public class Personne {

    private int id;
    private String nom;
    private int age;

    //Constructeur avec trois arguments
    public Personne(int id , String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        System.out.println("Nouvel objet 'Personne'..."+this.nom);

    }
    //Constructeur avec deux arguments
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
        System.out.println("Nouvel objet 'Personne'  sans id ...");

    }
    //Constructeur sans arguments
    public Personne() {
        System.out.println("Nouvel objet 'Personne'  vide...");

    }

    // Getter et Setter pour id
    @XmlElement // Indique que cet attribut sera inclus dans le XML
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter et Setter pour nom
    @XmlElement
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et Setter pour age
    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
