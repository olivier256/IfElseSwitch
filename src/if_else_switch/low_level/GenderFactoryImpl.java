package if_else_switch.low_level;

import if_else_switch.high_level.Gender;
import if_else_switch.high_level.GenderFactory;

public class GenderFactoryImpl implements GenderFactory {
    @Override
    public Gender make(int x) {
        if (x == 0) return new MaleGender();
        if (x == 1) return new FemaleGender();
        return new UnknownGender();
    }
}
