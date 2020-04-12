package org.bearsworld.rest.webservice.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;
    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(Integer id) {
        Optional<User> u = users.stream().filter(x -> x.getId().equals(id)).findFirst();
        return u.orElse(null);
    }

    public User deleteById(Integer id) {
        User user = null;
        Iterator<User> i = users.iterator();
        while (i.hasNext()) {
            user = i.next();
            if (user.getId().equals(id)) {
                i.remove();
                return user;
            }
        }
        return null;
    }
}
