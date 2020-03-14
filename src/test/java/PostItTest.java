import static org.junit.Assert.*;
import org.junit.Test;

public class PostItTest {
    @Test
    public void testPostIt() {
        String taskName = "Finir projet de CLean Architecture";
        PostIt postIt = new PostIt(taskName);
        
        assertEquals(postIt.getTaskName(), taskName);
        assertEquals(postIt.getState(), TaskState.TODO);
    }
}