package ru.praktikum.model;

import java.util.ArrayList;

import static ru.praktikum.model.TaskType.EPIC;

public class Epic extends Task {
    private ArrayList<Integer> idSubtask;

    public Epic(String description) {
        super(description);
        idSubtask = new ArrayList<>();
        this.id = getId();
        setName("Эпик");

    }

    public Epic(int id, String name, String description, Status status, ArrayList<Integer> idSubtask) {
        super(id, name, description, status);
        this.idSubtask = idSubtask;
    }

    @Override
    public ArrayList<Integer> getIdSubtask() {
        return idSubtask;
    }

    @Override
    public void setIdSubtask(ArrayList<Integer> idSubtask) {
        this.idSubtask = idSubtask;
    }

    @Override
    public void addIdSubtask(int id) {
        idSubtask.add(id);
    }

    @Override
    public void removeIdSubtask(int id) {
        idSubtask.remove(id);
    }

    @Override
    public void removeAllIdSubtask() {
        idSubtask.clear();
    }
    @Override
    public String toString() {
        return EPIC + "," + id + "," + name + "," + description + "," + status + "\n";
    }
}