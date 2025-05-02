package org.example.Model.Foods;

import org.example.Model.Food;

public class Apple extends Food {
    final static int AppleValue = 10;

    public Apple(int positionX, int positionY) {
        super(positionX, positionY, AppleValue); // Apple has foodValue of 10
    }

    @Override
    public void getsEaten() {
        System.out.println("Apple was eaten!");

    }

}
