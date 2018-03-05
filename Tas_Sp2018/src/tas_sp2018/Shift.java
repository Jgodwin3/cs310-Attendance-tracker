
package tas_sp2018;
import java.util.GregorianCalendar;


public class Shift {
        private int id = 0;
	private String description = "";
	private String start;
        private String stop;
        //private GregorianCalendar start;
	//private GregorianCalendar stop;
	private int interval = 0;
	private int graceperiod = 0;
	private int dock = 0;
        private String lunchstart;
        private String lunchstop;  
        //private GregorianCalendar lunchstart;
	//private GregorianCalendar lunchstop;
	private int lunchdeduct = 0;
	
	/* Default Constructor */
	public Shift(){
		//start = new GregorianCalendar();
		
	}
        /*
	public Shift(int id, String description, GregorianCalendar start, GregorianCalendar stop, 
				 int interval, int graceperiod, int dock, GregorianCalendar lunchstart, 
				 GregorianCalendar lunchstop, int lunchdeduct){
		
		this.id = id;
		this.description = description;
		this.start = start;
		this.stop = stop;
		this.interval = interval;
		this.graceperiod = graceperiod;
		this.dock = dock;
		this.lunchstart = lunchstart;
		this.lunchstop = lunchstop;
		this.lunchdeduct = lunchdeduct;
		
	}
        */
        public Shift(String id, String start, String stop, String lunchstart, String lunchstop){
            this.id = Integer.parseInt(id);
            this.start = start;
            this.stop = stop;
            this.lunchstart = lunchstart;
            this.lunchstop = lunchstop;
        }
        
    public int getId() {
        return id;
    }

    
    public String getDescription() {
        return description;
    }

   
    public String getStart() {
        return start;
    }

   
    public String getStop() {
        return stop;
    }

    
    public int getInterval() {
        return interval;
    }

    
    public int getGraceperiod() {
        return graceperiod;
    }

   
    public int getDock() {
        return dock;
    }

    
    public String getLunchstart() {
        return lunchstart;
    }

    
    public String getLunchstop() {
        return lunchstop;
    }

    
    public int getLunchdeduct() {
        return lunchdeduct;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

    
    public void setStart(String start) {
        this.start = start;
    }

    
    public void setStop(String stop) {
        this.stop = stop;
    }

    
    public void setInterval(int interval) {
        this.interval = interval;
    }

    
    public void setGraceperiod(int graceperiod) {
        this.graceperiod = graceperiod;
    }

    
    public void setDock(int dock) {
        this.dock = dock;
    }

    
    public void setLunchstart(String lunchstart) {
        this.lunchstart = lunchstart;
    }

    
    public void setLunchstop(String lunchstop) {
        this.lunchstop = lunchstop;
    }

    
    public void setLunchdeduct(int lunchdeduct) {
        this.lunchdeduct = lunchdeduct;
    }

    @Override
    public String toString(){
        return "Shift" + id + ":" + start + " - " + stop + " (temp minutes); Lunch: " + lunchstart + " - " + lunchstop + "(temp minutes)";
    }
}
