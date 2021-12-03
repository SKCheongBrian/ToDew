package briyan.todew.model.task;

public class Description {
    private String description;

    public Description(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    @Override
    public boolean equals(Object other) {
        return this == other
                || (other instanceof Description
                && description.equals(((Description) other).description));
    }
}
