package factoryTest;

import factory.UserFactory;
import org.junit.jupiter.api.Test;
import domain.User;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserFactoryTest
{
    @Test
    public void Test()
    {
        User User = UserFactory.createUser("jhiebner1@gmail.com","Jesse","Hiebner","0817364831","28 June 1998");
        assertNotNull(User);
    }
}