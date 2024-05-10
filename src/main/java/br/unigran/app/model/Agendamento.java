
package br.unigran.app.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Agendamento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Paciente pacienteID;
    @OneToOne
    private Dentista dentistaID;
    private String horario;
    private Date data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPacienteID() {
        return pacienteID;
    }

    public void setPacienteID(Paciente pacienteID) {
        this.pacienteID = pacienteID;
    }

    public Dentista getDentistaID() {
        return dentistaID;
    }

    public void setDentistaID(Dentista dentistaID) {
        this.dentistaID = dentistaID;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
