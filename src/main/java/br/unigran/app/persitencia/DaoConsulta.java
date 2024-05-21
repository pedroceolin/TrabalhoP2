/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.app.persitencia;

import br.unigran.app.model.Agendamento;

import br.unigran.app.model.Paciente;

/**
 *
 * @author Pedro
 */
public abstract class DaoConsulta extends Dao {
    
    public abstract void agendarHorario(Agendamento agendamento);
    
    public abstract void registrarConsulta(Paciente paciente);
}
