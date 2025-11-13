package com.laundryapp.view;

import com.laundryapp.model.*;
import com.laundryapp.service.*;
import com.laundryapp.controller.*;

import java.util.ArrayList;
import java.util.List;

public class LaundryAppMain {

    // === System Entities ===
    private List<UserAccount> users;
    private List<Employee> employees;
    private List<Job> jobs;
    private PaymentSystem paymentSystem;
    private RatingSystem ratingSystem;

    // === Constructors ===
    public LaundryAppMain() {
        users = new ArrayList<>();
        employees = new ArrayList<>();
        jobs = new ArrayList<>();
        paymentSystem = new PaymentSystem();
        ratingSystem = new RatingSystem();
    }

    // === Application Entry Point ===
    public static void main(String[] args) {
        LaundryAppMain app = new LaundryAppMain();
        app.initializeData();
        app.displayMenu();
        app.runApplication();
    }

    // === Initialization ===
    public void initializeData() {
        // Create placeholder users and employees
        UserAccount user1 = new UserAccount(1, "John Doe", "john@example.com", "pass123", "Austin, TX");
        Employee emp1 = new Employee(101, "Jane Smith", "jane@example.com", "securePass");

        PaymentInfo userPayInfo = new PaymentInfo("123456", "Bank of Texas", "111000025", 500.00);
        user1.setPaymentInfo(userPayInfo);

        PaymentInfo empPayInfo = new PaymentInfo("654321", "Chase", "222000077", 0.00);
        emp1.setPayAccount(empPayInfo);

        users.add(user1);
        employees.add(emp1);
    }

    // === Display Menu ===
    public void displayMenu() {
        // Later: provide user options for registering, posting jobs, rating, etc.
    }

    // === Core Application Flow ===
    public void runApplication() {
        // Placeholder: main loop or flow controller
    }

    // === Core System Functionalities (method definitions only) ===

    // User-related methods
    public void registerUser(UserAccount user) {}
    public void updateUser(UserAccount user) {}
    public void deleteUser(UserAccount user) {}

    // Employee-related methods
    public void registerEmployee(Employee employee) {}
    public void updateEmployee(Employee employee) {}
    public void deleteEmployee(Employee employee) {}

    // Job-related methods
    public void createJob(Job job) {}
    public void assignJob(Employee employee, Job job) {}
    public void updateJobStatus(Job job, JobStatus status) {}
    public void completeJob(Job job) {}

    // Payment-related methods
    public void processPayment(UserAccount user, Employee employee, double amount) {}
    public void refundPayment(UserAccount user, double amount) {}

    // Rating-related methods
    public void rateUser(UserAccount user, double rating) {}
    public void rateEmployee(Employee employee, double rating) {}

    // === Utility Methods ===
    public void listUsers() {}
    public void listEmployees() {}
    public void listJobs() {}
}
