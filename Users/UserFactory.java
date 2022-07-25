package Users;

public class UserFactory {
    public User createUser(String user){
        if(user.equalsIgnoreCase("Professor")){
           return new Professor();
        }
        else if(user.equalsIgnoreCase("TA")){
          return new TA();
        }
        else if(user.equalsIgnoreCase("Student")){
        return new Student();
        }
        else{
             return null;
        }

    }
}
