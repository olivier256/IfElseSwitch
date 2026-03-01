package if_else_switch.high_level;

import if_else_switch.low_level.GenderFactoryImpl;
import if_else_switch.low_level.MaleGender;

/**
 * @see <a href="http://blog.cleancoder.com/uncle-bob/2021/03/06/ifElseSwitch.html">if-else-switch</a>
 */
public class Test {
    public void test() {
        GenderFactory genderFactory = new GenderFactoryImpl();
        Gender gender = genderFactory.make(0);
        assert gender instanceof MaleGender;
        assert "male".equals(gender.getLabel());
    }

    public static void main(String[] args) {
        checkEAEnabled();

        new Test().test();
    }

    private static void checkEAEnabled() {
        boolean eaEnabled = false;
        assert eaEnabled = true;
        if (!eaEnabled) {
            throw new AssertionError("launch with VM argument '-ea'");
        }
    }
}
