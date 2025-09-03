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
        this.description = "No description";
        this.eventDay = new Date(Date.DEFAULT_MONTH, Date.DEFAULT_DAY, Date.DEFAULT_YEAR);
    }

    public HistoricalEvent(String description, Date eventDay) {
        this.description = description;
        this.eventDay = eventDay;
    }

    // MUTATORS //

    // ACCESSORS //

    // METHODS //

}
