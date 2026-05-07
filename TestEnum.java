enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class TestEnum{
    public static void main(String[] args) {
     Day today = Day.WEDNESDAY;
        switch (today) {
            case WEDNESDAY:
                System.out.println("mid week");
                break;
                case THURSDAY:
                System.out.println("mid week");
                break;
                case FRIDAY:
                System.out.println("end of week");
                break;
                case SATURDAY:
                System.out.println("it's weekends");
                break;
                case SUNDAY:
                System.out.println("it's weekends");
                break;
        }
    }
}