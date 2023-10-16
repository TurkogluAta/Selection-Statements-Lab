/*
* StarSign.java
* @author: Ata Turkoglu
* Date: 10/03/2023
*/

public class StarSign{
    //Declare data members all of them need to be private
    private String month;
    private int date;
    private String sign;

    //Constructor 
    public void StarSign(){
        month = "";
        date = 0;
        sign = "";
    }

    //Setters - one for every input
    public void setMonth(String month){
        this.month = month;
    }
    public void setDate(int date){
        this.date = date;
    }

    //Compute method
    public void compute(){
        //I used to switch statement for 12 different case and for the default.
        //I used .toLowerCase to make the switch, case insensitive by converting it to lowercase.
        switch(month.toLowerCase()){
            //I write the month with lower case because I use .toLowerCase
            case "january":
                //I used if statement for date
                //For example right here, if your date greater than or equal to 1 and if your date less than or equal to 19
                if(date>=1 && date<=19){
                    sign = "Capricorn";
                }
                //And here, if your date greater than or equal to 20 and if your date less than or equal to 31
                else if(date>=20 && date<=31){
                    sign = "Aquarius";
                }
                //This is for Invalid date
                else{
                    sign = "Invalid date";
                }
                break;
            case "february":
                if(date>=1 && date<=18){
                    sign = "Aquarius";
                }
                else if(date>=19 && date<=28){
                    sign = "Pisces";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "march":
                if(date>=1 && date<=20){
                    sign = "Pisces";
                }
                else if(date>=21 && date<=31){
                    sign = "Aries";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "april":
                if(date>=1 && date<=19){
                    sign = "Aries";
                }
                else if(date>=20 && date<=30){
                    sign = "Taurus";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "may":
                if(date>=1 && date<=20){
                    sign = "Taurus";
                }
                else if(date>=21 && date<=31){
                    sign = "Gemini";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "june":
                if(date>=1 && date<=20){
                    sign = "Gemini";
                }
                else if(date>=21 && date<=30){
                    sign = "Cancer";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "july":
                if(date>=1 && date<=22){
                    sign = "Cancer";
                }
                else if(date>=23 && date<=31){
                    sign = "Leo";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "august":
                if(date>=1 && date<=22){
                    sign = "Leo";
                }
                else if(date>=23 && date<=31){
                    sign = "Virgo";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "september":
                if(date>=1 && date<=22){
                    sign = "Virgo";
                }
                else if(date>=23 && date<=30){
                    sign = "Libra";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "october":
                if(date>=1 && date<=22){
                    sign = "Libra";
                }
                else if(date>=23 && date<=31){
                    sign = "Scorpio";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "november":
                if(date>=1 && date<=21){
                    sign = "Scorpio";
                }
                else if(date>=22 && date<=30){
                    sign = "Sagittarius";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            case "december":
                if(date>=1 && date<=21){
                    sign = "Sagittarius";
                }
                else if(date>=22 && date<=30){
                    sign = "Capricorn";
                }
                else{
                    sign = "Invalid date";
                }
                break;
            default:
                //This is for Invalid month
                sign = "Invalid month";
                break;
        }
    }

    //Getter
    public String getSign(){
        return sign;
    }
}
