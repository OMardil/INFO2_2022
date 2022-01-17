public class Calendario {

    public static void main(String[] args) {

        String[][] calendar = createCalendar();
        addEvent(calendar, "Clase Informatica", 0, 14);

    }

    public static String[][] createCalendar() {

        int rows = 48; // 48 slots of 30 minutes in a day
        int columns = 7; // 7 days in a week

        String[][] calendar = new String[rows][columns];
        return calendar;

    }

    public static boolean addEvent(String[][] calendar, String event, int day, int time) {

        // error!
        if (calendar == null || calendar.length <= time || calendar[time].length <= day) {
            return false;
        }

        calendar[time][day] = "Event";
        return true;
    }
}