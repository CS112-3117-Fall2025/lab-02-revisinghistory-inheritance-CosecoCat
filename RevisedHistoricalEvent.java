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
        setRevisedDescription("No revised description");
        setCitation("No citation");
    }

    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) {
        super(description, eventDay);
        setRevisedDescription(revisedDescription);
        setCitation(citation);
    }

    // MUTATORS //

    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    // ACCESSORS //

    public String getRevisedDescription() {
        return revisedDescription;
    }

    public String getCitation() {
        return citation;
    }

    // METHODS //

    public String toString() {
        return super.toString() + ", " + revisedDescription + ", " + citation;
    }

    public boolean equals(RevisedHistoricalEvent other) {
        if (super.equals(other) && this.getRevisedDescription() == other.getRevisedDescription()
                && this.getCitation() == other.getCitation()) {
            return true;
        } else {
            return false;
        }

    }

    public void teach() {

        System.out.println("The following \"history\" was told for many years:");
        System.out.println();
        System.out.printf("On %s: %s%n%n", super.getEventDay().toString(), super.getDescription());

        System.out.println(
                "By correcting history, not just rewriting it, we are revisiting it to embark on the process of righting a wrong.\nHere is the revised history:");
        System.out.println(getRevisedDescription());
        System.out.println();
        System.out.println("Source: " + getCitation());
    }

}
