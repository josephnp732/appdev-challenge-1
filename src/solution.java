import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) throws ScriptException, IOException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your arithmetic expression: ");
        String equation = reader.readLine();
        System.out.print("\nThe Answer is: ");
        System.out.println(engine.eval(equation));
    }
}
