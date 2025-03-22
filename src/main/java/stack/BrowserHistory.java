package main.java.stack;

import java.util.Stack;

public class BrowserHistory {
    private final Stack<String> backStack = new Stack<>();
    private final Stack<String> forwardStack = new Stack<>();

    public void visit(String url) {
        backStack.push(url);
        forwardStack.clear(); // Yeni sayfa açınca ileri yığını temizlenir
    }

    public String goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(backStack.pop());
            return backStack.isEmpty() ? "Ana Sayfa" : backStack.peek();
        }
        return "Ana Sayfa";
    }

    public String goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(forwardStack.pop());
            return backStack.peek();
        }
        return "Son sayfa";
    }

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.visit("Google");
        history.visit("YouTube");
        history.visit("GitHub");

        System.out.println(history.goBack());    // YouTube
        System.out.println(history.goBack());    // Google
        System.out.println(history.goForward()); // YouTube
    }
}
