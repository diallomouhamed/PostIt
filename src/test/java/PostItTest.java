import static org.junit.Assert.*;
import org.junit.Test;

public class PostItTest {
    @Test
    public void testPostIt() {
        String taskName = "Finir projet de CLean Architecture";
        AppTime dateTime = new AppTime("2020-03-14 15:33");
        PostIt postIt = new PostIt(taskName, dateTime);

        assertEquals(postIt.getTaskName(), taskName);
        assertTrue(dateTime.getDateTime().isEqual(postIt.getCreationDate().getDateTime()));
        assertEquals(postIt.getState(), TaskState.TODO);
    }
}