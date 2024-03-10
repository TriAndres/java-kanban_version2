package ru.praktikum.model;

import static ru.praktikum.model.TaskType.SUBTASK;

public class Subtask extends Task {
    private int idEpic;

    public Subtask(String description, int idEpic) {
        super(description);
        this.idEpic = idEpic;
        this.id = getId();
        setName("Подзадача");
    }

    public Subtask(int id, String name, String description, Status status, int idEpic) {
        super(id, name, description, status);
        this.idEpic = idEpic;
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
    public String toString() {
        return SUBTASK + "," + id + "," + name + "," + description + "," + status + "\n";
    }
}