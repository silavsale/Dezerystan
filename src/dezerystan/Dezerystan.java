//Project about dezerystam citizens
package dezerystan;

/**
 *
 * @author User
 */
public class Dezerystan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Finance Sergiy = new Finance();
        //Roommates Sergiy = new Finance();

        Sergiy.setElectricityPricePerM(50);
        Sergiy.setInternetPricePerM(9);
        Sergiy.setRoomPricePerM(250);
        Sergiy.setFoodPricePerM(40);
        Sergiy.setName("Sergiy");
        Sergiy.setAge(37);
        Sergiy.setCountryOfBirth("Ukraine");
        Sergiy.setFloorOfLivingRoom(2);

        System.out.println("He " + Sergiy.getAge() + " old \nhes Name of person ho live in Dezerystan " + Sergiy.getName() + " from " + Sergiy.getCountryOfBirth() + " \npay monthly for room with utility " + Sergiy.payPerMonth()
                + " \nand pay per year " + Sergiy.payPerYear(0));

    }

}
