package com.example.demo;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    // Puedes agregar métodos personalizados según tus necesidades
}
