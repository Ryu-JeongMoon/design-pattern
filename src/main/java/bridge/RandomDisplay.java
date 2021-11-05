package bridge;

import java.util.Random;

public class RandomDisplay extends Display{

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        Random random = new Random();
        int randomInt = random.nextInt(times);

        open();
        for (int i = 0; i < randomInt; i++) {
            print();
        }
        close();
    }
}
