package com.yzh.behaviour.command;

/**
 * @Author yzh
 * @Date 2020/4/23 16:55
 * @Version 1.0
 */
public interface Command {
    void execute();
}
class ConcreteCommand implements Command{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}