package dto;

import java.util.List;

public class BookingDto {
    private List<SlotDto> slot;
    private ClientDto client;
    private int price;
    private FeedbackDto feedback;

    public List<SlotDto> getSlot() {
        return slot;
    }

    public void setSlot(List<SlotDto> slot) {
        this.slot = slot;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public FeedbackDto getFeedback() {
        return feedback;
    }

    public void setFeedback(FeedbackDto feedback) {
        this.feedback = feedback;
    }
    
}
