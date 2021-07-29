package lv.dita.designpatterns;

public class ConfirmedState extends State{
    private GigRequest request;

    public ConfirmedState (GigRequest request){
        this.request = request;
    }

    @Override
    public void handleRequest(){
        System.out.println("Turning this gig into done");
        request.setState(request.getArchivedState());
    }

    @Override
    public String toString() {
        return "This is a confirmed gig";
    }
}
