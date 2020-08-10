package io.greycat;

import io.greycat.impl.GreyCatParseException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface Function extends Object {

    String name();

    Function then(String content) throws IOException, GreyCatParseException;

    Function then(File f) throws IOException, GreyCatParseException;

    Function then(InputStream stream) throws IOException, GreyCatParseException;

    Function then(FunctionBody sub_body);

    Function then(Function sub);

    /**
     * <p>Executes the function on a newly created context.</p>
     * <p><strong>This method handles the context unmarking for you.</strong></p>
     * 
     * @return the same function in order to give you the possibility to directly
     *         <code>unmark</code> it.
     */
    Function execute();

    /**
     * <p>Executes the function on a newly created context.</p>
     * <p><strong>It is up to you to unmark the context when you are done with it.</strong></p>
     * 
     * @param cb called when your flow is done executing
     * @return the same function in order to give you the possibility to directly
     *         <code>unmark</code> it.
     */
    Function execute(ExecutionCallback cb);

    /**
     * <p>Executes the function on the given context, or a newly created one if <code>null</code>.</p>
     * <p><strong>It is up to you to unmark the context when you are done with it.</strong></p>
     * 
     * @param context the context to execute the function on (if <code>null</code>,
     *                a new one will be created for you)
     * @param cb      called when your flow is done executing
     * @return the same function in order to give you the possibility to directly
     *         <code>unmark</code> it.
     */
    Function execute(Context context, ExecutionCallback cb);
}
