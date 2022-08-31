public class Run {

    public static void main(String[] args) {

        Author John = new Author("John", "Johnson");
        Author Nate = new Author("Nate", "Denver");
        Book Jungle = new Book("Jungle", "Johnson", 2012);
        Book Island = new Book("Island", "Denver", 2014);

        year.setYear(2016); // ТУТ ПОЧЕМУ-ТО ОШИБКА (year)

        System.out.println("John = " + John.getName() + John.getSurname());
        System.out.println("Nate = " + Nate.getName() + Nate.getSurname());
        System.out.println("Jungle = " + Jungle.getName() + John.getSurname() + Jungle.getYear());
        System.out.println("Island = " + Island.getName() + Nate.getSurname() + Island.getYear());
    }
}
