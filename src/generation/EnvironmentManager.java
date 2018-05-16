package generation;

import java.io.IOException;
import java.util.Stack;

public class EnvironmentManager {
    private Stack<Environment> environments;

    public EnvironmentManager() {
        this.environments = new Stack<>();
    }

    public Environment createEnvironment(int environmentSize) {
        Environment environment = new Environment(environmentSize);
        this.environments.push(environment);

        return environment;
    }

    public Environment closeEnvironment(BufferedStringBuilder code) throws IOException {
        Environment environment = this.environments.pop();
        environment.closeEnvironment(code);

        return environment;
    }

    public Environment getCurrentEnvironment() {
        return this.environments.peek();
    }
}
