package com.fatec.epopet.interfaces;

import java.util.List;

public interface GenericOperations<E> {

    /**
     * Retorna uma lista de entidades
     * @return @description
     */
    List<E> getAll();

    /**
     * Retorna uma entidade buscada pelo id
     * @return @description
     */
    E getById(Integer id);

    /**
     * Quando a pessoa for mandar um post, a aplicação
     * recebe uma entidade(E) e retorna a entidade (e) com o campo
     * id preenchido
     * @param entity @description
     * @return @description
     */
    E post(E entity);

    /**
     * Atualiza um registro
     * @param entity @description
     */
    void put(E entity);

    /**
     * Deleta um registro no banco;
     * @param entity @description
     */
    void deleteById(Integer id);
}
