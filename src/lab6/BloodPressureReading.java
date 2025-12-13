package lab6;

import javax.swing.*;


public class BloodPressureReading {
    private int systolic ;
    private int diastolic;
    private String category;
    public BloodPressureReading(int systolic, int diastolic){
        this.systolic = systolic;
        this.diastolic = diastolic;
    }
    public int getDiastolic(){
        return this.diastolic;
    }
    public int getSystolic(){
        return this.systolic;
    }
    public void setSystolic(int systolic){
        this.systolic = systolic;
    }
    public void setDiastolic(int diastolic){
        this.diastolic = diastolic;
    }
    public void setCategory(String category){
        this.category = category;
    }
   public String toString(){
        return category;
   }


        public static void main(String[] args) {
            CategorizeBloodPressure myFrame = new CategorizeBloodPressure();
            //myFrame.setLayout(new BorderLayout());
            myFrame.setSize(350, 170);
            myFrame.setVisible(true);
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}}
