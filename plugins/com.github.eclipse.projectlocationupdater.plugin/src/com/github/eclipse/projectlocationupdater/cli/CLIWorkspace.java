package com.github.eclipse.projectlocationupdater.cli;

import com.github.eclipse.projectlocationupdater.cli.stubs.CLIWorkspaceStub;
import org.eclipse.core.resources.IWorkspaceRoot;

/**
 * Created by jeff on 6/2/15.
 */
public class CLIWorkspace extends CLIWorkspaceStub {

    private IWorkspaceRoot root = null;

    private final String currentWorkspacePath;

    public CLIWorkspace(String currentWorkspacePath) {
        this.currentWorkspacePath = currentWorkspacePath;
    }

    @Override
    public IWorkspaceRoot getRoot() {
        if (root == null) {
            root = new CLIWorkspaceRoot(currentWorkspacePath);
        }
        return root;
    }
}
