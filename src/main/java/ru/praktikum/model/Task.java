package ru.praktikum.model;

import java.util.Objects;

import static ru.praktikum.model.TaskType.EPIC;

public class Task implements Tasks{
    protected int id;
    protected String name;
    protected String description;
    protected Status status;

    public Task(String description) {
        this.description = description;
        id = getId();
        setName("Задача");
        setStatus(Status.NEW);
    }

    public Task(int id, String name, String description, Status status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public Status getStatus() {
        return status;
    }
    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(name, task.name) && Objects.equals(description, task.description) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, status);
    }

    @Override
    public String toString() {
        return EPIC + "," + id + "," + name + "," + description + "," + status + "\n";
    }
}
