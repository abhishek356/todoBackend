package com.abhishek.todoApplicationBackend.controller;

import com.abhishek.todoApplicationBackend.service.TodoService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class todoController {

    private static  final Logger LOG = LoggerFactory.getLogger(todoController.class);
    @Autowired
    TodoService todoService;

   // String todo;
    @ResponseBody
    @PostMapping ("/addTodo")
    public String testing(@ RequestBody String todo )
    {

        LOG.info("The value received from the front end is,{}",todo);
        todoService.testing();
        return "todo.jsp";
    }

}
