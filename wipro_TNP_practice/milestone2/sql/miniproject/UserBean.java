package miniproject;


public class UserBean {

    private String userID;
    private String password;
    private String name;
    private int incorrectAttempts;
    private int lockStatus;
    private String userType;

    public UserBean() {

    }

    public UserBean(String userID, String password, String name,
                    int incorrectAttempts, int lockStatus,
                    String userType) {

        this.userID = userID;
        this.password = password;
        this.name = name;
        this.incorrectAttempts = incorrectAttempts;
        this.lockStatus = lockStatus;
        this.userType = userType;
    }

    

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getIncorrectAttempts() {
        return incorrectAttempts;
    }

    public int getLockStatus() {
        return lockStatus;
    }

    public String getUserType() {
        return userType;
    }

   

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncorrectAttempts(int incorrectAttempts) {
        this.incorrectAttempts = incorrectAttempts;
    }

    public void setLockStatus(int lockStatus) {
        this.lockStatus = lockStatus;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {

        return "UserBean [userID=" + userID +
                ", password=" + password +
                ", name=" + name +
                ", incorrectAttempts=" + incorrectAttempts +
                ", lockStatus=" + lockStatus +
                ", userType=" + userType + "]";

    }

}