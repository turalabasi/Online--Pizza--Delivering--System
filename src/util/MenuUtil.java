package util;

public class MenuUtil {
    private static MenuUtil instance;

    private MenuUtil() {

    }

    public static MenuUtil getInstance() {
        return instance == null
                ? instance = new MenuUtil() : instance;
    }

    public int mainMenu() {
        System.out.println(
                "[0]-> exit \n" +
                        "[1]-> Admin \n" +
                        "[2]-> Customer \n");


        return InputUtil.getInstance().inputByte("enter ");
    }

    public int adminMenu() {
        System.out.println(
                "[0].-> Exit \n" +
                        "[1].-> Back \n" +
                        "[2].-> AddCourier \n" +
                        "[3].-> TrackOrders \n" +
                        "[4].-> ViewCouriers  \n" +
                        "[5].->  ViewCustomers \n");


        return InputUtil.getInstance().inputInt("enter the option: ");
    }
    public  int customerMenu(){
        System.out.println(
                "[0]-> exit \n" +
                        "[1]-> Login \n" +
                        "[2]-> Sign up \n" +
                        "[3]-> Back \n");



        return InputUtil.getInstance().inputByte("enter the option");
    }
    public  int loginMenu(){
        System.out.println(
                        "[0].-> Exit \n" +
                        "[1].-> Back \n" +
                        "[2].-> Place Order \n" +
                        "[3].-> Track Orders  \n" +
                        "[4].-> Cancel Order \n" );



        return InputUtil.getInstance().inputInt("enter the option: ");
    }

    public int pizzaMenu(){
        System.out.println(
                        "[1].-> Italiano \n" +
                        "[2].-> Americano \n" +
                        "[3].-> Mexicano \n" +
                        "[4].-> Chicken Kickers  \n" +
                                "[5].-> Chicken Kickers  \n" +
                        "[6].-> Pepperoni  \n" );



        return InputUtil.getInstance().inputInt("enter the option: ");

    }
    public  int sizeMenu(){
        System.out.println(
                        "[0].-> Small \n" +
                        "[1].-> Medium \n" +
                        "[4].-> Large \n" );



        return InputUtil.getInstance().inputInt("enter the size: ");
    }

    public int sousMenu(){
        System.out.println(

                        "[1].-> Ketchup \n" +
                         "[2].-> Barbecu \n" +
                        "[3].-> Mayonnaise  " +
                        "[4].-> Cancel \n" );



        return InputUtil.getInstance().inputInt("enter the sous: ");
    }

    public  int paymentMenu(){
        System.out.println(

                "[1].-> Make the payment  \n" +
                        "[2].-> Cancel order \n" );



        return InputUtil.getInstance().inputInt("enter the payment method: ");


    }



}


