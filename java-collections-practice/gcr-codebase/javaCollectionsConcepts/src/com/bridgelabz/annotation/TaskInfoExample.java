package com.bridgelabz.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

class TaskInfoExample {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface TaskInfo {
        String priority();
        String assignedTo();
    }

    static class TaskManager {

        @TaskInfo(priority = "HIGH", assignedTo = "Nova")
        void completeTask() {}
    }

    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getDeclaredMethod("completeTask");
        TaskInfo info = method.getAnnotation(TaskInfo.class);

        System.out.println(info.priority());
        System.out.println(info.assignedTo());
    }
}
