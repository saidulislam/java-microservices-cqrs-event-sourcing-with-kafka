package com.sitest.account.cmd.api.commands;

import com.sitest.account.common.dto.AccountType;
import com.sitest.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}