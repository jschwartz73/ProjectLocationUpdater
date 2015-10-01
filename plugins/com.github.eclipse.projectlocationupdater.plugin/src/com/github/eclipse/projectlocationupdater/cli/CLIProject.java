package com.github.eclipse.projectlocationupdater.cli;

import com.github.eclipse.projectlocationupdater.cli.stubs.CLIProjectStub;
import com.github.eclipse.projectlocationupdater.cli.stubs.CLIWorkspaceStub;
import org.eclipse.core.resources.*;

/**
 * Created by jeff on 5/29/15.
 */
public class CLIProject extends CLIProjectStub {

    private IWorkspace workspace = null;
    private final String currentWorkspacePath;

    public CLIProject(String currentWorkspacePath) {
        this.currentWorkspacePath = currentWorkspacePath;
    }

    @Override
    public IWorkspace getWorkspace() {
        if (workspace == null) {
            workspace = new CLIWorkspace(currentWorkspacePath);
        }
        return workspace;
    }

    @Override
    public String getName() {
        return "My project name";
    }
}
