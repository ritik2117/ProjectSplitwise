package com.splitwise.commands;

public interface Command {
    boolean matches(String string);
    void execute(String string);
}
