public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Announcement var1 = new Announcement("IT-2101 General Assembly", AnnouncementCategory.EVENT, "Attendance is encouraged for all sections.", "2026-11-27");
      DeadlineAnnouncement var2 = new DeadlineAnnouncement("OOP Lab Activity 6 Submission", "Submit your Java inheritance files before the deadline.", "2026-11-27", "OOP 101", "2026-12-02");
      System.out.println("LATEST ANNOUNCEMENT:");
      var1.displayAnnouncement();
      System.out.println();
      System.out.println("DEADLINE ANNOUNCEMENT:");
      var2.displayAnnouncement();
      System.out.println();
      if (var2.getCategory() == AnnouncementCategory.DEADLINE) {
         System.out.println("Reminder: Check due date -> " + var2.getDueDate());
      } else {
         System.out.println("Regular announcement.");
      }

   }
}
