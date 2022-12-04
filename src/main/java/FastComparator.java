import java.util.Comparator;

public class FastComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.getTimeWay() > o2.getTimeWay()) {
            return 1;
        } else if (o1.getTimeWay() < o2.getTimeWay()) {
            return -1;
        } else {
            return 0;
        }
    }
}
