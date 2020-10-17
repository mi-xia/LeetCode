package leetCode;

/**
 * @author 邹磊
 * @version 1.0
 * @description:
 * @date 2020/10/17 13:55
 */
public class FourHundredAndNinetyFive {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries.length == 0){
            return 0;
        }

        int coutTime = duration;
        int startTime = timeSeries[0];
        int endTime = timeSeries[0] + duration;
        int i = 1;

        for (; i < timeSeries.length; i++){
            if (timeSeries[i] > endTime){
                coutTime += duration;
            } else {
                coutTime += timeSeries[i] + duration - endTime;
            }

            startTime = timeSeries[i];
            endTime = startTime + duration;
        }

        return coutTime;

    }

}
