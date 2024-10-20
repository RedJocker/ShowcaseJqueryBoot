package org.example.model.smartphone.internal;

import org.example.model.Browser;

import java.util.ArrayDeque;

public class SmartPhoneBrowser implements Browser {

    private final ArrayDeque<String> deque;

    public SmartPhoneBrowser() {
        this.deque = new ArrayDeque<>();
    }

    @Override
    public void visit(String url) {
        deque.push(url);
        showPage();

    }

    @Override
    public void refresh() {
        System.out.println("refresh");
        showPage();
    }

    @Override
    public void back() {
        System.out.println("back");
        if (!deque.isEmpty())
            deque.pop();
        showPage();
    }

    private void showPage() {
        if (deque.isEmpty())
            System.out.println("no page");
        else
            System.out.printf("visiting url: %s%n", deque.peek());
    }
}