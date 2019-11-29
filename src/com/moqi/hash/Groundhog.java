package com.moqi.hash;

// equalshashcode/Groundhog.java
// Looks plausible, but doesn't work as a HashMap key
public class Groundhog {
    protected int number;
    public Groundhog(int n) { number = n; }
    @Override
    public String toString() {
        return "Groundhog #" + number;
    }
}


/* Output:
Groundhog #3: Six more weeks of Winter!
Groundhog #0: Early Spring!
Groundhog #8: Six more weeks of Winter!
Groundhog #6: Early Spring!
Groundhog #4: Early Spring!
Groundhog #2: Six more weeks of Winter!
Groundhog #1: Early Spring!
Groundhog #9: Early Spring!
Groundhog #5: Six more weeks of Winter!
Groundhog #7: Six more weeks of Winter!
Looking up prediction for Groundhog #3
Key not found: Groundhog #3
*/