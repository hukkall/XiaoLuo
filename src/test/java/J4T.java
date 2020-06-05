import com.gukki.dao.UserMapper;
import com.gukki.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J4T {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Applicationcontext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        //User user = userMapper.CheckLogin("lisi", "990102");
        User user = userMapper.CheckLogin("lisi", "");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = format.format(new Date());
        System.out.println(s);
        if (user!=null){
            System.out.println(user);
        }
        else{
            System.out.println("Null");
        }
    }
}
