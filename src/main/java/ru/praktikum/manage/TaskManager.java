package ru.praktikum.manage;

import ru.praktikum.exeption.ManagerException;
import ru.praktikum.model.Epic;
import ru.praktikum.model.Subtask;
import ru.praktikum.model.Task;

import java.util.*;

public class TaskManager implements TaskManagers {
    private final Map<Integer, Task> taskMap = new HashMap<>();
    private final Map<Integer, Epic> epicMap = new TreeMap<>();
    private final Map<Integer, Subtask> subtaskMap = new HashMap<>();
    private static int id = 0;

    public static int getId() {
        return ++id;
    }

    // a. Получение списка всех задач.
    @Override
    public List<Task> getListTask() {
        List<Task> list = new ArrayList<>();
        if (!taskMap.isEmpty()) {
            for (Integer key : taskMap.keySet()) {
                Task task = taskMap.get(key);
                list.add(task);
            }
        } else {
            System.err.println("Task, список пуст.");
        }
        return list;
    }

    @Override
    public List<Epic> getListEpic() {
        List<Epic> list = new ArrayList<>();
        if (!taskMap.isEmpty()) {
            for (Integer key : epicMap.keySet()) {
                Epic epic = epicMap.get(key);
                list.add(epic);
            }
        } else {
            System.err.println("Epic, список пуст.");
        }
        return list;
    }

    @Override
    public List<Subtask> getListSubtask() {
        List<Subtask> list = new ArrayList<>();
        if (!subtaskMap.isEmpty()) {
            for (Integer key : subtaskMap.keySet()) {
                Subtask subtask = subtaskMap.get(key);
                list.add(subtask);
            }
        } else {
            System.err.println("Subtask, список пуст.");
        }
        return list;
    }
    // b. Удаление всех задач.

    // c. Получение по идентификатору.
    // d. Создание. Сам объект должен передаваться в качестве параметра.
    // e. Обновление. Новая версия объекта с верным идентификатором передаётся в виде параметра.
    // f. Удаление по идентификатору.

    //Дополнительные методы:
    //a. Получение списка всех подзадач определённого эпика.
    //b. Управление статусами
}
