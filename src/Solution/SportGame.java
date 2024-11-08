package Solution;

public class SportGame extends Ticket implements IBooking
{
    public SportGame(int ticketNumber, String eventName, String eventLocation, String eventDate)
    {
        super(ticketNumber, eventName, eventLocation, eventDate);
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
        return noTickets * 120.0;  // price per ticket for Sport Game
    }
}
