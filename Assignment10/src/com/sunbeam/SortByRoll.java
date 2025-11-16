package com.sunbeam;

import java.util.Comparator;

class SortByRoll implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class SortByMarks implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getMarks(), s2.getMarks());
    }
}
