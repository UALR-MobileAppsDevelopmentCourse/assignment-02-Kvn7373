package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    String description;
    Boolean isDone;


    // TODO 02. Define the class constructor and the corresponding getters and setters.

public Task(){
    description = "";
    isDone = false;
}

Boolean isDone() {
   return isDone;
}
String getDescription(){
    return description;
}

void setDone(boolean done){
    isDone = done;
}
void setDescription(String Description){
    description = Description;
}

}
