
package br.unigran.app.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Contato implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String numeroContato1;
    private String numeroContato2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroContato1() {
        return numeroContato1;
    }

    public void setNumeroContato1(String numeroContato1) {
        this.numeroContato1 = numeroContato1;
    }

    public String getNumeroContato2() {
        return numeroContato2;
    }

    public void setNumeroContato2(String numeroContato2) {
        this.numeroContato2 = numeroContato2;
    }

    
}
