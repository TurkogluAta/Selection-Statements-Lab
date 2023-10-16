/*
* StarSignApp.java
* @author: Ata Turkoglu
* Date: 10/03/2023
*/

import javax.swing.JOptionPane;
public class StarSignApp{
    public static void main(String args[]){
        //Declare variables
        String month, sign;
        int date;

        //Declare object
        StarSign myStarSign;

        //Create object
        myStarSign = new StarSign();

        //Input
        month = JOptionPane.showInputDialog(null,"Enter your month");
        date = Integer.parseInt(JOptionPane.showInputDialog(null,"enter your date"));
        myStarSign.setMonth(month);
        myStarSign.setDate(date);

        //Process
        myStarSign.compute();

        //Output
        sign = myStarSign.getSign();
        JOptionPane.showMessageDialog(null,sign);
    }
}
