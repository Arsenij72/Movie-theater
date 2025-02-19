public class VipTicket extends Ticket {
    private double ticketPrice;
    private String movieTitle;
    private String seatNumber;
    private String extraBenefits;

    public VipTicket(int ticketId, int customerId, String movieTitle, String seatNumber, String extraBenefits) {
        super(ticketId, customerId);
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.ticketPrice = 20.0;
        this.extraBenefits = extraBenefits;
        getPrice();

    }

  


    @Override
    String getPrice() {
        return "VIPTicket: " + this.movieTitle+ "," + this.seatNumber + "," +this.ticketPrice + "," +this.extraBenefits;
    }
}