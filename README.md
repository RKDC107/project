package ceryx;

public class Announcement {
    private String title;
    private String details;
    private String category;
    private String author;
    private String date;

    public Announcement(String title, String details, String category, String author, String date) {
        this.title = title;
        this.details = details;
        this.category = category;
        this.author = author;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public void display() {
        System.out.println("=== [" + category + "] " + title + " ===");
        System.out.println("Posted by: " + author + " | Date: " + date);
        System.out.println(details);
    }
} 
