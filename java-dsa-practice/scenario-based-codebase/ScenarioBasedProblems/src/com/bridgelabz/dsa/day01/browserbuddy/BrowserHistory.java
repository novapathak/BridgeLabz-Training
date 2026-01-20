package com.bridgelabz.dsa.day01.browserbuddy;

import java.util.Stack;

public class BrowserHistory {
    PageNode current;
    Stack<String> closedTabs = new Stack<>();
    void visit(String url) {
        PageNode page = new PageNode(url);
        if (current != null) {
            current.next= page;
            page.prev= current;
        }
        current = page;
    }
    void back() {
        if ( current != null && current.prev!= null) {
            current = current.prev;
            System.out.println(current.url);
        }
    }

    void forward() {
        if (  current != null && current.next != null) {
            current = current.next;
            System.out.println( current.url);
        }
    }

    void closeTab() {
        if (current != null) {
            closedTabs.push(current.url);
            current = current.prev;
        }
    }

    void restoreTab() {
        if (!closedTabs.isEmpty()) {
            visit(closedTabs.pop());
        }
    }
}
