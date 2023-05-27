import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void shouldFindAll() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie-1");
        manager.addMovie("Movie-2");
        manager.addMovie("Movie-3");

        String[] expected = {"Movie-1", "Movie-2", "Movie-3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie-1");
        manager.addMovie("Movie-2");
        manager.addMovie("Movie-3");

        String[] expected = {"Movie-3", "Movie-2", "Movie-1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitIsFive() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie-1");
        manager.addMovie("Movie-2");
        manager.addMovie("Movie-3");
        manager.addMovie("Movie-4");
        manager.addMovie("Movie-5");

        String[] expected = {"Movie-5", "Movie-4", "Movie-3", "Movie-2", "Movie-1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitIsAboveFive() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie-1");
        manager.addMovie("Movie-2");
        manager.addMovie("Movie-3");
        manager.addMovie("Movie-4");
        manager.addMovie("Movie-5");
        manager.addMovie("Movie-6");
        manager.addMovie("Movie-7");
        manager.addMovie("Movie-8");

        String[] expected = {"Movie-8", "Movie-7", "Movie-6", "Movie-5", "Movie-4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitIsBelowFive() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Movie-1");
        manager.addMovie("Movie-2");
        manager.addMovie("Movie-3");

        String[] expected = {"Movie-3", "Movie-2", "Movie-1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitIsEqualToIndicated() {
        MoviesManager manager = new MoviesManager(4);

        manager.addMovie("Movie-1");
        manager.addMovie("Movie-2");
        manager.addMovie("Movie-3");
        manager.addMovie("Movie-4");

        String[] expected = {"Movie-4", "Movie-3", "Movie-2", "Movie-1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitIsAboveIndicated() {
        MoviesManager manager = new MoviesManager(4);

        manager.addMovie("Movie-1");
        manager.addMovie("Movie-2");
        manager.addMovie("Movie-3");
        manager.addMovie("Movie-4");
        manager.addMovie("Movie-5");

        String[] expected = {"Movie-5", "Movie-4", "Movie-3", "Movie-2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitIsBelowIndicated() {
        MoviesManager manager = new MoviesManager(4);

        manager.addMovie("Movie-1");
        manager.addMovie("Movie-2");
        manager.addMovie("Movie-3");

        String[] expected = {"Movie-3", "Movie-2", "Movie-1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
