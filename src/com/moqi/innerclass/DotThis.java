package com.moqi.innerclass;

// innerclasses/DotThis.java
// Accessing the outer-class object
public class DotThis {
    private void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this"
        }
    }

    private Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}