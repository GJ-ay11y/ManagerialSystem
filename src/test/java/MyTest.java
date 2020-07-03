import com.gj.pojo.HouseList;
import com.gj.pojo.Paid;
import com.gj.pojo.UserMessage;
import com.gj.service.Impl.OwnerServiceImpl;
import com.gj.service.Impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserServiceImpl userMapper = context.getBean("UserServiceImpl", UserServiceImpl.class);
        List<UserMessage> gj = userMapper.findOne("gj", "520122");
        System.out.println(gj);
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        OwnerServiceImpl ownerServiceImpl = context.getBean("OwnerServiceImpl", OwnerServiceImpl.class);
        List<HouseList> all = ownerServiceImpl.findAll();
        for (HouseList houseList : all) {
            System.out.println(houseList);
        }
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        OwnerServiceImpl ownerServiceImpl = context.getBean("OwnerServiceImpl", OwnerServiceImpl.class);
        List<Paid> all = ownerServiceImpl.findInPaid();
        for (Paid paid : all) {
            System.out.println(paid);
        }
    }
}
