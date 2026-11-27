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
