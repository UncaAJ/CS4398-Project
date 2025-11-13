import java.util.List;

public class RatingSystem {

    public void rateUser(UserAccount user, double rating) {
        user.setRating(rating);
        System.out.println("Rated user " + user.getName() + " with rating: " + rating);
    }

    public void rateEmployee(Employee employee, double rating) {
        employee.setRating(rating);
        System.out.println("Rated employee " + employee.getName() + " with rating: " + rating);
    }

    public double calculateAverageRating(List<Double> ratings) {
        if (ratings == null || ratings.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double r : ratings) {
            sum += r;
        }

        return sum / ratings.size();
    }
}
