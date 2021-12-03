package briyan.todew.model.task;

public class Task {
    private Description description;
    private State state;

    public Task(Description description) {
        this.description = description;
        this.state = new State();
    }

    public void toggle() {
        state.toggle();
    }

    public boolean getState() {
        return state.getState();
    }

    public Description getDescription() {
        return description;
    }
}
