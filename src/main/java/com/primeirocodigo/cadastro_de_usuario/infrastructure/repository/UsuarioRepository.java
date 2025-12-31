package com.primeirocodigo.cadastro_de_usuario.infrastructure.repository;

import com.primeirocodigo.cadastro_de_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
