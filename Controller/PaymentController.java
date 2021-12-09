package Controller;

import Models.*;
import GUI.*;
import Database.*;
import java.awt.event.*;

public class PaymentController implements ActionListener {
    
    private FeesView fees;
    private Fees fee;
    private Database db;
    private LandlordController landlord;
    private ManagerController manager;

    public PaymentController(Database db) {
        this.db =db;

    }

    public void updateFees(int fee) {
        
    }

    public void payFees() {
        
    }

    public ManagerController getManager() {
        return manager;
    }
    public FeesView getFeesView() {
        return fees;
    }
    public void setFees(FeesView fees) {
        this.fees = fees;
    }
    public Fees getFee() {
        return fee;
    }
    public void setFee(Fees fee) {
        this.fee = fee;
    }
    public Database getDb() {
        return db;
    }
    public void setDb(Database db) {
        this.db = db;
    }
    public LandlordController getLandlord() {
        return landlord;
    }
    public void setLandlord(LandlordController landlord) {
        this.landlord = landlord;
    }
    public void setManager(ManagerController manager) {
        this.manager = manager;
    }

    public void enableView(boolean isMgrPlaceholder) {
        fees = new FeesView(isMgrPlaceholder); 
        fees.addPayFeeListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.fees != null)
        {
            db.initializeConnection();
        if(e.getSource().equals(fees.getPayFeesButton()))
            {
                db.updateFeeStatus(Integer.valueOf(fees.getPID()));
                System.out.println("New Information Saved");
                fees.destroyFrameForLandlord();
            }
        }
        
    }
}
