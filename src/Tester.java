public class Tester {
    public static void main(String[] args) {

        for(int i = 0; i < Month.values().length; i++){
            System.out.println("-----------------------");

            if(Month.values()[i].toString().endsWith("Y"))
                System.out.println(Month.values()[i].toString().toLowerCase() + " ends with y");
            else
                System.out.println(Month.values()[i].toString().toLowerCase() + " doesn't ends with y");

        }
    }
}
