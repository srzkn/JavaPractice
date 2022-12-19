package day35_OOP_Encapsulation;

public class Credentials {
    private String username, password;

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public boolean isStrongPassWord(String password){
        int k=0;
        int l=0;
        int m=0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) k=1;
            else if (Character.isLetter(password.charAt(i))) l=1;
            else if (!Character.isLetterOrDigit(password.charAt(i))) m=1;
        }
        if (password.length()>=8 && !password.contains(" ") && k==1 && l==1 && m==1) return true;
        else return false;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public void setPassword(String password){
        if (isStrongPassWord(password)) this.password=password;
        else return;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }
}
