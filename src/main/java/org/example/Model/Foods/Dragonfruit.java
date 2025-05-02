package org.example.Model.Foods;

import org.example.Model.Food;

public class Dragonfruit extends Food {
    final static int DragonfruitValue = 20;

    public Dragonfruit(int positionX, int positionY) {
        super(positionX, positionY, DragonfruitValue);
    }

    @Override
    public void getsEaten() {
        System.out.println("Dragonfruit was eaten!");

    }
}
