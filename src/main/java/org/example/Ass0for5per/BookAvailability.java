package org.example.Ass0for5per;

public class BookAvailability {
    private boolean available;
    public BookAvailability(boolean available){
        this.available = available;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
