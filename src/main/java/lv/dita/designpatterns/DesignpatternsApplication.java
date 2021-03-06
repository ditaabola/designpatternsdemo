package lv.dita.designpatterns;

import lv.dita.designpatterns.Artist.*;
import lv.dita.designpatterns.Gear.*;
import lv.dita.designpatterns.Gig.*;
import lv.dita.designpatterns.GigRequest.*;
import lv.dita.designpatterns.Venue.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.util.Iterator;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsApplication.class, args);

		System.out.println("Demonstration of Creational - Builder pattern:");
		System.out.println(
				"-----------------------------");

		Gig simpleGig = new Gig.GigBuilder("Depo", LocalDate.now()).build();
		Gig typeGig = new Gig.GigBuilder("Jazzhouse", LocalDate.of(2020, 02, 04)).withType("Jazz event").build();
		Gig namedGig = new Gig.GigBuilder("LMA", LocalDate.of(2020, 4, 5)).withName("The first Spring gig").build();
		System.out.println(simpleGig);
		System.out.println(typeGig);
		System.out.println(namedGig);

		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		System.out.println("Demonstration of Behavioral - Iterator pattern:");
		System.out.println(
				"-----------------------------");

		ManagedArtistRoster managedArtists = new ManagedArtistRoster();
		managedArtists.addArtist(new Artist("Sniedze", "sniedze@sniedze.com", 1, 500));
		managedArtists.addArtist(new Artist("Manta", "manta@manta.com", 4, 700));
		managedArtists.addArtist(new Artist("Juuk", "juuk@juuk,com", 5, 800));
		managedArtists.addArtist(new Artist("Sigma", "sigma@sigma.com", 3, 600));
		managedArtists.addArtist(new Artist("VCP", "vcp@vcp.com", 9, 1500));
		managedArtists.addArtist(new Artist("Prāta Vētra", "pv@pv.com", 4, 6000));

		ManagedArtistIterator iterator = new ManagedArtistIterator(managedArtists.getArtists());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("There are:  " + managedArtists.getArtists().length + " artists in the roster");

		GigArtistList gigArtists = new GigArtistList();
		gigArtists.addArtist("Sniedze", "sniedze@sniedze.com", 1, 500);
		gigArtists.addArtist("Manta", "manta@manta.com", 4, 700);
		gigArtists.addArtist("Juuk", "juuk@juuk,com", 5, 800);
		gigArtists.addArtist("Sigma", "sigma@sigma.com", 3, 600);

		Iterator<Artist> itr = gigArtists.createIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("There are:  " + gigArtists.getArtists().size() + " artists in this gig");

		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		System.out.println("Demonstration of Structural - Composite pattern:");
		System.out.println(
				"-----------------------------");


		CompositeGear gearForBandJuuk = new CompositeGear("Gear for band Juuk: ");
		GearComponent guitar = new GearItem("Guitar");
		GearComponent keyboard = new GearItem("Keyboard");

		CompositeGear percussions = new CompositeGear(" Percussion components: ");
		GearComponent triangle = new GearItem("Triangle");
		GearComponent snareDrum = new GearItem("Snare Drum");

		gearForBandJuuk.addGear(guitar);
		gearForBandJuuk.addGear(keyboard);
		gearForBandJuuk.addGear(percussions);
		percussions.addGear(triangle);
		percussions.addGear(snareDrum);

		String gearJuuk = gearForBandJuuk.printGearItems();
		System.out.println(gearJuuk);

		CompositeGear gearForSniedze = new CompositeGear("Gear for Sniedze: ");
		gearForSniedze.addGear(keyboard);
		String gearSniedze = gearForSniedze.printGearItems();

		System.out.println(gearSniedze);

		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		System.out.println("Demonstration of Structural - Decorator pattern:");
		System.out.println(
				"-----------------------------");

		Venue venue = new JazzVenue();
		System.out.printf("Price of %s is $%.2f %n", venue.getName(), venue.cost());

		venue = new BacklineDecorator(venue);
		System.out.printf("Price of %s is $%.2f %n", venue.getName(), venue.cost());

		venue = new FestivalVenue();
		System.out.printf("Price of %s is $%.2f %n", venue.getName(), venue.cost());
		venue = new BackstageDecorator(venue);
		System.out.printf("Price of %s is $%.2f %n", venue.getName(), venue.cost());
		venue = new BacklineDecorator(venue);
		System.out.printf("Price of %s is $%.2f %n", venue.getName(), venue.cost());

		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		System.out.println("Demonstration of the Behavioral - State pattern:");
		System.out.println(
				"-----------------------------");

		GigRequest request = new GigRequest();
		System.out.println(request);
		request.handleIncomingRequest();
		System.out.println(request);
		request.handleIncomingRequest();
		System.out.println(request);
		request.handleIncomingRequest();
		System.out.println(request);
	}
}