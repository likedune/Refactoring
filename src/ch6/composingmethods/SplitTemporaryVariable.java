package ch6.composingmethods;

public class SplitTemporaryVariable {

    private double primaryForce;
    private double mass;
    private int delay;

    public double getDistanceTravelled(int time) {
        double result;
        final double primaryAcc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);

        result = 0.5 * primaryAcc * primaryTime + primaryTime;

        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * delay;
            final double secondaryAcc = (primaryVel * secondaryTime) / mass;

            result += primaryVel * secondaryTime
                    + 0.5 * secondaryAcc * secondaryTime *secondaryTime;
        }
        return result;
    }
}
