package com.mypack;

// Non-public (package-private) class: accessible only inside 'mypack'
class InternalHelper {
    void assist() {
        System.out.println("Helping internally inside mypack.");
    }
}

// Public class: accessible from outside 'mypack'
public class Service {
    public void execute() {
        InternalHelper helper = new InternalHelper();
        helper.assist();
        System.out.println("Public service executed.");
    }
}
