package Controller;
import GUI.*;
import Database.*;
import Models.*;


import java.awt.event.*;

public class GUIController implements ActionListener {

private MainPageGUI mainpage;
private LoginController login;
private SearchController search;
private Database db;

public GUIController(Database db)
{
    mainpage = new MainPageGUI();
    this.setDatabase(db);
    login = new LoginController(this.db);
    search = new SearchController(this.db);
    this.mainpage.addLoginListener(this);
    this.mainpage.addGuestListener(this);
}

public void setDatabase(Database db)
{
    this.db = db;
}

@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(mainpage.getLog()))
    {
        mainpage.setOff();
        login.enableView();
        login.getView().turnOn();
        login.addListener();
    }
    else if(e.getSource().equals(mainpage.getGuest()))
    {
        mainpage.setOff();
        search.enableView();
        search.getView().turnOn();
        
    }

    
}
}
