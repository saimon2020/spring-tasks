package entity;

import enums.RoomType;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "room")
@Inheritance(strategy = InheritanceType.JOINED)
// TODO What is DiscriminatorColumn and DiscriminatorValue ?
@DiscriminatorColumn(name = "room_type")
@DiscriminatorValue(value = "room")
public class Room {
    @Column(name = "number")
    private int number;
    @Column(name = "type")
    private String type;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
