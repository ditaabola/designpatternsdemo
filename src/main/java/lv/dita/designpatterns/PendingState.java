package lv.dita.designpatterns;

public class PendingState extends State{

    private GigRequest request;

    public PendingState (GigRequest request){
        this.request = request;
    }

    @Override
    public void handleRequest(){
        System.out.println("Turning gig into confirmed");
        request.setState(request.getConfirmedState());
    }

    @Override
    public String toString() {
        return "This is a pending gig";
    }
}
