public class Doctor {
   private String did, dname, specilist, appoint, doc_qual;
    int droom;
    
    public String getDid() {
        return did;
    }
    public void setDid(String did) {
//this keyword
        this.did = did;
    }
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getSpecilist() {
        return specilist;
    }
    public void setSpecilist(String specilist) {
        this.specilist = specilist;
    }
    public String getAppoint() {
        return appoint;
    }
    public void setAppoint(String appoint) {
        this.appoint = appoint;
    }
    public String getDoc_qual() {
        return doc_qual;
    }
    public void setDoc_qual(String doc_qual) {
        this.doc_qual = doc_qual;
    }
    public int getDroom() {
        return droom;
    }
    public void setDroom(int droom) {
        this.droom = droom;
    }
    
    public Doctor() {
       
    }
    
    // Constructor Overloading
    public Doctor(String did,String dname,String spec,String appmt,String qul,int room) {
        this.did = did;
    	this.doc_qual= qul;
        this.dname = dname;
        this.doc_qual = qul;
        this.droom = room;
        this.specilist= spec;
        this.appoint= appmt;
    }
    
    public void doctor_info(){
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
    }

}
