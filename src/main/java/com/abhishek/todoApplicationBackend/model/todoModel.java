package com.abhishek.todoApplicationBackend.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
@NonNull
public class todoModel {

   private int id;
   private String text;
   private boolean completed;
   private String color;

    


}
