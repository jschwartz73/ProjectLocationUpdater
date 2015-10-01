package com.github.eclipse.projectlocationupdater.cli.stubs;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.jobs.ISchedulingRule;

import java.net.URI;
import java.util.Map;

/**
 * Created by jeff on 6/2/15.
 */
public class CLIWorkspaceRootStub implements IWorkspaceRoot {
    public void delete(boolean b, boolean b1, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public IContainer[] findContainersForLocation(IPath iPath) {
        return new IContainer[0];
    }

    public IContainer[] findContainersForLocationURI(URI uri) {
        return new IContainer[0];
    }

    public IContainer[] findContainersForLocationURI(URI uri, int i) {
        return new IContainer[0];
    }

    public IFile[] findFilesForLocation(IPath iPath) {
        return new IFile[0];
    }

    public IFile[] findFilesForLocationURI(URI uri) {
        return new IFile[0];
    }

    public IFile[] findFilesForLocationURI(URI uri, int i) {
        return new IFile[0];
    }

    public IContainer getContainerForLocation(IPath iPath) {
        return null;
    }

    public IFile getFileForLocation(IPath iPath) {
        return null;
    }

    public IProject getProject(String s) {
        return null;
    }

    public IProject[] getProjects() {
        return new IProject[0];
    }

    public IProject[] getProjects(int i) {
        return new IProject[0];
    }

    public boolean exists(IPath iPath) {
        return false;
    }

    public IResource findMember(String s) {
        return null;
    }

    public IResource findMember(String s, boolean b) {
        return null;
    }

    public IResource findMember(IPath iPath) {
        return null;
    }

    public IResource findMember(IPath iPath, boolean b) {
        return null;
    }

    public String getDefaultCharset() throws CoreException {
        return null;
    }

    public String getDefaultCharset(boolean b) throws CoreException {
        return null;
    }

    public IFile getFile(IPath iPath) {
        return null;
    }

    public IFolder getFolder(IPath iPath) {
        return null;
    }

    public IResource[] members() throws CoreException {
        return new IResource[0];
    }

    public IResource[] members(boolean b) throws CoreException {
        return new IResource[0];
    }

    public IResource[] members(int i) throws CoreException {
        return new IResource[0];
    }

    public IFile[] findDeletedMembersWithHistory(int i, IProgressMonitor iProgressMonitor) throws CoreException {
        return new IFile[0];
    }

    public void setDefaultCharset(String s) throws CoreException {

    }

    public void setDefaultCharset(String s, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public IResourceFilterDescription createFilter(int i, FileInfoMatcherDescription fileInfoMatcherDescription, int i1, IProgressMonitor iProgressMonitor) throws CoreException {
        return null;
    }

    public IResourceFilterDescription[] getFilters() throws CoreException {
        return new IResourceFilterDescription[0];
    }

    public void accept(IResourceProxyVisitor iResourceProxyVisitor, int i) throws CoreException {

    }

    public void accept(IResourceProxyVisitor iResourceProxyVisitor, int i, int i1) throws CoreException {

    }

    public void accept(IResourceVisitor iResourceVisitor) throws CoreException {

    }

    public void accept(IResourceVisitor iResourceVisitor, int i, boolean b) throws CoreException {

    }

    public void accept(IResourceVisitor iResourceVisitor, int i, int i1) throws CoreException {

    }

    public void clearHistory(IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void copy(IPath iPath, boolean b, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void copy(IPath iPath, int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void copy(IProjectDescription iProjectDescription, boolean b, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void copy(IProjectDescription iProjectDescription, int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public IMarker createMarker(String s) throws CoreException {
        return null;
    }

    public IResourceProxy createProxy() {
        return null;
    }

    public void delete(boolean b, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void delete(int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void deleteMarkers(String s, boolean b, int i) throws CoreException {

    }

    public boolean exists() {
        return false;
    }

    public IMarker findMarker(long l) throws CoreException {
        return null;
    }

    public IMarker[] findMarkers(String s, boolean b, int i) throws CoreException {
        return new IMarker[0];
    }

    public int findMaxProblemSeverity(String s, boolean b, int i) throws CoreException {
        return 0;
    }

    public String getFileExtension() {
        return null;
    }

    public IPath getFullPath() {
        return null;
    }

    public long getLocalTimeStamp() {
        return 0;
    }

    public IPath getLocation() {
        return null;
    }

    public URI getLocationURI() {
        return null;
    }

    public IMarker getMarker(long l) {
        return null;
    }

    public long getModificationStamp() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public IPathVariableManager getPathVariableManager() {
        return null;
    }

    public IContainer getParent() {
        return null;
    }

    public Map<QualifiedName, String> getPersistentProperties() throws CoreException {
        return null;
    }

    public String getPersistentProperty(QualifiedName qualifiedName) throws CoreException {
        return null;
    }

    public IProject getProject() {
        return null;
    }

    public IPath getProjectRelativePath() {
        return null;
    }

    public IPath getRawLocation() {
        return null;
    }

    public URI getRawLocationURI() {
        return null;
    }

    public ResourceAttributes getResourceAttributes() {
        return null;
    }

    public Map<QualifiedName, Object> getSessionProperties() throws CoreException {
        return null;
    }

    public Object getSessionProperty(QualifiedName qualifiedName) throws CoreException {
        return null;
    }

    public int getType() {
        return 0;
    }

    public IWorkspace getWorkspace() {
        return null;
    }

    public boolean isAccessible() {
        return false;
    }

    public boolean isDerived() {
        return false;
    }

    public boolean isDerived(int i) {
        return false;
    }

    public boolean isHidden() {
        return false;
    }

    public boolean isHidden(int i) {
        return false;
    }

    public boolean isLinked() {
        return false;
    }

    public boolean isVirtual() {
        return false;
    }

    public boolean isLinked(int i) {
        return false;
    }

    public boolean isLocal(int i) {
        return false;
    }

    public boolean isPhantom() {
        return false;
    }

    public boolean isReadOnly() {
        return false;
    }

    public boolean isSynchronized(int i) {
        return false;
    }

    public boolean isTeamPrivateMember() {
        return false;
    }

    public boolean isTeamPrivateMember(int i) {
        return false;
    }

    public void move(IPath iPath, boolean b, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void move(IPath iPath, int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void move(IProjectDescription iProjectDescription, boolean b, boolean b1, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void move(IProjectDescription iProjectDescription, int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void refreshLocal(int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void revertModificationStamp(long l) throws CoreException {

    }

    public void setDerived(boolean b) throws CoreException {

    }

    public void setDerived(boolean b, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public void setHidden(boolean b) throws CoreException {

    }

    public void setLocal(boolean b, int i, IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public long setLocalTimeStamp(long l) throws CoreException {
        return 0;
    }

    public void setPersistentProperty(QualifiedName qualifiedName, String s) throws CoreException {

    }

    public void setReadOnly(boolean b) {

    }

    public void setResourceAttributes(ResourceAttributes resourceAttributes) throws CoreException {

    }

    public void setSessionProperty(QualifiedName qualifiedName, Object o) throws CoreException {

    }

    public void setTeamPrivateMember(boolean b) throws CoreException {

    }

    public void touch(IProgressMonitor iProgressMonitor) throws CoreException {

    }

    public Object getAdapter(Class aClass) {
        return null;
    }

    public boolean contains(ISchedulingRule iSchedulingRule) {
        return false;
    }

    public boolean isConflicting(ISchedulingRule iSchedulingRule) {
        return false;
    }
}
