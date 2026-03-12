package dk.ek.portfolioazureapp.repositories;

import dk.ek.portfolioazureapp.models.User;
import dk.ek.portfolioazureapp.utility.ConnectionManager;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class LandingRepository {
    private Map<Integer, User> allUsers = new HashMap<>();
    private ConnectionManager conn = new ConnectionManager();

    /* public LandingRepository() {
        InputStream is = getClass()
                .getClassLoader()
                .getResourceAsStream("data/users.csv");

        Scanner scanner = new Scanner(is);
        // Skip the first line of the data file
        scanner.nextLine();
        Integer id = 0;
        while (scanner.hasNextLine()) {
            allUsers.put(id, new User(scanner.nextLine()));
            id++;
        }
        scanner.close();
    } */

    public Map<Integer, User> getAllUsers() {
        return allUsers;
    }

    public Map<Integer, User> getAllUsersFromDB() {
        Map<Integer, User> allUsers = new HashMap<>();

        Connection database = conn.getConnection();
        try {
            PreparedStatement preparedStatement = database.prepareStatement("SELECT * FROM users;");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                allUsers.put(rs.getInt(1), new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println("Could not prepare statement");
        }
        return allUsers;
    }
}
