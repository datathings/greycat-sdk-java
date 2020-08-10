package io.greycat;

@FunctionalInterface
public interface ErrorCallback {

  /**
   * Called when an exception occurred when executing a context
   * TODO move this in try/catch in the Function API
   * @param reason GreyCat runtime error reason
   * @param stack GreyCat runtime error stack
   */
  void on(final String reason, final String stack);
}