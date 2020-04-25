import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.TimeUnit;

class LatencyServer {

  private static AtomicInteger count = new AtomicInteger();

  public static long get() {
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (Exception e) {
      throw new RuntimeException("time probs brah");
    }
    return count.getAndIncrement();
  }

}
