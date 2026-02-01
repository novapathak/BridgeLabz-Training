package com.bridgelabz.junit;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        ArrayList<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveElement() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        manager.removeElement(list, 10);
        assertEquals(0, list.size());
    }

    @Test
    void testListSize() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, manager.getSize(list));
    }
}
