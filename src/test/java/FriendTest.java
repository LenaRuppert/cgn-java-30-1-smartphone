import org.example.Friend;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriendTest {

    @Test
    void checkGetPhoneNumber(){
        Friend friend = new Friend();
        friend.setPhoneNumber("4567");
        String actual = friend.getPhoneNumber();
        Assertions.assertEquals("4567", actual);

    }







}




