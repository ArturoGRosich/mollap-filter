package edu.poniperro.domain.clients;

import edu.poniperro.domain.administrador.ProgramadorTasques;

public class Mollapp implements Client{
    private ProgramadorTasques programador;
    public Mollapp () {
    }

    public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
        this.programador = programadorTasques;
    }

    @Override
    public void enviarPeticio(String peticio) {

    }
}
