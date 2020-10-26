package javaTest;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 邹磊
 * @version 1.0
 * @description:
 * @date 2020/10/26 20:45
 */

public class ScheduledThreadPoolExecutorTest {

    /**
     * 员工会员权益过期主线程
     *
     * @return 是否成功
     */
    public void staffRightsExpire() {
        try {
            List<Long> memberIdList = Arrays.asList(1L,2L,3L);
            // 每线程处理会员ID列表数量
            int sizePerThread = 1;
            //线程数
            int threadSize = (memberIdList.size() / sizePerThread) + 1;
            ThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                    threadSize,
                    new ThreadFactoryBuilder().setNameFormat("staff-rights-expire-thread-%d").build());
            List<List<Long>> partition = Lists.partition(memberIdList, sizePerThread);
            CountDownLatch countDownLatch = new CountDownLatch(partition.size());

            partition.forEach(memberIds -> {
                StaffRightsExpireScheduleThread expireScheduleThread = new StaffRightsExpireScheduleThread(memberIds, countDownLatch);
                executor.execute(expireScheduleThread);
            });
            countDownLatch.await();
        } catch (Exception e) {
        }
    }

    /**
     * 线程任务:遍历会员ID执行权益过期逻辑
     */
    private class StaffRightsExpireScheduleThread implements Runnable {
        private CountDownLatch countDownLatch;
        private List<Long> memberIdList;

        public StaffRightsExpireScheduleThread(List<Long> memberIdList, CountDownLatch countDownLatch) {
            this.memberIdList = memberIdList;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println(memberIdList);
            countDownLatch.countDown();
        }
    }

}
