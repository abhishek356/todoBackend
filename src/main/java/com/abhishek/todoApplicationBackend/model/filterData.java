package com.abhishek.todoApplicationBackend.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@NoArgsConstructor
public class filterData {

    private String status;
    private String[] color;

}
