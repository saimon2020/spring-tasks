package dto;

import java.util.List;

public class Booking {
    List<Slot> slot;
    Client client;
    int price;
    Feedback feedback;

    public List<Slot> getSlot() {
        return slot;
    }

    public void setSlot(List<Slot> slot) {
        this.slot = slot;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
    
}
