/*  RevisedHistoricalEvent
 * - revisedDescription : String
 * - citation : String
 */
public class RevisedHistoricalEvent extends HistoricalEvent {

    // INSTANCE VARIABLES //

    private String revisedDescription, citation;

    // CONSTRUCTORS //

    public RevisedHistoricalEvent() {
        super("No description", new Date());
        this.revisedDescription = "No description";
        this.citation = "No citation";
    }

    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    // MUTATORS //

    // ACCESSORS //

    // METHODS //

    public void teach() {

        System.out.println("The following \"history\" was told for many years:");
        System.out.println();
        System.out.printf("On %s: %s%n%n", super.getEventDay().toString(), super.getDescription());

        System.out.println(
                "By correcting history, not just rewriting it, we are revisiting it to embark on the process of righting a wrong.\nHere is the revised history:");
        System.out.println(revisedDescription);
        System.out.println();
        System.out.println("Source: " + citation);
    }

}
