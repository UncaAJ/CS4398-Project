public class Job {
    private int jobId;
    private String description;
    private String location;
    private double price;
    private JobStatus status;
    private UserAccount user;
    private Employee employee;

    // Constructors
    public Job() {}

    public Job(int jobId, String description, String location, double price) {
        this.jobId = jobId;
        this.description = description;
        this.location = location;
        this.price = price;
        this.status = JobStatus.PENDING;
    }

    // Method definitions (to be implemented)
    public void assignEmployee(Employee employee) {}
    public void updateStatus(JobStatus status) {}
    public void notifyUser() {}
    public void completeJob() {}
    public void refundUser() {}

    // Getters and Setters
    public int getJobId() { return jobId; }
    public void setJobId(int jobId) { this.jobId = jobId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public JobStatus getStatus() { return status; }
    public void setStatus(JobStatus status) { this.status = status; }

    public UserAccount getUser() { return user; }
    public void setUser(UserAccount user) { this.user = user; }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }
}
