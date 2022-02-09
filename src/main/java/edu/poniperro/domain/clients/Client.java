package edu.poniperro.domain.clients;

import edu.poniperro.domain.administrador.ProgramadorTasques;

public interface Client {
    void setProgramadorTasques(ProgramadorTasques programadorTasques);
    void enviarPeticio(String peticio);
}
