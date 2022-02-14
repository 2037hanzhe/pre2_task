package pre2Task1;

public class Bottle {
    private int id;
    private String name;
    private long price;
    private double capacity;
    private boolean filled = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Bottle(int id, String name, long price, double capacity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "The bottle's id is " + id +
                ", name is " + name +
                ", capacity is " + capacity +
                ", filled is " + filled + '.'
                ;
    }
}
