package lv.dita.designpatterns.Gig;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gig {
    private final String name;
    private final LocalDate date;
    private final String type;
    private final String venueName;
    private List<String> artists = new ArrayList<>();

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getVenueName() {
        return venueName;
    }

    public List<String> getArtists() {
        return artists;
    }

   public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("This gig took place in ");
        sb.append(venueName);
        sb.append(" on ");
        sb.append(date);
        if (name != null) {
            sb.append(" named ");
            sb.append(name);
            }
        if (type != null) {
            sb.append(" and is of type ");
            sb.append(type);
        }
        sb.append(".");
        return sb.toString();
    }

    private Gig(GigBuilder builder) {
        this.venueName = builder.venueName;
        this.date = builder.date;
        this.name = builder.name;
        this.type = builder.type;
        this.artists = builder.artists;
    }

    public static class GigBuilder {

        private String name;
        private LocalDate date;
        private String type;
        private String venueName;
        private List<String> artists = new ArrayList<>();

        public GigBuilder(String venueName, LocalDate date) {
            if (venueName == null || date == null) {
                throw new IllegalArgumentException("Venue name and date is mandatory");
            }
            this.venueName = venueName;
            this.date = date;
        }

        public GigBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public GigBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public GigBuilder withArtists(List<String> artists) {
            this.artists = artists;
            return this;
        }

        public Gig build() {
            return new Gig(this);
        }
    }
}
