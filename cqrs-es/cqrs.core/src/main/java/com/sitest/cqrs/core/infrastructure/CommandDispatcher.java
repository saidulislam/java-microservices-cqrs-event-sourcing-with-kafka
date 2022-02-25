package com.sitest.cqrs.core.infrastructure;

import com.sitest.cqrs.core.commands.BaseCommand;
import com.sitest.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
