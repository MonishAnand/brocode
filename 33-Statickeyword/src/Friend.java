public class Friend {
    String name;
    static int nameoffriend;
    Friend(String name){
        this.name=name;
        nameoffriend++;
    }
    /* static can be used for methods too
    static void displayfriends(){
        System.out.println("you have "+nameoffriend+" friends");
    }*/
    public static void main(String[] args) {
        Friend f1= new Friend("monish");
        Friend f2 = new Friend("yogesh");
        Friend f3 = new Friend("marshal");
        System.out.println(Friend.nameoffriend);
        //Friend.displayfriends();

    }
}