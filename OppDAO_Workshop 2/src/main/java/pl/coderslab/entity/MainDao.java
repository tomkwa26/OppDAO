package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        User user = new User();
        UserDao userDao = new UserDao();
        User secondUser = new User();

        // testowanie zapisywania nowego obiektu
        user.setUserName("tomasz");
        user.setEmail("tomasz.kwasniak@gmail.com");
        user.setPassword("veryStrongPass");
        userDao.create(user);

        // testowanie zapisywania kolejnego obiektu
        secondUser.setUserName("alina");
        secondUser.setEmail("alina@gamil.com");
        secondUser.setPassword("password11");
        userDao.create(secondUser);

        // testowanie wczytywania obiektu
        User read = userDao.read(1);
        System.out.println(read);
        System.out.println("-------------------------------");

        User readNotExist = userDao.read(4);
        System.out.println(readNotExist);
        System.out.println("-------------------------------");

        // testowanie modyfikacji obiektu
        User userToUpdate = userDao.read(12);
        userToUpdate.setUserName("Marek");
        userToUpdate.setEmail("marek@coderslab.pl");
        userToUpdate.setPassword("strongPass");
        userDao.update(userToUpdate);

        // testowanie metody wyświetlania wszystkich obiektów
        User[] all = userDao.findAll();
        for (User u : all
        ) {
            System.out.println(u);
            System.out.println("-------------------------------");
        }

        // testowanie usuwania obiektu
        userDao.delete(3);
        userDao.delete(6);
    }
}
