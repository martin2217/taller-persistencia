/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.utn.frsf.persistencia.taller.persistencia.modelo;

import javax.persistence.DiscriminatorValue;

/**
 *
 * @author mdominguez
 */
@DiscriminatorValue(value = "G")
public class CursoGeneral extends Curso {
    private int cupoMaximo;

    /**
     * @return the cupoMaximo
     */
    public int getCupoMaximo() {
        return cupoMaximo;
    }

    /**
     * @param cupoMaximo the cupoMaximo to set
     */
    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }
    
    @Override
    public String tipoCurso() {
        return "G";
    }
}
