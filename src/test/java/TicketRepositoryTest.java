import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketRepositoryTest {

    Ticket ticket1 = new Ticket(15, 600, "MOW", "SVX", 90);
    Ticket ticket2 = new Ticket(18, 470, "MOW", "SVX", 120);
    Ticket ticket3 = new Ticket(23, 575, "SVX", "MOW", 105);
    Ticket ticket4 = new Ticket(27, 1225, "SVX", "LED", 330);
    Ticket ticket5 = new Ticket(29, 850, "LED", "MOW", 225);
    Ticket ticket6 = new Ticket(31, 875, "MOW", "LED", 220);
    Ticket ticket7 = new Ticket(34, 1250, "LED", "SVX", 340);
    Ticket ticket8 = new Ticket(198, 4450, "MOW", "RSX", 1120);
    Ticket ticket9 = new Ticket(57, 570, "MOW", "SVX", 100);
    Ticket ticket10 = new Ticket(64, 530, "MOW", "SVX", 110);
    Ticket ticket11 = new Ticket(79, 455, "MOW", "SVX", 125);

    @Test
    public void shouldTestRepoSave() {

        TicketRepository repo = new TicketRepository();

        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);

        Ticket[] expected = {ticket1, ticket2, ticket3};
        Ticket[] actual = repo.getTicket();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoFindAll() {

        TicketRepository repo = new TicketRepository();

        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);

        Ticket[] expected = {ticket1, ticket2, ticket3};
        Ticket[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoRemoveById() {

        TicketRepository repo = new TicketRepository();

        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        repo.remoteById(18);

        Ticket[] expected = {ticket1, ticket3};
        Ticket[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestRepoFindById() {

        TicketRepository repo = new TicketRepository();

        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        repo.findById(18);

        Ticket[] expected = {ticket2};
        Ticket[] actual = repo.getTicket();

        assertArrayEquals(expected, actual);
    }
}
