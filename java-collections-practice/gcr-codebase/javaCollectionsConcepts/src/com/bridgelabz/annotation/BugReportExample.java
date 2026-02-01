package com.bridgelabz.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

class BugReportExample {

    @Repeatable(BugReports.class)
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface BugReport {
        String description();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface BugReports {
        BugReport[] value();
    }

    static class TestApp {
        @BugReport(description = "Null pointer issue")
        @BugReport(description = "Performance issue")
        void testMethod() {}
    }

    public static void main(String[] args) throws Exception {
        Method method = TestApp.class.getDeclaredMethod("testMethod");
        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : reports) {
            System.out.println(bug.description());
        }
    }
}
