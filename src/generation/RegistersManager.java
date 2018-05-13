package generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RegistersManager {
    private List<Boolean> registersState;
    private int min;
    private int max;
    private Stack<Integer> returnRegisters;

    public RegistersManager(int min, int max) {
        this.registersState = new ArrayList<>(max - min + 1);
        this.min = min;
        this.max = max;
        this.returnRegisters = new Stack<>();

        for(int i = 0; i < max - min + 1; i++) {
            this.registersState.add(false);
        }

        System.out.println();
    }

    public int getFreeRegister() {
        int freeRegister = -1;

        for(int i = 0; i < this.registersState.size(); i++) {
            if(!this.registersState.get(i)) {
                freeRegister = i + this.min;
                break;
            }
        }

        return freeRegister;
    }

    public void useRegister(int register) {
        this.registersState.set(register - this.min, true);
    }

    public void freeRegister(int register) {
        this.registersState.set(register - this.min, false);
    }

    public int setReturnRegister() {
        int register = this.getFreeRegister();
        this.useRegister(register);
        this.returnRegisters.push(register);

        return register;
    }

    public int getReturnRegister() {
        int register = this.returnRegisters.pop();
        this.freeRegister(register);

        return register;
    }
}
