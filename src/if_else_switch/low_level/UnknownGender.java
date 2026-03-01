package if_else_switch.low_level;

import if_else_switch.high_level.Gender;

public class UnknownGender implements Gender {
    @Override
    public String getLabel() {
        return "unknown";
    }
}
