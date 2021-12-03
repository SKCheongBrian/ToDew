package briyan.todew.model.task;

public class State {
    private boolean isDone;

    public State() {
        this.isDone = false;
    }

    public boolean getState() {
        return isDone;
    }

    public void toggle() {
        isDone = !isDone;
    }
}
