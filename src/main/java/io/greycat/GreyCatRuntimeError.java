package io.greycat;

public class GreyCatRuntimeError {

    private final String reason;

    private final String stack;

    public GreyCatRuntimeError(String reason, String stack) {
        this.reason = reason;
        this.stack = stack;
    }

    public String getReason() {
        return reason;
    }

    public String getStack() {
        return stack;
    }

}
