package com.github.eclipse.projectlocationupdater.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Requests the new location to the user
 *
 * @author Thomas Calmant
 */
public class LocationUpdateDialog extends TitleAreaDialog {
	/** The modified project */
	private final Collection<IProject> projects;

	/** Current common path part (read only) */
	private final String commonPath;

	/** Workspace root path */
	private final String workspaceRoot;

	/** New common path value */
	private String newPathString;

	/** New common path text field */
	private Text newPathText;

	/**
	 * Instantiate a new location update dialog.
	 *
	 * @param parentShell
	 *            The parent shell
	 * @param projects
	 *            Projects that will be configured
	 */
	public LocationUpdateDialog(final Shell parentShell, final Collection<IProject> projects, final String commonPath) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE);

		// Get the workspace root
		IProject firstProject = projects.iterator().next();
		workspaceRoot = firstProject.getWorkspace().getRoot().getLocation().toString();

		// Copy the projects list
		this.projects = new ArrayList<IProject>(projects);
		this.commonPath = commonPath;
	}

	/**
	 * Shows the common part of the project locations
	 *
	 * @param composite
	 *            Parent composite
	 */
	private void addCommonLocation(final Composite composite) {
		final Label currentLocationLabel = new Label(composite, SWT.NONE);
		currentLocationLabel.setText("Common part of locations:");

		final Text currentLocationText = new Text(composite, SWT.SINGLE
				| SWT.READ_ONLY | SWT.BORDER);
		final GridData gd = new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1);
		gd.widthHint = 40;
		currentLocationText.setLayoutData(gd);
		currentLocationText.setText(commonPath);
	}

	/**
	 * Lets the user enter the new path
	 *
	 * @param composite
	 *            Parent composite
	 */
	private void addNewLocation(final Composite composite) {
		final Label newLocationLabel = new Label(composite, SWT.NONE);
		newLocationLabel.setText("New location:");

		newPathText = new Text(composite, SWT.SINGLE | SWT.BORDER);
		final GridData gd = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd.widthHint = 40;
		newPathText.setLayoutData(gd);
		newPathText.setText(commonPath);

		final Button browseButton = new Button(composite, SWT.NONE);
		browseButton.setText("...");
		browseButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
				// Do nothing
			}

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final DirectoryDialog dd = new DirectoryDialog(composite.getShell(), SWT.OPEN);
				dd.setFilterPath(workspaceRoot);
				final String selected = dd.open();
				if (selected != null) {
					newPathText.setText(selected);
				}
			}
		});
	}

	/**
	 * Shows the list of selected projects
	 *
	 * @param composite
	 *            Parent composite
	 */
	private void addProjectsList(final Composite composite) {
		// Make an array of projects names
		int i = 0;
		final String[] projectNames = new String[projects.size()];
		for (final IProject project : projects) {
			projectNames[i++] = project.getName();
		}

		// Sort it
		Arrays.sort(projectNames);

		// Make the list widget
		final List projectsList = new List(composite, SWT.V_SCROLL);
		for (final String projectName : projectNames) {
			projectsList.add(projectName);
		}

		// Let it have some space
		final GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 3;
		projectsList.setLayoutData(gridData);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.dialogs.TitleAreaDialog#createContents(org.eclipse.
	 * swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(final Composite parent) {
		// Call parent
		final Control content = super.createContents(parent);

		// Set the title
		setTitle("Project location updater");

		// Set the message
		setMessage("Update the location of " + projects.size() + " project(s)");
		return content;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse
	 * .swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(final Composite parent) {
		// Call parent
		final Composite dialogArea = (Composite) super.createDialogArea(parent);

		// Prepare the layout
		final Composite composite = new Composite(dialogArea, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout(3, false));

		// Show the list of the modified projects
		addProjectsList(composite);

		// Current path
		addCommonLocation(composite);

		// New path
		addNewLocation(composite);
		return dialogArea;
	}

	/**
	 * Returns the new location chosen by the user
	 *
	 * @return The new location
	 */
	public String getNewLocation() {
		return newPathString;
	}

	@Override
	protected void okPressed() {
		// Store the field content, while it is not disposed
		newPathString = newPathText.getText();

		super.okPressed();
	}
}
