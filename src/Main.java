public class Main {
    public static void main(String[] args) {
        Author danDef = new Author("Даниэль", "Дефо");
        Book oneBook = new Book(danDef, "Три мушкетёра", 1844);
        Author arkGay = new Author("Аркадий", "Гайдар");
        Book twoBook = new Book(arkGay, "Школа", 1929);

        System.out.println("=============================================================");
        System.out.println("Автор: " + danDef.getName() + " " + danDef.getSurname());
        System.out.println("Название: " + oneBook.getTitleBook());
        System.out.println("Год написания " + oneBook.getYearPublication());

        System.out.println("=============================================================");
        System.out.println("Автор: " + arkGay.getName() + " " + arkGay.getSurname());
        System.out.println("Название: " + twoBook.getTitleBook());
        System.out.println("Год написания " + twoBook.getYearPublication());

        twoBook.setYearPublication(1930);

        System.out.println("=============================================================");
        System.out.println("Автор: " + danDef.getName() + " " + danDef.getSurname());
        System.out.println("Название: " + oneBook.getTitleBook());
        System.out.println("Год написания " + oneBook.getYearPublication());

        System.out.println("=============================================================");
        System.out.println("Автор: " + arkGay.getName() + " " + arkGay.getSurname());
        System.out.println("Название: " + twoBook.getTitleBook());
        System.out.println("Год написания " + twoBook.getYearPublication());
        System.out.println("=============================================================");
    }
}