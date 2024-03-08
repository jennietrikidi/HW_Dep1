import java.util.Scanner;

public class Hotel {
    private String name;
    private String city;
    private int rooms;
    private int free;
public Hotel(String name, String city,int rooms, int free){
    this.name=name;
    this.city=city;
    this.rooms=rooms;
    this.free=free;
}
    public Hotel(){
      this.name=null;
      this.city=null;
      this.rooms=0;
      this.free=0;
    }
    public void setFree(int free){
    this.free=free;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setData(String name, String city, int rooms, int free){
    this.name=name;
    this.city=city;
    this.rooms=rooms;
    this.free=free;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getRooms() {
        return rooms;
    }
    public int getFree() {
        return free;
    }
    @Override
    public String toString() {
        return "Hotel's name: "+name + "\n"+"the hotel is in "+city+", and there are "+rooms
                + " that taken, and "+free+" rooms who are aviable";
    }
}
