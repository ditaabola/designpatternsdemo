package lv.dita.designpatterns.GigRequest;

import lv.dita.designpatterns.GigRequest.State;

public class PendingState extends State {

    private GigRequest request;

    public PendingState (GigRequest request){
        this.request = request;
    }

    @Override
    public void handleRequest(){
        System.out.println("Turning this request into confirmed");
        request.setState(request.getConfirmedState());
    }

    @Override
    public String toString() {
        return "This is a pending request";
    }
}
