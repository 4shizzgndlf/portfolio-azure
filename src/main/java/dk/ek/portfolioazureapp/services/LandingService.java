package dk.ek.portfolioazureapp.services;

import dk.ek.portfolioazureapp.repositories.LandingRepository;
import dk.ek.portfolioazureapp.models.User;

import java.util.Map;

public class LandingService {
    private LandingRepository repository = new LandingRepository();
    private Map<Integer, User> allUsers = repository.getAllUsersFromDB();

    public Map<Integer, User> getAllUsers() {
        return allUsers;
    }
}
