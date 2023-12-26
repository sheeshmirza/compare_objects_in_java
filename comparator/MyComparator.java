package comparator;

import java.util.Comparator;

// the Comparator interface is used to define custom ordering of objects.
// it allows you to define multiple ways of comparing objects, and you can create separate classes to implement different comparison logic.
// the Comparator interface has one method: compare(Object obj1, Object obj2), which compares two objects for order.

public class MyComparator implements Comparator<Phone> {

    public int compare(Phone p1, Phone p2) {

        // if greater return > 0
        if (p1.getYear() > p2.getYear()) {
            return 1;
        }

        // if smaller return < 0
        if (p1.getYear() < p2.getYear()) {
            return -1;
        }

        // if equals return 0
        return 0;
    }
}