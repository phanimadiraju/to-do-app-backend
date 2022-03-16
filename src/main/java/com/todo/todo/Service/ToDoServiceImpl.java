package com.todo.todo.Service;

import com.todo.todo.DAO.ToDoDAO;
import com.todo.todo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService{

    //define field for ToDo DAO
    private ToDoDAO toDoDAO;

    //setup constructor injection
    @Autowired
    public ToDoServiceImpl(ToDoDAO theToDoDAO){
        toDoDAO=theToDoDAO;
    }
    @Transactional
    public List<ToDo> findAll(){ return toDoDAO.findAll(); }

}
