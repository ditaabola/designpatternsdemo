package lv.dita.designpatterns;

public class Artist {

    private String name;
    private String contactEmail;
    private int numberOfMembers;
    private int fee;

    public Artist() {
        super();
    }

    public Artist(String name, String contactEmail, int numberOfMembers, int fee) {
        this();
        this.name = name;
        this.contactEmail = contactEmail;
        this.numberOfMembers = numberOfMembers;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", numberOfMembers=" + numberOfMembers +
                ", fee=" + fee +
                '}';
    }
}
