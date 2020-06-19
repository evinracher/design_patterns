package mediator.example.mediator;



import javax.swing.ListModel;

import mediator.example.components.Component;

/**
 * Common mediator interface.
 */
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    @SuppressWarnings("rawtypes")
	void sendToFilter(ListModel listModel);
    @SuppressWarnings("rawtypes")
	void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}