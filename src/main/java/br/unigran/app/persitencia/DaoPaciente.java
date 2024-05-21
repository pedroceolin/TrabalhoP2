/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.app.persitencia;

import br.unigran.app.model.Paciente;
import java.util.List;

/**
 *
 * @author Pedro
 */
public abstract class DaoPaciente extends Dao{
    
    public abstract List<Paciente> listaPacientes();
    
    public abstract void buscaPaciente();
    
    
   
}