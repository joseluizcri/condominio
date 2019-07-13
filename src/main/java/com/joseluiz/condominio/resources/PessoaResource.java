package com.joseluiz.condominio.resources;

import com.joseluiz.condominio.models.Pessoa;
import com.joseluiz.condominio.service.AbstractService;
import com.joseluiz.condominio.service.PessoaService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/pessoas")
public class PessoaResource extends AbstractResource<Pessoa> {

    @Inject
    private PessoaService pessoaService;

    @Override
    protected AbstractService<Pessoa> getService() {
        return pessoaService;
    }
}
