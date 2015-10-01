package com.github.eclipse.projectlocationupdater.cli;

import com.github.eclipse.projectlocationupdater.LocationUpdater;
import org.eclipse.core.internal.resources.*;
import org.eclipse.core.internal.runtime.InternalPlatform;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

/**
 * Created by jeff on 5/28/15.
 */
public class Main {

    // JSS - TEMP - Duped for testing purposes
    private static final IPath WORKSPACE_PROJECT_SETTINGS_RELPATH = new Path(".metadata/.plugins/org.eclipse.core.resources/.projects"); //$NON-NLS-1$

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to the Eclipse project renamer");

        String tmpWorkspace = "/Users/jeff/deleteme/eclipse/tmp";
        IPath tmpWorkspacePath = new Path(tmpWorkspace);

        String currentWorkspace = "/Users/jeff/dev/i911/workspace-cadtng.old";
        IPath currentWorkspacePath = new Path(currentWorkspace);

        InternalPlatform p = InternalPlatform.getDefault();

        System.out.println(p);
        System.out.println(p.getBundleContext());

        IProject project = new CLIProject(currentWorkspace);
//
//        IPath workspaceLocation = project.getWorkspace().getRoot().getLocation();
//
//        workspaceLocation.append(WORKSPACE_PROJECT_SETTINGS_RELPATH)
//                .append(project.getName()).append(".location"); //$NON-NLS-1$


        Workspace workspace = new Workspace();
//        Resource resource = new Resource() {
//            @Override
//            public int getType() {
//                return 0;
//            }
//        }
//        IProject p2 = new Project(currentWorkspacePath, workspace);

//
//        WorkspaceDescriptionReader wReader = new WorkspaceDescriptionReader();
//        WorkspaceDescription wd = (WorkspaceDescription) wReader.read(currentWorkspacePath, tmpWorkspacePath);
//        IProject[] projects = wd.getReferencedProjects();



//        ProjectDescriptionReader reader = new ProjectDescriptionReader();
//        ProjectDescription pd = reader.read(currentWorkspacePath);
//        IProject[] projects = pd.getReferencedProjects();

//        for (IProject project : projects) {

//        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(currentWorkspacePath.segment(0));
//            System.out.println("project.workspace: " + project.getWorkspace());
//            System.out.println("project.workspace.root: " + project.getWorkspace().getRoot());
//            System.out.println("project.workspace.root.location: " + project.getWorkspace().getRoot().getLocation());
//        }

        LocationUpdater.readProjectLocation(project);
    }
}
