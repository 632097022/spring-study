package experise;

public class UserLogin{
    private User user;

    public UserLogin() {
    }

    public UserLogin(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public boolean userLogin(User user){
        if(user.getAccount().equals("admin")&& user.getPassword().equals("111")){
            return true;
        }
        return false;
    }

}