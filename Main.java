import Messages.Director;
import Users.*;

import javax.annotation.processing.SupportedSourceVersion;
import java.sql.Date;
import java.util.ArrayList;
// Proxy user client
public class Main {
    public static void main(String [] args){ // static btkhleni a3mlha access mn ay 7ta fl project
        UserFactory prof=new UserFactory();
        User p=prof.createUser("professor");
        UserData data=new UserData();
        data.setDepartment("SW");
        data.setEmail("abdelwahab@gmail.com");
        String str="2015-03-31";
        Date date=Date.valueOf(str);//converting string into sql date
        data.setHirringDate(date);
        data.setName("Abdelwahab");
        data.setPhDTopic("CS");
        data.setPhoneNumber("01289751566");
        p.makeUser(data); // main class user subclass professor
        Course course =new Course("Arch ", " 787");
        course.subscribeProfessorForEmailNotification((Observer) p);
        ArrayList<Observer> test= course.professorsForEmailNotification;
        ManageTask takenTask=course;
        takenTask.makeTask("exam","ArchExam","goodluck");

    }

}
