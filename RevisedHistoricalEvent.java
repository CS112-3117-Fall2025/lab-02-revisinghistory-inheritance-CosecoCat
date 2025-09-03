/*  RevisedHistoricalEvent
 * - description : String
 * - eventDay : Date
 */
public class RevisedHistoricalEvent extends HistoricalEvent {

    // INSTANCE VARIABLES //

    private HistoricalEvent event;
    private String revisedDescription, citation;

    // CONSTRUCTORS //

    public RevisedHistoricalEvent() {
        this.event = new HistoricalEvent();
        this.revisedDescription = "No description";
        this.citation = "No citation";
    }

    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        this.event = new HistoricalEvent(description, eventDay);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    // MUTATORS //

    // ACCESSORS //

    // METHODS //

    public void teach() {

        System.out.println("The following \"history\" was told for many years:");
        System.out.println();
        System.out.printf("On %s: %s%n%n", event.getEventDay().toString(), event.getDescription());

        System.out.println(
                "By correcting history, not just rewriting it, we are revisiting it to embark on the process of righting a wrong.\nHere is the revised history:");
        System.out.println(revisedDescription);
        System.out.println();
        System.out.println("Source: " + citation);
    }

}
