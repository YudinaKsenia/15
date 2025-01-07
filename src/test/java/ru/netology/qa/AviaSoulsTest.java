package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AviaSoulsTest {
    AviaSouls manager = new AviaSouls();
    Comparator <Ticket> comparator = new TicketTimeComparator();


    @Test

    public void shouldFindAndCompareOneTicket() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Saratov", 6599, 15, 18);
        Ticket ticket2 = new Ticket("Moscow", "Saint Petersburg", 9000, 11, 12);
        Ticket ticket3 = new Ticket("Belgrade", "Prague", 19800, 15, 19);
        Ticket ticket4 = new Ticket("Moscow", "Saint Petersburg", 89000, 1, 2);
        Ticket ticket5= new Ticket("Istanbul", "Rome", 63599, 7, 19);
        Ticket ticket6 = new Ticket("Saint Petersburg", "Prague", 24765, 3, 22);
        Ticket ticket7= new Ticket("Moscow", "Saint Petersburg", 8534, 23, 1);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Moscow", "Saratov", comparator);
        Ticket[] expected = {ticket1};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test

    public void shouldFindAndCompareFewTickets() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Saratov", 6599, 15, 18);
        Ticket ticket2 = new Ticket("Moscow", "Saint Petersburg", 9000, 11, 12);
        Ticket ticket3 = new Ticket("Belgrade", "Prague", 19800, 15, 19);
        Ticket ticket4 = new Ticket("Moscow", "Saint Petersburg", 89000, 1, 2);
        Ticket ticket5= new Ticket("Istanbul", "Rome", 63599, 7, 19);
        Ticket ticket6 = new Ticket("Saint Petersburg", "Prague", 24765, 3, 22);
        Ticket ticket7= new Ticket("Moscow", "Saint Petersburg", 8534, 23, 1);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Moscow", "Saint Petersburg", comparator);
        Ticket[] expected = {ticket7, ticket2, ticket4};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test

    public void shouldFindAndCompareNoTicket() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Saratov", 6599, 15, 18);
        Ticket ticket2 = new Ticket("Moscow", "Saint Petersburg", 9000, 11, 12);
        Ticket ticket3 = new Ticket("Belgrade", "Prague", 19800, 15, 19);
        Ticket ticket4 = new Ticket("Moscow", "Saint Petersburg", 89000, 1, 2);
        Ticket ticket5= new Ticket("Istanbul", "Rome", 63599, 7, 19);
        Ticket ticket6 = new Ticket("Saint Petersburg", "Prague", 24765, 3, 22);
        Ticket ticket7= new Ticket("Moscow", "Saint Petersburg", 8534, 23, 1);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Rome", "Saratov", comparator);
        Ticket[] expected = { };

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test

    public void shouldFindAndCompareOneTicketWithComparator() {

        Ticket ticket1 = new Ticket("Moscow", "Saratov", 6599, 15, 18);
        Ticket ticket2 = new Ticket("Moscow", "Saint Petersburg", 9000, 11, 12);
        Ticket ticket3 = new Ticket("Belgrade", "Prague", 19800, 15, 19);
        Ticket ticket4 = new Ticket("Moscow", "Saint Petersburg", 89000, 1, 2);
        Ticket ticket5= new Ticket("Istanbul", "Rome", 63599, 7, 19);
        Ticket ticket6 = new Ticket("Saint Petersburg", "Prague", 24765, 3, 22);
        Ticket ticket7= new Ticket("Moscow", "Saint Petersburg", 8534, 23, 1);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Moscow", "Saratov", comparator);
        Ticket[] expected = {ticket1};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test

    public void shouldFindAndCompareFewTicketsWithComparator() {

        AviaSouls manager = new AviaSouls();
        Comparator <Ticket> comparator = new TicketTimeComparator();

        Ticket ticket1 = new Ticket("Moscow", "Saratov", 6599, 15, 18);
        Ticket ticket2 = new Ticket("Moscow", "Saint Petersburg", 9000, 11, 12);
        Ticket ticket3 = new Ticket("Belgrade", "Prague", 19800, 15, 19);
        Ticket ticket4 = new Ticket("Moscow", "Saint Petersburg", 89000, 1, 2);
        Ticket ticket5= new Ticket("Istanbul", "Rome", 63599, 7, 19);
        Ticket ticket6 = new Ticket("Saint Petersburg", "Prague", 24765, 3, 22);
        Ticket ticket7= new Ticket("Moscow", "Saint Petersburg", 8534, 23, 1);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Moscow", "Saint Petersburg", comparator);
        Ticket[] expected = {ticket7, ticket2, ticket4};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test

    public void shouldFindAndCompareNoTicketWithComparator() {

        AviaSouls manager = new AviaSouls();
        Comparator <Ticket> comparator = new TicketTimeComparator();

        Ticket ticket1 = new Ticket("Moscow", "Saratov", 6599, 15, 18);
        Ticket ticket2 = new Ticket("Moscow", "Saint Petersburg", 9000, 11, 12);
        Ticket ticket3 = new Ticket("Belgrade", "Prague", 19800, 15, 19);
        Ticket ticket4 = new Ticket("Moscow", "Saint Petersburg", 89000, 1, 2);
        Ticket ticket5= new Ticket("Istanbul", "Rome", 63599, 7, 19);
        Ticket ticket6 = new Ticket("Saint Petersburg", "Prague", 24765, 3, 22);
        Ticket ticket7= new Ticket("Moscow", "Saint Petersburg", 8534, 23, 1);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Rome", "Saratov", comparator);
        Ticket[] expected = { };

        Assertions.assertArrayEquals(actual, expected);

    }
}