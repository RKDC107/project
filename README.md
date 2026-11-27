public enum AnnouncementCategory {
    EVENT,
    DEADLINE,
    FEES
}

public class Announcement {
    private String title;
    protected AnnouncementCategory category;
    private String details;
    private String datePosted;

    public Announcement(String title, AnnouncementCategory category, String details, String datePosted) {
        this.title = title;
        this.category = category;
        this.details = details;
        this.datePosted = datePosted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AnnouncementCategory getCategory() {
        return category;
    }

    public void setCategory(AnnouncementCategory category) {
        this.category = category;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public void displayAnnouncement() {
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Date Posted: " + datePosted);
        System.out.println("Details: " + details);
    }
}
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
public class Main {
    public static void main(String[] args) {
        Announcement eventNotice = new Announcement(
            "IT-2101 General Assembly",
            AnnouncementCategory.EVENT,
            "Attendance is encouraged for all sections.",
            "2026-11-27"
        );

        DeadlineAnnouncement labDeadline = new DeadlineAnnouncement(
            "OOP Lab Activity 6 Submission",
            "Submit your Java inheritance files before the deadline.",
            "2026-11-27",
            "OOP 101",
            "2026-12-02"
        );

        System.out.println("LATEST ANNOUNCEMENT:");
        eventNotice.displayAnnouncement();
        System.out.println();

        System.out.println("DEADLINE ANNOUNCEMENT:");
        labDeadline.displayAnnouncement();
        System.out.println();

        if (labDeadline.getCategory() == AnnouncementCategory.DEADLINE) {
            System.out.println("Reminder: Check due date -> " + labDeadline.getDueDate());
        } else {
            System.out.println("Regular announcement.");
        }
    }
}
