package com.crud.chatGPT.repository;

import com.crud.chatGPT.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    // Aquí puedes agregar métodos personalizados si lo necesitas
}