package model;

public class Book {
    private int id;
    private String title;
    private Author author;
    private Category category;
    private int year;
    private String location;
    private String description;
    private boolean available;
    private long createdAt; // timestamp ms

    public Book() { this.createdAt = System.currentTimeMillis(); }

    public Book(int id, String title, Author author, Category category, int year,
                String location, String description, boolean available) {
        this.id = id; this.title = title; this.author = author; this.category = category;
        this.year = year; this.location = location; this.description = description;
        this.available = available; this.createdAt = System.currentTimeMillis();
    }

    // getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
    public long getCreatedAt() { return createdAt; }

    public void copyFrom(Book other) {
        if (other.title != null && !other.title.isEmpty()) this.title = other.title;
        if (other.author != null) this.author = other.author;
        if (other.category != null) this.category = other.category;
        if (other.year != 0) this.year = other.year;
        if (other.location != null) this.location = other.location;
        if (other.description != null) this.description = other.description;
        this.available = other.available;
    }

    @Override
    public String toString() {
        String t = title != null ? (title.length() > 36 ? title.substring(0,33)+"..." : title) : "-";
        String a = author != null ? author.getName() : "-";
        String c = category != null ? category.getName() : "-";
        return String.format("%-3d | %-36s | %-16s | %-12s | %4d | %s",
                id, t, a, c, year, available ? "Yes" : "No");
    }

    public String toDetailedString() {
        return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + (author!=null?author.getName():"-")
                + "\nCategory: " + (category!=null?category.getName():"-")
                + "\nYear: " + year + "\nLocation: " + location
                + "\nAvailable: " + (available ? "Yes" : "No")
                + "\nDescription: " + (description != null ? description : "-");
    }
}
