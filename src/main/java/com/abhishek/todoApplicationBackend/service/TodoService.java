package com.abhishek.todoApplicationBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private static  final Logger log = LoggerFactory.getLogger(TodoService.class);
    public void testing()
    {
        log.info("Inside testing method of service");
        System.out.println("This is testing..");
    }

}
