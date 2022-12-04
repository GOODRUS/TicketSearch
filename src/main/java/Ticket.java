public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int timeWay;

    public Ticket(int id, int price, String from, String to, int timeWay) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.timeWay = timeWay;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getTimeWay() {
        return timeWay;
    }

    @Override
    public int compareTo(Ticket ticketPrice) {
        if (this.price > ticketPrice.getPrice()) {
            return 1;
        }
        if (this.price < ticketPrice.getPrice()) {
            return -1;
        }
        return 0;
    }
}
