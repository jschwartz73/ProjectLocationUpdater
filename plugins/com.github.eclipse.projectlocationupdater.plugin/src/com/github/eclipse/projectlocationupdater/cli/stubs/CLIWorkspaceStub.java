package com.github.eclipse.projectlocationupdater.cli.stubs;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.core.runtime.jobs.ISchedulingRule;

import java.io.InputStream;
import java.net.URI;
import java.util.Map;

/**
 * Created by jeff on 6/2/15.
 */
public class CLIWorkspaceStub implements IWorkspace {
    public void addResourceChangeListener(IResourceChangeListener iResourceChangeListener) {

    }

    public void addResourceChangeListener(IResourceChangeListener iResourceChangeListener, int i) {

    }

    public ISavedState addSaveParticipant(Plugin plugin, ISaveParticipant iSaveParticipant) throws CoreException {
        return null;
    }

    public ISavedState addSaveParticipant(String s, ISaveParticipant iSaveParticipant) throws CoreException {
        return null;
    }

    public void build(int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void build(IBuildConfiguration[] iBuildConfigurations, int i, boolean b, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void checkpoint(boolean b) {

    }

    public IProject[][] computePrerequisiteOrder(IProject[] iProjects) {
        return new IProject[0][];
    }

    public ProjectOrder computeProjectOrder(IProject[] iProjects) {
        return null;
    }

    public IStatus copy(IResource[] iResources, IPath iPath, boolean b, IProgressMonitor iProgressMonitor) throws CoreException {
        return null;
    }

    public IStatus copy(IResource[] iResources, IPath iPath, int i, IProgressMonitor iProgressMonitor) throws CoreException {
        return null;
    }

    public IStatus delete(IResource[] iResources, boolean b, IProgressMonitor iProgressMonitor) throws CoreException {
        return null;
    }

    public IStatus delete(IResource[] iResources, int i, IProgressMonitor iProgressMonitor) throws CoreException {
        return null;
    }

    public void deleteMarkers(IMarker[] iMarkers) throws CoreException {

    }

    public void forgetSavedTree(String s) {

    }

    public IFilterMatcherDescriptor[] getFilterMatcherDescriptors() {
        return new IFilterMatcherDescriptor[0];
    }

    public IFilterMatcherDescriptor getFilterMatcherDescriptor(String s) {
        return null;
    }

    public IProjectNatureDescriptor[] getNatureDescriptors() {
        return new IProjectNatureDescriptor[0];
    }

    public IProjectNatureDescriptor getNatureDescriptor(String s) {
        return null;
    }

    public Map<IProject, IProject[]> getDanglingReferences() {
        return null;
    }

    public IWorkspaceDescription getDescription() {
        return null;
    }

    public IWorkspaceRoot getRoot() {
        return null;
    }

    public IResourceRuleFactory getRuleFactory() {
        return null;
    }

    public ISynchronizer getSynchronizer() {
        return null;
    }

    public boolean isAutoBuilding() {
        return false;
    }

    public boolean isTreeLocked() {
        return false;
    }

    public IProjectDescription loadProjectDescription(IPath iPath) throws CoreException {
        return null;
    }

    public IProjectDescription loadProjectDescription(InputStream inputStream) throws CoreException {
        return null;
    }

    public IStatus move(IResource[] iResources, IPath iPath, boolean b, IProgressMonitor iProgressMonitor) throws CoreException {
        return null;
    }

    public IStatus move(IResource[] iResources, IPath iPath, int i, IProgressMonitor iProgressMonitor) throws CoreException {
        return null;
    }

    public IBuildConfiguration newBuildConfig(String s, String s1) {
        return null;
    }

    public IProjectDescription newProjectDescription(String s) {
        return null;
    }

    public void removeResourceChangeListener(IResourceChangeListener iResourceChangeListener) {

    }

    public void removeSaveParticipant(Plugin plugin) {

    }

    public void removeSaveParticipant(String s) {

    }

    public void run(IWorkspaceRunnable iWorkspaceRunnable, ISchedulingRule iSchedulingRule, int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void run(IWorkspaceRunnable iWorkspaceRunnable, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public IStatus save(boolean b, IProgressMonitor iProgressMonitor) throws CoreException {
        return null;
    }

    public void setDescription(IWorkspaceDescription iWorkspaceDescription) throws CoreException {

    }

    public void setWorkspaceLock(WorkspaceLock workspaceLock) {

    }

    public String[] sortNatureSet(String[] strings) {
        return new String[0];
    }

    public IStatus validateEdit(IFile[] iFiles, Object o) {
        return null;
    }

    public IStatus validateFiltered(IResource iResource) {
        return null;
    }

    public IStatus validateLinkLocation(IResource iResource, IPath iPath) {
        return null;
    }

    public IStatus validateLinkLocationURI(IResource iResource, URI uri) {
        return null;
    }

    public IStatus validateName(String s, int i) {
        return null;
    }

    public IStatus validateNatureSet(String[] strings) {
        return null;
    }

    public IStatus validatePath(String s, int i) {
        return null;
    }

    public IStatus validateProjectLocation(IProject iProject, IPath iPath) {
        return null;
    }

    public IStatus validateProjectLocationURI(IProject iProject, URI uri) {
        return null;
    }

    public IPathVariableManager getPathVariableManager() {
        return null;
    }

    public Object getAdapter(Class aClass) {
        return null;
    }
}
