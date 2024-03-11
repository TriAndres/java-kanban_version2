package ru.praktikum.model;

import java.util.ArrayList;

public class Epic extends Task {
    private ArrayList<Integer> idSubtask;

    public Epic(String description) {
        super(description);
        idSubtask = new ArrayList<>();
        this.id = getId();
        setName("Эпик");

    }

    public Epic(String name, String description, Status status, ArrayList<Integer> idSubtask) {
        super(name, description, status);
        this.idSubtask = idSubtask;
    }

    public Epic(int id, String name, String description, Status status, ArrayList<Integer> idSubtask) {
        super(id, name, description, status);
        this.idSubtask = idSubtask;
    }

    public Epic(Epic epic) {
        super(epic);
        this.idSubtask = epic.idSubtask;
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
    public TaskType getType() {
        return TaskType.EPIC;
    }

    @Override
    public String toString() {
        return getType() + "," + id + "," + name + "," + description + "," + status + "\n";
    }
}