
package parkingSpace;


public class ParkingLot {
	
	private String name;
	private String type; 
	
	public ParkingLot(){
		name = "";
		type = "";
	}
	
	public ParkingLot(String pLName, String pLType){
		setName(pLName);
		setType(pLType);
	}
	
	public void setName(String pLName){
		name = pLName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setType(String pLType){
		type = pLType;
	}
	
	public String getType(){
		return type;
	}

}
