public class DeadlineAnnouncement extends Announcement {
    private String subject;
    private String dueDate;

    public DeadlineAnnouncement(String title, String details, String datePosted, String subject, String dueDate) {
        super(title, AnnouncementCategory.DEADLINE, details, datePosted);
        this.subject = subject;
        this.dueDate = dueDate;
    }

    public String getSubject() {
        return subject;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public void displayAnnouncement() {
        super.displayAnnouncement();
        System.out.println("Subject: " + subject);
        System.out.println("Due Date: " + dueDate);
    }
}
