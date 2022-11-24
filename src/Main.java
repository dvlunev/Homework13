public class Main {
    public static void main(String[] args) {
        /* Тренировка
        System.out.println("Тренировка");
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        sarah.increaseAge(31);
        System.out.println(sarah);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иванов Иван", "89250000000");
        phoneBook.addContact("Иванов Иван1", "89250000001");
        phoneBook.addContact("Иванов Иван2", "89250000002");
        phoneBook.addContact("Иванов Иван3", "89250000003");
        phoneBook.addContact("Иванов Иван4", "89250000004");

        phoneBook.printAllContacts();
        System.out.println();

        System.out.println("Текущий размер телефонной книги: " + phoneBook.getCurrentSize());
        System.out.println();

        phoneBook.findContact("Иванов Иван4");
        System.out.println();

        phoneBook.removeContact("Иванов Иван4");
        phoneBook.findContact("Иванов Иван4");

        phoneBook.printAllContacts();
        System.out.println();
        System.out.println("Текущий размер телефонной книги: " + phoneBook.getCurrentSize());
        System.out.println();

        System.out.println(new Contact("Иван Смирнов", "+79210000022"));
        Contact c = new Contact("Петр Сидоров", "+79810000033");
        String s = c.toString();
        System.out.println(s);
        System.out.println();

        Contact c2 = new Contact("Петр Сидоров", "+79810000033");
        System.out.println(c.equals(c2));
        c2 = c;
        System.out.println(c.equals(c2));
        System.out.println(); */
        // ДЗ 1
        System.out.println("ДЗ 1");
        Author authorRowling = new Author("Джоан", "Роулинг");
        Author authorTolsloi = new Author("Лев", "Толстой");
        Book book1 = new Book("Гарри Поттер и Философский камень", authorRowling, 1997);
        Book book2 = new Book("Война и мир", authorTolsloi, 1869);
        System.out.println("Книга 1 - " + book1.getBookName() + ", автор - " + book1.getAuthorName() + " " +
                book1.getAuthorSurName() + ", год публикации - " + book1.getPublishYear());
        System.out.println("Книга 2 - " + book2.getBookName() + ", автор - " + book2.getAuthorName() + " " +
                book1.getAuthorSurName() + ", год публикации - " + book2.getPublishYear());
        book2.setPublishYear(1873);
        System.out.println("Книга 2 - " + book2.getBookName() + ", автор - " + book2.getAuthorName() + " " +
                book2.getAuthorSurName() + ", год публикации - " + book2.getPublishYear());
        System.out.println("Книга 2 - " + book2.getBookName() + ", автор - " + book2.getAuthorName1().getName() + " " +
                book2.getAuthorName1().getSurName() + ", год публикации - " + book2.getPublishYear());
        System.out.println();
        // ДЗ 2
        System.out.println("ДЗ 2");

        System.out.println(authorRowling);
        System.out.println(book1);
        System.out.println();

        System.out.println(authorRowling.equals(authorTolsloi));
        Author authorTolsloi1 = new Author("Лев", "Толстой");
        System.out.println(authorTolsloi.equals(authorTolsloi1));
        System.out.println(book1.equals(book2));
        Book book3 = new Book("Война и мир", authorTolsloi, 1873);
        System.out.println(book2.equals(book3));

        System.out.println(authorTolsloi.hashCode());
        System.out.println(authorTolsloi1.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}