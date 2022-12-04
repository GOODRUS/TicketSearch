import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketManagerTest {

    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);

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
    Ticket ticket12 = new Ticket(112, 4450, "MOW", "RSX", 1120);

    @Test
    public void shouldFindSomeTickets() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);

        Ticket[] expected = {ticket11, ticket2, ticket10, ticket9, ticket1};
        Ticket[] actual = manager.searchBy("MOW", "SVX");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOnlyOneTicket() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);

        Ticket[] expected = {ticket8};
        Ticket[] actual = manager.searchBy("MOW", "RSX");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTicketNothing() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);

        Ticket[] expected = {};
        Ticket[] actual = manager.searchBy("SVX", "RSX");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTicketZero() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);

        Ticket[] expected = {ticket8, ticket12};
        Ticket[] actual = manager.searchBy("MOW", "RSX");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTicketFindById() {

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        manager.findIdTicket(33);

        Ticket[] expected = {null};
        Ticket[] actual = manager.repo.getTicket();

        assertArrayEquals(expected, actual);
    }
}
