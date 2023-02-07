public abstract class User {
    protected  ChatMediator mediator;
    protected String name;

    public User(ChatMediator media, String name){
        this.mediator = media;
        this.name=name;

    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
