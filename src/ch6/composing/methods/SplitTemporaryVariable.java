package ch6.composing.methods;

public class SplitTemporaryVariable {

    private double primaryForce;
    private double mass;
    private int delay;

    public double getDistanceTravelled(int time) {
        return getPrimaryAcc(time) + getSecondaryAcc(time);
    }

    private double getPrimaryAcc(int time) {
        return 0.5 * primaryForce / mass *
                Math.pow(Math.min(time, delay), 2);
    }

    private double getSecondaryAcc(int time) {
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryForce / mass * delay;
            return primaryVel * secondaryTime
                    + 0.5 * (primaryVel * secondaryTime) / mass * Math.pow(secondaryTime, 2);
        }
        else {
            return 0.0;
        }
    }
}
