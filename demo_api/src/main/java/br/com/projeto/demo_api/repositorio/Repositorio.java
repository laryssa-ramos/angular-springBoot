package br.com.projeto.demo_api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.demo_api.modelo.Cliente;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long> {
    


}
