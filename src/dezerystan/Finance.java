/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dezerystan;

/**
 *
 * @author User
 */
public class Finance extends Roommates{

    
    
    private double RoomPricePerM;
    private double InternetPricePerM;
    private double ElectricityPricePerM;
    private double FoodPricePerM;
    String singleRoom;
    String doubleRoom;

    //pay for one year rent with utilities 
    public double payPerYear(double payPerYear1) {
        payPerYear1 = ((RoomPricePerM + InternetPricePerM + ElectricityPricePerM + FoodPricePerM) * 12);
        return payPerYear1;
    }

    public double payPerMonth() {
        double payPerMonth;

        payPerMonth = (RoomPricePerM + InternetPricePerM + ElectricityPricePerM + FoodPricePerM);

        return payPerMonth;
    }
//    
//    double  RoomPricePerM (){
//     setRoomPricePerM(250)
//        if (singleRoom == true) 
//        {
//            }
//         
//     else (doubleRoom == true) 
//             {
//                    }    
//    }
//    public double payPerMonth(double AllpayPerMonthYan , double AllpayPerMonthFeb, double AllpayPerMonthMar,
//            double AllpayPerMonthApr, double AllpayPerMonthMa, double AllpayPerMonthYui, double AllpayPerMonthYul, double AllpayPerMonthAout,
//            double AllpayPerMonthSep, double AllpayPerMonthOct, double AllpayPerMonthNov, double AllpayPerMonthDec)
//    {
//       double a ;
//    return a;   
//    }

    /**
     * @return the RoomPricePerM
     */
    /**
     * @return the FoodPricePerM
     */
    public double getFoodPricePerM() {
        return FoodPricePerM;
    }

    /**
     * @param FoodPricePerM the FoodPricePerM to set
     */
    public void setFoodPricePerM(double FoodPricePerM) {
        this.FoodPricePerM = FoodPricePerM;
    }

    public double getRoomPricePerM() {
        return RoomPricePerM;
    }

    /**
     * @param RoomPricePerM the RoomPricePerM to set
     */
    public void setRoomPricePerM(double RoomPricePerM) {
        this.RoomPricePerM = RoomPricePerM;
        if (RoomPricePerM <= 250) {
            System.out.println("Single Room");
        } else {
            System.out.println("Double Room");
        }

    }

    /**
     * @return the InternetPricePerM
     */
    public double getInternetPricePerM() {
        return InternetPricePerM;
    }

    /**
     * @param InternetPricePerM the InternetPricePerM to set
     */
    public void setInternetPricePerM(double InternetPricePerM) {
        this.InternetPricePerM = InternetPricePerM;
    }

    /**
     * @return the ElectricityPricePerM
     */
    public double getElectricityPricePerM() {
        return ElectricityPricePerM;
    }

    /**
     * @param ElectricityPricePerM the ElectricityPricePerM to set
     */
    public void setElectricityPricePerM(double ElectricityPricePerM) {
        this.ElectricityPricePerM = ElectricityPricePerM;
    }

}
