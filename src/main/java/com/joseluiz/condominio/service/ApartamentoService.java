package com.joseluiz.condominio.service;

import com.joseluiz.condominio.models.Apartamento;
import com.joseluiz.condominio.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ApartamentoService extends AbstractService<Apartamento> {

    @Inject
    private GenericDao<Apartamento> daoApartamento;

    @Override
    protected GenericDao<Apartamento> getDao() {
        return daoApartamento;
    }
}
