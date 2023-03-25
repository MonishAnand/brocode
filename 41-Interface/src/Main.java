class rabbit implements prey{
    @Override
    public void flee() {
        System.out.println("rabbit flees");
    }
}
class hawk implements predator{
    @Override
    public void hunt() {
        System.out.println("hawk hunts");
    }
}
class fish implements prey,predator{
    @Override
    public void flee() {
        System.out.println("small fish flees");
    }

    @Override
    public void hunt() {
        System.out.println("big fish hunts");
    }
}
public class Main {
    public static void main(String[] args) {
        rabbit r = new rabbit();
        hawk h =new hawk();
        fish f=new fish();
        r.flee();
        h.hunt();
        f.flee();
        f.hunt();
    }
}