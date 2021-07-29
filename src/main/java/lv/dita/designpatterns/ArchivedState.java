package lv.dita.designpatterns;

public class ArchivedState extends State{

    private GigRequest request;

    public ArchivedState(GigRequest request){
        this.request = request;
    }
    public void handleRequest(){
        System.out.println("Turning this gig into pending");
        request.setState(request.getPendingState());
    }

    @Override
    public String toString() {
        return "This is an archived gig";
    }
}
