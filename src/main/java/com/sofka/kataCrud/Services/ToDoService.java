package com.sofka.kataCrud.Services;

import com.sofka.kataCrud.Entities.ToDo;
import com.sofka.kataCrud.Repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService{

    @Autowired
    private ToDoRepository repository;

    public Iterable<ToDo> list(){
        return repository.findAll();
    }

    public ToDo save(ToDo toDo){
        return repository.save(toDo);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public ToDo get(Long id){
        return repository.findById(id).orElseThrow();
    }
}
