package ch7.moving.features.between.objects;

import java.util.Date;

public class IntroduceLocalExtension {

    public class MfDateSub extends Date {

        public MfDateSub nextDay() {
            return null;
        }

        public int dayOfYear() {
            return 0;
        }
    }

    public class MfDateWrap {

        private Date original;
    }
}
