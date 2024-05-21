/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.app.persitencia;

import br.unigran.app.model.Login;

/**
 *
 * @author Pedro
 */
public abstract class DaoAdministrador extends Dao {
    
    public abstract void alteraAcesso(Login login);
}
