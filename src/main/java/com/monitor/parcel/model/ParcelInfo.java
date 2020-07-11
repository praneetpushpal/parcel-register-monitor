package com.monitor.parcel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ParcelInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trackingId;
	@Column
	String sourceAddress;
	@Column
	private String destinationAddress;
	@Column
	private String itemType;
	@Column
	private String weight;
	@Column
	private String price;
	@Column
	private String pickupDate;
	@Column
	private String expectedDelivery;

	public long getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(long trackingId) {
		this.trackingId = trackingId;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getExpectedDelivery() {
		return expectedDelivery;
	}

	public void setExpectedDelivery(String expectedDelivery) {
		this.expectedDelivery = expectedDelivery;
	}

	@Override
	public String toString() {
		return "Parcel_info [trackingId=" + trackingId + ", source_address=" + sourceAddress + ", destination_address="
				+ destinationAddress + ", item_type=" + itemType + ", weight=" + weight + ", price=" + price
				+ ", pickup_date=" + pickupDate + ", expected_delivery=" + expectedDelivery + "]";
	}

}
