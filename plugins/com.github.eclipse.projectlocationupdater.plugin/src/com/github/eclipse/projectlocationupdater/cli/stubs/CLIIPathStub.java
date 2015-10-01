package com.github.eclipse.projectlocationupdater.cli.stubs;

import org.eclipse.core.runtime.IPath;

import java.io.File;

/**
 * Created by jeff on 6/2/15.
 */
public class CLIIPathStub implements IPath {
    public IPath addFileExtension(String s) {
        return null;
    }

    public IPath addTrailingSeparator() {
        return null;
    }

    public IPath append(String s) {
        return null;
    }

    public IPath append(IPath iPath) {
        return null;
    }

    public String getDevice() {
        return null;
    }

    public String getFileExtension() {
        return null;
    }

    public boolean hasTrailingSeparator() {
        return false;
    }

    public boolean isAbsolute() {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isPrefixOf(IPath iPath) {
        return false;
    }

    public boolean isRoot() {
        return false;
    }

    public boolean isUNC() {
        return false;
    }

    public boolean isValidPath(String s) {
        return false;
    }

    public boolean isValidSegment(String s) {
        return false;
    }

    public String lastSegment() {
        return null;
    }

    public IPath makeAbsolute() {
        return null;
    }

    public IPath makeRelative() {
        return null;
    }

    public IPath makeRelativeTo(IPath iPath) {
        return null;
    }

    public IPath makeUNC(boolean b) {
        return null;
    }

    public int matchingFirstSegments(IPath iPath) {
        return 0;
    }

    public IPath removeFileExtension() {
        return null;
    }

    public IPath removeFirstSegments(int i) {
        return null;
    }

    public IPath removeLastSegments(int i) {
        return null;
    }

    public IPath removeTrailingSeparator() {
        return null;
    }

    public String segment(int i) {
        return null;
    }

    public int segmentCount() {
        return 0;
    }

    public String[] segments() {
        return new String[0];
    }

    public IPath setDevice(String s) {
        return null;
    }

    public File toFile() {
        return null;
    }

    public String toOSString() {
        return null;
    }

    public String toPortableString() {
        return null;
    }

    public IPath uptoSegment(int i) {
        return null;
    }

    public Object clone() {
        return null;
    }
}
