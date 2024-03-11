package ru.praktikum.model;

public class Subtask extends Task {
    private int idEpic;

    public Subtask(String description, int idEpic) {
        super(description);
        this.idEpic = idEpic;
        this.id = getId();
        setName("Подзадача");
    }

    public Subtask(String name, String description, Status status, int idEpic) {
        super(name, description, status);
        this.idEpic = idEpic;
    }

    public Subtask(int id, String name, String description, Status status, int idEpic) {
        super(id, name, description, status);
        this.idEpic = idEpic;
    }

    public Subtask(Subtask subtask) {
        super(subtask);
        this.idEpic = subtask.idEpic;
    }

    @Override
    public int getIdEpic() {
        return idEpic;
    }

    @Override
    public void setIdEpic(int idEpic) {
        this.idEpic = idEpic;
    }

    @Override
    public TaskType getType() {
        return TaskType.SUBTASK;
    }

    @Override
    public String toString() {
        return getType() + "," + id + "," + name + "," + description + "," + status + "\n";
    }
}