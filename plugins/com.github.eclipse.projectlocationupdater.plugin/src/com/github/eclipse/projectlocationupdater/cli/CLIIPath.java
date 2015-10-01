package com.github.eclipse.projectlocationupdater.cli;

import com.github.eclipse.projectlocationupdater.cli.stubs.CLIIPathStub;

/**
 * Created by jeff on 6/2/15.
 */
public class CLIIPath extends CLIIPathStub {
    private final String currentWorkspacePath;

    public CLIIPath(String currentWorkspacePath) {
        this.currentWorkspacePath = currentWorkspacePath;
    }

    public Object clone() {return null;}
}
