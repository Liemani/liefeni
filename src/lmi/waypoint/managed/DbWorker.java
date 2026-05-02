package lmi.waypoint.managed;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class DbWorker {
  private final BlockingQueue<SaveRequest> saveQueue = new LinkedBlockingQueue<>();
  private final SaveApplier saveApplier;
  private final Thread thread;

  public DbWorker(SaveApplier saveApplier) {
    this.saveApplier = saveApplier;
    this.thread = new Thread(this::_run, "Waypoint DB Worker");
    this.thread.setDaemon(true);
    this.thread.start();
  }

  public void submit(ManagedObjectContext context, SaveBatch batch) {
    saveQueue.offer(new SaveRequest(context, batch));
  }

  private void _run() {
    while (true) {
      try {
        SaveRequest request = saveQueue.take();
        try {
          saveApplier.apply(request.batch);
          request.context.onSaveSucceeded(request.batch);
        } catch (Exception e) {
          request.context.onSaveFailed(request.batch);
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        return;
      }
    }
  }

  @FunctionalInterface
  public interface SaveApplier {
    void apply(SaveBatch batch) throws Exception;
  }

  private static final class SaveRequest {
    private final ManagedObjectContext context;
    private final SaveBatch batch;

    private SaveRequest(ManagedObjectContext context, SaveBatch batch) {
      this.context = context;
      this.batch = batch;
    }
  }
}
