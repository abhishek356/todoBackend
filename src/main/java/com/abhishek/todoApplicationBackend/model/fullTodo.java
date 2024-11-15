package com.abhishek.todoApplicationBackend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class fullTodo {

 private   todoModel []todoModels;
 private filterData[] filters;
}
