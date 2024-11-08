package entities;

public class TodoList {
    private String todo;
    private int id;

    public String getTodo() {
        return todo;
    }

    public TodoList() {
    }

    public void setTodo(final String todo) {
        this.todo = todo;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }
}
