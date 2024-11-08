package Solution;

public abstract class Ticket
{
    protected int ticketNumber;    // changed from private to protected
    protected String eventName;    // changed from private to protected
    protected String eventLocation; // changed from private to protected
    protected String eventDate;    // changed from private to protected

    public Ticket(int ticketNumber, String eventName, String eventLocation, String eventDate)
    {
        this.ticketNumber = ticketNumber;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
    }

    public int getTicketNumber()
    {
        return ticketNumber;
    }

    public String getEventName()
    {
        return eventName;
    }

    public String getEventLocation()
    {
        return eventLocation;
    }

    public String getEventDate()
    {
        return eventDate;
    }

    public abstract void setEventLocation(String eventLocation);
}
