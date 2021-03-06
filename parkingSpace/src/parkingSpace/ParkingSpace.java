package parkingSpace;


public class ParkingSpace {

	private int parkingSpaceNumber;
	private String name;
	private boolean resident, commuter, facStaff, guest, handicap, reserved, occupied;
	private int timeLimit;
	
	public ParkingSpace(){
		setParkingSpaceNumber(0);
		setName("");
		setResident(false);
		setCommuter(false);
		setFacStaff(false);
		setGuest(true);
		setHandicap(false);
		setReserved(false);
		setOccupied(false);
		setTimeLimit(0);
	}
	
	public ParkingSpace(int psn, String n, boolean r, boolean c, boolean fs, boolean g, boolean h, boolean rsv, boolean o, int tl){
		setParkingSpaceNumber(psn);
		setName(n);
		setResident(r);
		setCommuter(c);
		setFacStaff(fs);
		setGuest(g);
		setHandicap(h);
		setReserved(rsv);
		setOccupied(o);
		setTimeLimit(tl);
	}
	
	public void setParkingSpaceNumber(int num){
		parkingSpaceNumber = num;
	}
	
	public int getParkingSpaceNumber(){
		return parkingSpaceNumber;
	}
	
	public void setName(String pSName){
		name = pSName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setResident(boolean r){
		resident = r;
	}
	
	public boolean getResident(){
		return resident;
	}
	
	public void setCommuter(boolean c){
		commuter = c;
	}
	
	public boolean getCommuter(){
		return commuter;
	}
	
	public void setFacStaff(boolean f){
		facStaff = f;
	}
	
	public boolean getFacStaff(){
		return facStaff;
	}
	
	public void setGuest(boolean g){
		guest = g;
	}
	
	public boolean getGuest(){
		return guest;
	}
	
	public void setHandicap(boolean h){
		handicap = h;
	}
	
	public boolean getHandicap(){
		return handicap;
	}
	
	public void setReserved(boolean rsv){
		reserved = rsv;
	}
	
	public boolean getReserved(){
		return reserved;
	}
	
	public void setOccupied(boolean o){
		occupied = o;
	}
	
	public boolean getOccupied(){
		return occupied;
	}
	
	public void setTimeLimit(int tl){
		timeLimit = tl;
	}
	
	public int getTimeLimit(){
		return timeLimit;
	}

	
}
