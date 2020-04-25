import java.util.concurrent.CompletableFuture;

class Main {
  public static void main(String[] args) {
    while(true) {
      CompletableFuture.runAsync(() -> System.out.println(LatencyServer.get()));
    }
  }
}