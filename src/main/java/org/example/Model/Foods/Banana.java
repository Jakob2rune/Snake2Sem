package org.example.Model.Foods;

import org.example.Model.Food;

public class Banana extends Food {
    final static int bananaValue = 5;

    public Banana(int positionX, int positionY) {
        super(positionX, positionY, bananaValue);
    }

    @Override
    public void getsEaten() {
        System.out.println("Banana was eaten!");

    }
}
