package sg.edu.np.mad.madpractical4;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest{
    private User user;
    
    @Test
    public void testUser(){
        user = new User("John Doe", "MAD Developer", 1, false);
        assertEquals("John Doe", user.getName());
        assertEquals("MAD Developer", user.getDescription());
        assertEquals(false, user.getFollowed());
    }

}
