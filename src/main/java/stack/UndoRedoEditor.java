package main.java.stack;

import java.util.Stack;

public class UndoRedoEditor {
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();
    private String currentText = "";

    public void write(String text) {
        undoStack.push(currentText);
        currentText = text;
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText);
            currentText = undoStack.pop();
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText);
            currentText = redoStack.pop();
        }
    }

    public String getText() {
        return currentText;
    }

    public static void main(String[] args) {
        UndoRedoEditor editor = new UndoRedoEditor();
        editor.write("Hello");
        editor.write("Hello, World!");

        System.out.println(editor.getText()); // Hello, World!
        editor.undo();
        System.out.println(editor.getText()); // Hello
        editor.redo();
        System.out.println(editor.getText()); // Hello, World!
    }
}
