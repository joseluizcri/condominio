package com.joseluiz.condominio.resources;

import com.joseluiz.condominio.models.Apartamento;
import com.joseluiz.condominio.service.AbstractService;
import com.joseluiz.condominio.service.ApartamentoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/apartamentos")
public class ApartamentoResource extends AbstractResource<Apartamento> {

    @Inject
    private ApartamentoService apartamentoService;

    @Override
    protected AbstractService<Apartamento> getService() {
        return apartamentoService;
    }
}
