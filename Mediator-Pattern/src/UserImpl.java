public class UserImpl extends User{

    public UserImpl(ChatMediator media, String name) {
        super(media, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+ ": sending message="+msg);
        mediator.sendMessage(msg, this);

    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": recv mesg: "+msg);

    }
}
