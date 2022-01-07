package cn.bdqn.test;

import cn.bdqn.domain.User;
import cn.bdqn.service.DogServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YmlTest {

    @Autowired
    private User user;

    @Autowired
    private DogServiceImpl dogService;

    @Test
    public void testUser() throws Exception{
        System.out.println(user);
    }

    @Test
    public void testDog() throws Exception{
        System.out.println(dogService);
    }
}
