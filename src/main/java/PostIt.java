public class PostIt {

    private String taskName;
    private AppTime creationDate;
    private TaskState state;

    public PostIt(String taskName) {
        this.taskName = taskName;
        this.creationDate = new AppTime();
        this.state = TaskState.TODO;
    }

    public PostIt(String taskName, AppTime creationDate) {
        this.taskName = taskName;
        this.creationDate = creationDate;
        this.state = TaskState.TODO;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public AppTime getCreationDate() {
        return creationDate;
    }

    public TaskState getState() {
        return state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public String getSeniority() {
        return creationDate.getSeniority(new AppTime());
    }

    public String toString() {
        return "[" + getSeniority() + "] " + taskName;
    }
}