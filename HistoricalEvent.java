/*  HistoricalEvent
 * - description : String
 * - eventDay : Date
 */
public class HistoricalEvent {

    // INSTANCE VARIABLES //

    private String description;
    private Date eventDay;

    // CONSTRUCTORS //

    public HistoricalEvent() {
        setDescription("No description");
        setEventDay(new Date());
    }

    public HistoricalEvent(String description, Date eventDay) {
        setDescription(description);
        setEventDay(eventDay);
    }

    // MUTATORS //

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEventDay(Date eventDay) {
        this.eventDay = eventDay;
    }

    // ACCESSORS //

    public String getDescription() {
        return description;
    }

    public Date getEventDay() {
        return eventDay;
    }

    // METHODS //

    public String toString() {
        return getDescription() + ", " + getEventDay().toString();
    }

    public boolean equals(HistoricalEvent other) {
        if (this.description == other.description && this.eventDay == other.eventDay) {
            return true;
        }
        return false;
    }
}
