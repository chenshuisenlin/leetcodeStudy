package com.design_pattern.structural_pattern.decorator_pattern;

public class ChangeType implements BumbleBee {
    BumbleBee bumbleBee;
    @Override
    public void transformance() {
        bumbleBee.transformance();
    }

    public ChangeType(BumbleBee bumbleBee) {
        this.bumbleBee = bumbleBee;
    }
}
