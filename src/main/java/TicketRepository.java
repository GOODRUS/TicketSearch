import java.util.Comparator;

public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];

    public Ticket[] findAllComparator(String from, String to, Comparator<Ticket> comparator) {
        return tickets;
    }

    public Ticket[] findAll(String from, String to) {
        return tickets;
    }

    public Ticket[] getTicket() {
        return tickets;
    }

    public void save(Ticket product) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = product;
        tickets = tmp;
    }

    public void remoteById(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyToIndex = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[copyToIndex] = ticket;
                copyToIndex++;
            }
        }
        tickets = tmp;
    }

    public Ticket findById(int id) {
        Ticket[] tmp = new Ticket[tickets.length - (tickets.length - 1)];
        int copyToIndex = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                tmp[copyToIndex] = ticket;
                copyToIndex++;
            }
        }
        tickets = tmp;
        return null;
    }

    public Ticket[] findAllComparator() {
        return tickets;
    }

    public Ticket[] findAll() {
        return tickets;
    }
}

