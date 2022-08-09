package lesson4.drill5;

import java.util.Comparator;

public class DriverSortingComparator implements Comparator<Driver> {
    @Override
    public int compare(Driver o1, Driver o2) {
        if(o1.getYears() > o2.getYears()) return 1;
        if(o1.getYears() < o2.getYears()) return -1;
        return o1.getName().compareTo(o2.getName());
    }

}
