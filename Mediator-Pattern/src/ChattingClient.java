public class ChattingClient {
    public static void main(String[] args) {
        ChatMediator mediator= new Impl();
        User user2 = new UserImpl(mediator,"Akshar");
        User user1 = new UserImpl(mediator,"akaasha");
        User user3 = new UserImpl(mediator,"dipa");
        User user4 = new UserImpl(mediator,"anuj");

        mediator.addUser(user1);
        mediator.addUser(user3);
        mediator.addUser(user2);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
