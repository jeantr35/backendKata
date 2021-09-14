package com.sofka.kataCrud.Controller;

import com.sofka.kataCrud.Entities.ToDo;
import com.sofka.kataCrud.Services.ToDoService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService service;

    @GetMapping(value = "api/toDoList")
    public Iterable<ToDo> list(){
        return service.list();
    }

    @PostMapping(value = "api/toDoSave")
    public ToDo save(@RequestBody ToDo toDo){
        return service.save(toDo);
    }

    @PutMapping(value = "api/toDoSave")
    public ToDo update(@RequestBody ToDo toDo){
        if(toDo.getId() != null) {
            return service.save(toDo);
        }
        throw new RuntimeException("No existe el ID para actualizar");
    }

    @DeleteMapping(value = "api/{id}/toDoDelete")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/toDoGet")
    public ToDo get(@PathVariable("id") Long id){
        return service.get(id);
    }

}
