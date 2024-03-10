package ru.praktikum.model;

import java.util.ArrayList;

public interface Tasks {
    //Task
    default int getId() {return 0;}

    default void setId(int id) { }

    default String getName() {return null;}

    default void setName(String name) {}

    default String getDescription() {return null;}

    default void setDescription(String description) {}

    default Status getStatus() {return null;}

    default void setStatus(Status status) {}
    //Epic
    default ArrayList<Integer> getIdSubtask() {return null;}

    default void setIdSubtask(ArrayList<Integer> idSubtask) {}

    default void addIdSubtask(int id) {}

    default void removeIdSubtask(int id) { }

    default void removeAllIdSubtask() { }
    //Subtask
    default int getIdEpic() {return 0;}

    default void setIdEpic(int idEpic) { }
}