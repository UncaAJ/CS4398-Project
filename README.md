# CS4398-Project

Members: Segundo Sanchez, Gentry Rabe, Ricky Mosqueda-Torres

Class Diagram:
<<Model>> LaundryServiceSystem
 ├── <<Entity>> UserAccount
 │     + userId: Integer
 │     + name: String
 │     + email: String
 │     + password: String
 │     + location: String
 │     + paymentInfo: PaymentInfo
 │     + operations:
 │         register(), login(), updateProfile(), deleteAccount(),
 │         postJob(Job), rateEmployee(Employee, Rating),
 │         requestEmployee(Employee), blockEmployee(Employee), bookmarkEmployee(Employee)
 │
 ├── <<Entity>> Employee
 │     + employeeId: Integer
 │     + name: String
 │     + email: String
 │     + password: String
 │     + payAccount: PaymentInfo
 │     + rating: Double
 │     + acceptedJobs: List<Job>
 │     + operations:
 │         register(), acceptJob(Job), updateProfile(),
 │         blockUser(UserAccount), rateUser(UserAccount, Rating),
 │         updateJobStatus(Job, JobStatus)
 │
 ├── <<Entity>> Job
 │     + jobId: Integer
 │     + description: String
 │     + location: String
 │     + price: Decimal
 │     + status: JobStatus
 │     + user: UserAccount
 │     + employee: Employee
 │     + operations:
 │         assignEmployee(Employee), updateStatus(JobStatus),
 │         notifyUser(), completeJob(), refundUser()
 │
 ├── <<ValueObject>> PaymentInfo
 │     + accountNumber: String
 │     + bankName: String
 │     + routingNumber: String
 │     + balance: Decimal
 │     + operations:
 │         deposit(amount: Decimal), withdraw(amount: Decimal), refund(amount: Decimal)
 │
 ├── <<Service>> PaymentSystem
 │     + operations:
 │         processPayment(UserAccount, Employee, Decimal),
 │         refundPayment(UserAccount, Decimal),
 │         calculatePay(Employee)
 │
 ├── <<Service>> RatingSystem
 │     + operations:
 │         rateUser(UserAccount, Rating),
 │         rateEmployee(Employee, Rating),
 │         calculateAverageRating()
 │
 └── <<Enumeration>> JobStatus { PENDING, ACCEPTED, IN_PROGRESS, COMPLETED, REFUNDED }
