public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ефим";
        post.passport = "5555 № 5555555";
        post.patronymic = "Иванович";
        post.phone = "8 (800)-555-35-35";
        post.surname = "Ефимов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 25;
        post.birthday.month = 11;
        post.birthday.year = 1991;
    }
}