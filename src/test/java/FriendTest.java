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


    @Test
    void checkToString() {
        Friend friend = new Friend();
        friend.setPhoneNumber("015111589018");
        friend.setName("Tom");
        String actual = friend.toString();
        Assertions.assertEquals("Friend{" +
                "phoneNumber=" + "015111589018" +
                "name=" + "Tom" +
                '}', actual);
    }





}




