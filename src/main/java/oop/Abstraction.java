package oop;

// hiding implementation details and showing only intended functionality to the user
// in an attempt to ease of use of the object between various concrete types
// Interfaces is implemented | abstract class is extended
// Implement multiple interfaces | can only extend one abstract class
// Interfaces usually describe behavior (can-be)| abstract classes usually describe state/type (is-a)

public class Abstraction {
    public static void main(String[] args) {

    }

}

abstract class Property {
    protected String address;
    public double value;

    abstract double determineValue();

    public String getLocation() {
        return this.address;
    }
}

class House extends Property implements Rentable {

    @Override
    public double determineValue() {
        return this.value;
    }
    public double getMonthlyRentCost() {
        return this.value / 24;
    }
}

interface Rentable {
    double getMonthlyRentCost();
}