package if_else_switch.high_level;

import if_else_switch.low_level.GenderFactoryImpl;
import if_else_switch.low_level.MaleGender;

public class Main {
    GenderFactory genderFactory;
    Gender gender;

    public Main() {
        genderFactory = new GenderFactoryImpl();
    }

    public void run() {
        gender = genderFactory.make(0);
    }

    public Gender getGender() {
        return gender;
    }

    public static void main(String[] args) {
        boolean aeEnabled = false;
        assert aeEnabled = true;
        if (!aeEnabled) {
            throw new AssertionError("launch with VM argument '-ea'");
        }

        Main main = new Main();
        main.run();
        Gender gender = main.getGender();
        assert gender instanceof MaleGender;
    }
}
