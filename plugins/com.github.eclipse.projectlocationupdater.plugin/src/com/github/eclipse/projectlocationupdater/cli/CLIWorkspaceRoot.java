package com.github.eclipse.projectlocationupdater.cli;

import com.github.eclipse.projectlocationupdater.cli.stubs.CLIWorkspaceRootStub;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

/**
 * Created by jeff on 6/2/15.
 */
public class CLIWorkspaceRoot extends CLIWorkspaceRootStub {

    private IPath path = null;
    private final String currentWorkspacePath;

    public CLIWorkspaceRoot(String currentWorkspacePath) {
        this.currentWorkspacePath = currentWorkspacePath;
    }

    @Override
    public IPath getLocation() {
        if (path == null) {
            path = new Path(currentWorkspacePath);
        }
        return path;
    }
}
