package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="list_details")
public class ListDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LIST_ID")
	private int id;
	@Column(name="LIST_NAME")
	private String listName;
	@Column(name="TRIP_DATE")
	private LocalDate tripDate;
	@ManyToOne 
	@JoinColumn(name="SHOPPER_ID")
	private Shopper shopper;
	private List<ListItem> listOfItems;
	
	public ListDetails(int id, String listName, LocalDate tripDate,
			Shopper shopper, List<ListItem> listOfItems) {
		
		this.id = id;
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
		this.listOfItems =listOfItems;
			
	}
	
	public ListDetails(String listName, LocalDate tripDate,	Shopper shopper, List<ListItem> listOfItems) {
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
		this.listOfItems = listOfItems;
	}
	
	public ListDetails(String listName, LocalDate tripDate,	Shopper shopper) {
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
	
	}
	
	//default no arg
	public ListDetails() {
		
	}

	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public LocalDate getTripDate() {
		return tripDate;
	}

	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}

	public Shopper getShopper() {
		return shopper;
	}

	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}

	public List<ListItem> getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(List<ListItem> listOfItems) {
		this.listOfItems = listOfItems;
	}
			
	
	
	
}
