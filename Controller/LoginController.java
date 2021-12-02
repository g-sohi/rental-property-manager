package Controller;
import GUI.*;
import Database.*;
import Models.*;

//Login Controller
public class LoginController {
    private LoginView view;
    private Database db;
    private User user;
    private RegisterView rView;

    //Default constructor to create instances of member variables
    public LoginController(){
        this.view = new LoginView();
        this.db = new Database();
        this.user = new User();
        this.rView = new RegisterView();
    }
    
    //Verify user login credentials and return a boolean indicating its status
    public boolean verifyLogin(){
        return true;
    }

    //Register new user
    public void registerUser(){

    }

    //getter for login view
    public LoginView getLoginView(){
        return this.view;
    }

    //setter for login view
    public void setLoginView(LoginView lv){
        this.view = lv;
    }

    //getter for database 
    public Database getDatabase(){
        return this.db;
    }

    //setter for database
    public void setDatabase(Database d){
        this.db = d;
    }

    //getter for user
    public User getUser(){
        return this.user;
    }

    //setter for user
    public void setUser(User u){
        this.user = u;
    }

    //getter for register view
    public RegisterView getRegisterView(){
        return this.rView;
    }

    //setter for register view
    public void setRegisterView(RegisterView rv){
        this.rView = rv;
    }
}
