public class RegularTicket extends Ticket {
    private double ticketPrice;
    private String movieTitle;
    private String seatNumber;


    public RegularTicket(int ticketId, int customerId, String movieTitle, String seatNumber) {
        super(ticketId, customerId);
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.ticketPrice = 12.0;
        getPrice();

    }

    @Override
    String getPrice() {
        return "RegularTicket: " + this.movieTitle +"," + this.seatNumber + "," +this.ticketPrice;

    }
}