public class Main {
    static class CinemaShow {
        private final String title; private final int capacity; private int seatsAvailable;
        private static int totalBooked;
        CinemaShow(String title, int capacity) { this.title=title; this.capacity=capacity; seatsAvailable=capacity; }
        CinemaShow(String title) { this(title,100); }
        boolean book(int n) { if (n <= 0 || n > seatsAvailable) return false; seatsAvailable-=n; totalBooked+=n; return true; }
        void cancel(int n) { if (n > 0) seatsAvailable=Math.min(capacity,seatsAvailable+n); }
        int getSeatsAvailable() { return seatsAvailable; }
        static int getTotalBooked() { return totalBooked; }
    }
    public static void main(String[] args) {
        CinemaShow show = new CinemaShow("Avengers",50);
        System.out.println("Book 20: " + show.book(20) + ", seats=" + show.getSeatsAvailable());
        System.out.println("Book 25: " + show.book(25) + ", seats=" + show.getSeatsAvailable());
        System.out.println("Book 10: " + show.book(10) + ", seats=" + show.getSeatsAvailable());
        show.cancel(15); System.out.println("After cancel: " + show.getSeatsAvailable());
        System.out.println("Total booked: " + CinemaShow.getTotalBooked());
    }
}
