public class SwitchTraining {
    public static void main(String[] args) {

    }

    public static int check(String alarmLevel){

        switch (alarmLevel){
            case "rot":
                System.out.println("keine Personen erlaubt");
                return 0;
            case "gelb":
                System.out.println("max 30 Personen erlaubt");
                return 30;
            case "grün":
                System.out.println("max 60 Personen erlaubt");
                return 60;
            default:
                System.out.println("keine Personen erlaubt");
                return 0;
        }

    }
}
