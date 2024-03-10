package ru.praktikum.manage;

import ru.praktikum.model.Epic;
import ru.praktikum.model.Subtask;
import ru.praktikum.model.Task;

import java.util.List;

public interface TaskManagers {
    static int getId() {return 0;}

    // a. Получение списка всех задач.
    List<Task> getListTask();

    List<Epic> getListEpic();

    List<Subtask> getListSubtask();
}
