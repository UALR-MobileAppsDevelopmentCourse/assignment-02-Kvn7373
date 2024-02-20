package com.ualr.simpletasklist.model;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.Objects;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.


    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    HashMap<Integer, Task> Alltasks;
    Integer count;

    // TODO 04. Define the class constructor and the corresponding getters and setters.
    public TaskList(){
    count = 0;
        Alltasks= new HashMap<Integer, Task>();
   }

  Task GetTask(Integer key){

        return Alltasks.get(key);
   }

   void SetTask(Integer key, Task task){
        Alltasks.put(key, task);
   }


    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

   public void  add(String description){

        count = count+1;
        Task AnewTask = new Task();
        AnewTask.setDescription(description);
        Alltasks.put(count, AnewTask);
   }

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    @NonNull
    public String tostring(){
        StringBuilder TaskString = new StringBuilder();
        for ( Integer key : Alltasks.keySet() ) {
            TaskString.append(key).append("-").append(GetTask(key).getDescription());
            if(GetTask(key).isDone()) {
                    TaskString.append(" Done");
            }
            TaskString.append("\n");
        }
        return TaskString.toString();
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    public void delete(Integer id){
        Alltasks.remove(id);
    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    public void markDone(Integer id){
        Objects.requireNonNull(Alltasks.get(id)).setDone(true);
    }

}
