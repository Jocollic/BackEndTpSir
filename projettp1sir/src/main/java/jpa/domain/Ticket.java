package jpa.domain;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Ticket implements Serializable {
	private Long id;

	private String texte;
    private User user ;
	public Ticket() {
	}

	public Ticket(String texte, User user) {
		this.texte = texte;
        this.user = user ;
	}

	

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @ManyToOne
	@JsonIgnore //DTO surment a faire
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	

	@Override
	public String toString() {
        return "Employee [id=" + id + ", texte=" + texte + ", User=]";	}

}
