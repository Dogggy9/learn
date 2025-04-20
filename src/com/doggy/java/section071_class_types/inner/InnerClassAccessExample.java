package com.doggy.java.section071_class_types.inner;

import com.doggy.java.section071_class_types.OuterWithNotStaticInner;
import com.doggy.java.section071_class_types.OuterWithStaticInner;

public class InnerClassAccessExample {

    public static void main(String[] args) {
        OuterWithStaticInner.Inner inner = new OuterWithStaticInner.Inner();

        OuterWithNotStaticInner outer = new OuterWithNotStaticInner();
        OuterWithNotStaticInner.Inner o = outer.new Inner();
    }
}
