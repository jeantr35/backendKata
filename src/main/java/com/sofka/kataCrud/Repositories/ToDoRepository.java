package com.sofka.kataCrud.Repositories;

import com.sofka.kataCrud.Entities.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
