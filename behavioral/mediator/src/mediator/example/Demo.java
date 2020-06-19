package mediator.example;

import mediator.example.mediator.Editor;
import mediator.example.mediator.Mediator;

import javax.swing.DefaultListModel;

import mediator.example.components.*;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}