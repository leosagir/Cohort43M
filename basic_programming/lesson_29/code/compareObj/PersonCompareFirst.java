package code.compareObj;

import java.util.Comparator;

public class PersonCompareFirst implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int compareResult = person1.getAge() - person2.getAge();
        if (compareResult == 0) {
            compareResult = (-1) * person1.getName().compareTo(person2.getName());
        }
        return compareResult;
    }
}
