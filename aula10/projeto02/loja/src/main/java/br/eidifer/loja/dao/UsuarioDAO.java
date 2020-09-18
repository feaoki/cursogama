package br.eidifer.loja.dao;

import org.springframework.data.repository.CrudRepository;

import br.eidifer.loja.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
    
}
