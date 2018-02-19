package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int uptadeCount;

    public Mentor(String username) {
        this.username = username;
    }

    public void uptade(StudentTasks studentTasks) {
        System.out.println(username + " got a new task to check (" + studentTasks.getKodillaTasks().getLast() + ") from: "
                + studentTasks.getStudentName() + "\n" +
                " (total in que: " + studentTasks.getKodillaTasks().size() + " tasks)");
        uptadeCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUptadeCount() {
        return uptadeCount;
    }
}
