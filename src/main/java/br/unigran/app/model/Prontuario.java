
package br.unigran.app.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Prontuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Paciente paciente;
    @OneToOne
    private Consulta historicoConsulta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consulta getHistoricoConsulta() {
        return historicoConsulta;
    }

    public void setHistoricoConsulta(Consulta historicoConsulta) {
        this.historicoConsulta = historicoConsulta;
    }
    
}
