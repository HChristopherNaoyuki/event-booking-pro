package Solution;

public class Musicals extends Ticket implements IBooking
{
    private boolean refreshmentsServed;

    public Musicals(int ticketNumber, String eventName, String eventLocation, String eventDate)
    {
        super(ticketNumber, eventName, eventLocation, eventDate);
        this.refreshmentsServed = true;  // assuming refreshments are served for musicals
        setEventLocation(eventLocation);
    }

    @Override
    public void setEventLocation(String eventLocation)
    {
        super.eventLocation = eventLocation;
    }

    @Override
    public double calculateBooking(int noTickets)
    {
        return noTickets * 250.0;  // price per ticket for Musical
    }

    public boolean isRefreshmentsServed()
    {
        return refreshmentsServed;
    }
}
