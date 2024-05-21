/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.app.persitencia;

import br.unigran.app.model.Agendamento;
import br.unigran.app.model.Consulta;

/**
 *
 * @author Pedro
 */
public abstract class DaoAgendamento extends Dao{
    
    public abstract void marcarConsulta(Agendamento agendamento);
    
    public abstract void cancelarConsulta(Consulta consulta);

}
